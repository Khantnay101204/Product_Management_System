package ProductManagementSystem;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.InputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class PriceInputTest {
    PriceInput uin;
    InputStream inputStream;
    @BeforeEach
    void setUp() {
        uin=new PriceInput();
        inputStream = System.in;
    }

    @AfterEach
    void tearDown() {

            System.setIn(inputStream);
    }

    @Test
    @DisplayName("Test Price input")
    void input() {
        Scanner sc=new Scanner("1000");
        String price=uin.input(sc);
        assertEquals("1000",price);
    }
}