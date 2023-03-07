public class FizzBuzz {
    public String calculaCadena(int numero) {
        String numeroCadena;
        if (numero % 3 == 0) {
            numeroCadena = "Fizz";
        } else if (numero == 5) {
            numeroCadena = "Buzz";
        } else {
            numeroCadena = String.valueOf(numero);
        }
        return numeroCadena;
    }
}
