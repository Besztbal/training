package junit5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GentlemanTest {

    @Test
    @DisplayName("With name")
    void testSayHelloWithNormalName(){
        //Given
       String name="John Doe";

        //When
        String greeting=new Gentleman().sayHello(name);

        //Then
        assertEquals("Hello John Doe", greeting);
    }
    @Test
    @DisplayName("Without name")
    void testSayHelloWithNull(){
        //Given
        String name=null;

        //when
        String greeting=new Gentleman().sayHello(name);

        //Then
        assertEquals("Hello Anonymus", greeting);
    }
}
