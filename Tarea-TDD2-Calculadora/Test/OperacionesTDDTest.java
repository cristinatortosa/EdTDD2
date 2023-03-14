import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperacionesTDDTest {
    @Test
    void testAlNoIntroducirUnNumeroDevuelve0() {
        //Assert                //Act
        assertEquals(0, OperacionesTDD.suma(""));
    }
    @Test
    void testAlIntroducir1Devuelve1() {
        //Assert                //Act
        assertEquals(1, OperacionesTDD.suma("1"));
    }
    @Test
    void testAlIntroducir1y2Devuelve3() {
        //Assert                //Act
        assertEquals(3, OperacionesTDD.suma("1,2"));
    }
    @Test
    void testAlIntroducir1y1yy2Devuelve4() {
        //Assert                //Act
        assertEquals(4, OperacionesTDD.suma("1,1,2"));
    }
    @Test
    void testAlIntroducirUnaComaSinNumeroDetrasDevuelveMenos1() {
        //Assert                //Act
        assertEquals(-1, OperacionesTDD.suma("1, 1, 2, "));
    }
    @Test
    void testAlIntroducirUnNumeroNegativoDevuelveUnErrorYMenos1() {
        //Assert                //Act
        assertEquals(-1, OperacionesTDD.suma("1, 1, -2"));
    }
}