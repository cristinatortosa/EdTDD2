public class OperacionesTDD {
    public static int suma(String cadena) {
        if (cadena.isEmpty()) {
            return 0;
        } else {
            String[] numeros = cadena.split(",");
            int suma = 0;
            for (String numero : numeros) {
                if (numero.trim().isEmpty()) {
                    return -1;
                } else {
                    suma += Integer.parseInt(numero.trim());
                }
            }
            return suma;
        }
    }
}
