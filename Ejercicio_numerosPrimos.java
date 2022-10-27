public class Ejercicio_numerosPrimos {
    public static void main(String[] args) {
        //Construir un programa que permita identificar los números primos entre el 1 y 40.
        // Mostrar la cantidad y cuáles son los números primos menores de 20 y los mayores de 20

        int cantidad = 1, cont = 0;
        System.out.println("numero primo menor de 20: 1");
        for (int i = 1; i < 40; i++) {
            cont = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    cont = cont + 1;
                }
            }
            if (cont == 2) {
                cantidad = cantidad + 1;
                if (i < 20) {
                    System.out.println("numero primo menor de 20: " + i);
                }
                if (i > 20) {
                    System.out.println("numero primo mayor de 20: " + i);
                }
            }
        }
        System.out.println("cantidad de numeros primos es " + cantidad);
    }
}
