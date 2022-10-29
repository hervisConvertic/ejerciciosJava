import java.util.Random;
import java.util.Scanner;

public class Ejercicio_sumaMayores_menores {
    public static void main(String[] args) {
        //Hacer un algoritmo que encuentre la suma de los valores mayores y menores
        // entre un grupo de datos positivos. Se debe indicar cuáles fueron esos números.
        Scanner consola = new Scanner(System.in);
        int cantidad = 0, num, fisrt = 0, second = 0;

        System.out.println("ingrese la cantidad de numeros");
        cantidad = consola.nextInt();
        int[] numeros = new int[cantidad];

        for (int i = 0; i < cantidad; i++) {
            do {
                Random rnd = new Random();
                num = rnd.nextInt(100);
            } while (num == 0);
            numeros[i] = num;
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < cantidad-1 ; i++) {
            for (int j = 0; j < cantidad-1; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    second = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = second;
                }
            }
        }
        System.out.println();
        for (int elemento : numeros) {
            System.out.print(elemento + " ");
        }
        System.out.println();
        for (int i = cantidad-1; i>=0; i--) {
            System.out.print(numeros[i]+" ");
        }
        System.out.println();
        System.out.println(numeros[cantidad-2]);
        System.out.println(numeros[cantidad-1]);
        System.out.println(numeros[0]);
        System.out.println(numeros[1]);
    }

}


