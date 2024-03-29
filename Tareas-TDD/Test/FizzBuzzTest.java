import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

class FizzBuzzTest {
    @Test
    void testPaso1Devuelve1EnCadena() {
        //Arrange
        FizzBuzz fizzBuzz = new FizzBuzz();
        //Assert                   //Act
        assertEquals("1", fizzBuzz.calculaCadena(1));
    }
    @Test
    void testPaso2Devuelve2EnCadena() {
        //Arrange
        FizzBuzz fizzBuzz = new FizzBuzz();
        //Assert                   //Act
        assertEquals("2", fizzBuzz.calculaCadena(2));
    }
    @Test
    void testPaso3DevuelveFizz() {
        //Arrange
        FizzBuzz fizzBuzz = new FizzBuzz();
        //Assert                   //Act
        assertEquals("Fizz", fizzBuzz.calculaCadena(3));
    }
    @Test
    void testPaso4Devuelve4EnCadena() {
        //Arrange
        FizzBuzz fizzBuzz = new FizzBuzz();
        //Assert                   //Act
        assertEquals("4", fizzBuzz.calculaCadena(4));
    }
    @Test
    void testPaso5DevuelveBuzz() {
        //Arrange
        FizzBuzz fizzBuzz = new FizzBuzz();
        //Assert                     //Act
        assertEquals("Buzz", fizzBuzz.calculaCadena(5));
    }
    @Test
    void testPaso6DevuelveFizz() {
        //Arrange
        FizzBuzz fizzBuzz = new FizzBuzz();
        //Assert                     //Act
        assertEquals("Fizz", fizzBuzz.calculaCadena(6));
    }
    @Test
    void testPaso7y8y9Devuelve7y8EnCadenaYFizz() {
        //Arrange
        FizzBuzz fizzBuzz = new FizzBuzz();
        //Assert                     //Act
        assertEquals("7", fizzBuzz.calculaCadena(7));
        assertEquals("8", fizzBuzz.calculaCadena(8));
        assertEquals("Fizz", fizzBuzz.calculaCadena(9));
    }
    @Test
    void testPaso10DevuelveBuzz() {
        //Arrange
        FizzBuzz fizzBuzz = new FizzBuzz();
        //Assert                     //Act
        assertEquals("Buzz", fizzBuzz.calculaCadena(10));
    }
    @Test
    void testPaso11y12y13y14Devuelve11y12y14EnCadenaYBuzz() {
        //Arrange
        FizzBuzz fizzBuzz = new FizzBuzz();
        //Assert                     //Act
        assertEquals("11", fizzBuzz.calculaCadena(11));
        assertEquals("Fizz", fizzBuzz.calculaCadena(12));
        assertEquals("13", fizzBuzz.calculaCadena(13));
        assertEquals("14", fizzBuzz.calculaCadena(14));
    }
    @Test
    void testPaso15DevuelveFizzBuzz() {
        //Arrange
        FizzBuzz fizzBuzz = new FizzBuzz();
        //Assert                     //Act
        assertEquals("FizzBuzz", fizzBuzz.calculaCadena(15));
    }
}