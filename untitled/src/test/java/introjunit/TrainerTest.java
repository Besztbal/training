package introjunit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrainerTest {

    @Test
    @DisplayName("Create")
    void testCreate(){
        //Given
        Trainer trainer=new Trainer("John Doe");

        //When
        String name=trainer.getName();

        //Then
        assertEquals("John Doe", name);
    }

}