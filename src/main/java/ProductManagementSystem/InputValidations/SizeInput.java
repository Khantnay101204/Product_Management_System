package ProductManagementSystem.InputValidations;

import ProductManagementSystem.UserInput;

public class SizeInput implements UserInput {

    @Override
    public String input() {
        String size="";
        String options[] ={"XS","S","M","L","XL","XXL","Small","Medium","Large","Extra Large","cm", "in","mm"};
        int count=1;
        for (String op: options){
            System.out.println(count+". "+op);
            count++;
        }
        System.out.print("Choose a size above: ");
        String op=sc.nextLine();
        int option=0;
        if (!op.matches("^(1[0-3]|[1-9])$")){
            input();
        }
        else {
             option=Integer.parseInt(op);
        }
        if (option<=10&& option>0){
            size=options[option-1];
        }
        else if(option<=13 && option>=11){
            size=lengthAndWidth()+" "+options[option-1];
        }
        return size;

    }
    private static String lengthAndWidth(){
        System.out.print("Length: ");
        String length=sc.nextLine();
        System.out.print("Width: ");
        String width=sc.nextLine();
        if (!width.matches("^(1000|[1-9][0-9]{0,2})$") || !length.matches("^(1000|[1-9][0-9]{0,2})$")){
            System.out.println("Invalid input. Please try again");
            return lengthAndWidth();
        }

        return length+"x"+width;

    }

//    public static void main(String[] args) {
//        SizeInput in=new SizeInput();
//        String str=in.input();
//        System.out.println(str);
//
//    }
}
