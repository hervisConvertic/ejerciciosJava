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
        int cantidad;
        double numero,promedio_suma,promedio_producto;
        System.out.println("ingrese la cantidad de posiciones de la matriz:");
        cantidad = consola.nextInt();

        Double[][] matrizA = new Double[cantidad][cantidad];
        Double[][] matrizB = new Double[cantidad][cantidad];
        Double[][] matrizSuma = new Double[cantidad][cantidad];
        Double[][] matrizProducto = new Double[cantidad][cantidad];

        for(int i=0;i<cantidad;i++){
            for(int j=0;j<cantidad;j++){
                    Random rnd = new Random();
                    numero = rnd.nextDouble()*100;
                matrizA[i][j]=numero;
                System.out.print(matrizA[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Matriz A");
        for(int i=0;i<cantidad;i++){
            for(int j=0;j<cantidad;j++){
                Random rnd = new Random();
                numero = rnd.nextDouble()*100*-1;

                matrizB[i][j]=numero;
                System.out.print(matrizB[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("MatriZB");
        System.out.println("suma de las matices");
        for(int i=0;i<cantidad;i++){
            for(int j=0;j<cantidad;j++){
                matrizSuma[i][j]=(matrizA[i][j]+matrizB[i][j]);
                System.out.print(matrizSuma[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("producto de las matices");
        for(int i=0;i<cantidad;i++){
            for(int j=0;j<cantidad;j++){
                matrizProducto[i][j]=(matrizA[i][j]*matrizB[i][j]);
                System.out.print(matrizProducto[i][j]+" ");
            }
            System.out.println();
        }

    }
}
