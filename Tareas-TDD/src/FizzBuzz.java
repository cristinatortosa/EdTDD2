public class FizzBuzz {
    public String calculaCadena(int numero) {
        String numeroCadena;
        if (numero % 3 == 0 && numero % 5 == 0) {
            numeroCadena = "FizzBuzz";
        } else {
            if (numero % 3 == 0) {
                numeroCadena = "Fizz";
            } else if (numero % 5 == 0) {
                numeroCadena = "Buzz";
            } else {
                numeroCadena = String.valueOf(numero);
            }
        }
        return numeroCadena;
    }
}
