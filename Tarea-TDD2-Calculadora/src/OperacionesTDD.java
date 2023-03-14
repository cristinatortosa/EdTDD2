public class OperacionesTDD {
    public static int suma(String numero) {
        int suma = 0;
        String[] numeros = numero.split("\\D+");
        for (int i = 0; i < numeros.length; i++) {
            if (!numero.isEmpty()) {
                suma += Integer.parseInt(numeros[i]);
            }
        }
        return suma;
    }
}
