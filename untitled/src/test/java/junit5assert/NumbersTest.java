package junit5assert;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class NumbersTest {

    @Test
    void testGetEvenNumbers(){
        Numbers number=new Numbers();
        int[] numbers=new int[] {2,5,6,8,3,1,5};
        int[] expected=new int[] {2,0,6,8,0,0,0};

        assertArrayEquals(expected,number.getEvenNumbers(numbers));

    }
}
