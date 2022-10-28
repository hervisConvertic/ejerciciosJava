import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio_matrizOperaciones {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        //Construir un programa que calcule la suma y producto de dos matrices,
        // una vez obtenidos encontrar el promedio de la suma y del producto.
        //Los elementos son números reales positivos y negativos.
        //NOTA: Para sumar o multiplicar matrices estos deben tener la misma cantidad de elementos.
        // Los elementos se suman o multiplican bajo su misma posición
        //Ejemplo:
        int cantidad, cont_producto=0, cont_suma=0;
        double numero, promedio_suma, promedio_producto, acumula_suma = 0, acumula_producto = 0;
        System.out.println("ingrese la cantidad de posiciones de la matriz:");
        cantidad = consola.nextInt();

        Double[][] matrizA = new Double[cantidad][cantidad];
        Double[][] matrizB = new Double[cantidad][cantidad];
        Double[][] matrizSuma = new Double[cantidad][cantidad];
        Double[][] matrizProducto = new Double[cantidad][cantidad];
        System.out.println("Matriz A");
        for (int i = 0; i < cantidad; i++) {
            for (int j = 0; j < cantidad; j++) {
                numero = (Math.random() * 50 * (Math.random() > 0.5 ? 1 : -1));
                numero = Math.round(numero * 100d) / 100d;
                matrizA[i][j] = numero;
                System.out.print(matrizA[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Matriz B");
        for (int i = 0; i < cantidad; i++) {
            for (int j = 0; j < cantidad; j++) {
                numero = (Math.random() * 50 * (Math.random() > 0.5 ? 1 : -1));
                numero = Math.round(numero * 100d) / 100d;
                matrizB[i][j] = numero;
                System.out.print(matrizB[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("suma de las matices");
        for (int i = 0; i < cantidad; i++) {
            for (int j = 0; j < cantidad; j++) {
                matrizSuma[i][j] = (matrizA[i][j] + matrizB[i][j]);
                System.out.print(matrizSuma[i][j] + " ");
                acumula_suma=acumula_suma+matrizSuma[i][j];
                cont_suma+=1;
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("producto de las matices");
        for (int i = 0; i < cantidad; i++) {
            for (int j = 0; j < cantidad; j++) {
                matrizProducto[i][j] = (matrizA[i][j] * matrizB[i][j]);
                System.out.print(matrizProducto[i][j] + " ");
                acumula_producto = acumula_producto + matrizProducto[i][j];
                cont_producto+=1;
            }
            System.out.println();
        }

        System.out.println();
        promedio_producto=acumula_producto/cont_producto;
        promedio_suma=acumula_suma/cont_suma;
        System.out.println("el promedio del producto es: "+promedio_producto);
        System.out.println("el promedio de la suma es: "+promedio_suma);
        System.out.println(cont_producto);
        System.out.println(cont_suma);

    }
}
