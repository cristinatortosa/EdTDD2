public class FizzBuzz {
    public String calculaCadena(int numero) {
        String numeroCadena;
        if (numero == 3) {
            numeroCadena = "Fizz";
        } else {
            numeroCadena = String.valueOf(numero);
        }
        return numeroCadena;
    }
}
