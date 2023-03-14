public class OperacionesTDD {
    public static int suma(String numero) {
        if (numero.isEmpty()) {
            return 0;
        } else {
            String[] numeros = numero.split(",");
            int suma = 0;
            for (String nums : numeros) {
                if (nums.trim().isEmpty()) {
                    return -1;
                } else {
                    int valor = Integer.parseInt(nums.trim());
                    if (valor < 0) {
                        System.out.println("Numeros negativos no permitidos.");
                        return -1;
                    } else {
                        suma += valor;
                    }
                }
            }
            return suma;
        }
    }
}
