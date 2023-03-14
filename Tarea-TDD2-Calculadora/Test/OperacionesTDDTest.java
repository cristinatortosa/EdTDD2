import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperacionesTDDTest {
    @Test
    void testAlNoIntroducirUnNumeroDevuelve0() {
        //Assert
        assertEquals(0, OperacionesTDD.suma(""));
    }
    @Test
    void testAlIntroducir1Devuelve1() {
        //Assert
        assertEquals(1, OperacionesTDD.suma("1"));
    }
}