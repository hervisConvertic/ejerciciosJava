import java.util.Random;
import java.util.Scanner;

public class Ejercicio_pares_impares {
    public static void main(String[] args) {

        //Construir un algoritmo que almacene una cantidad n de números pares y otra cantidad z de
        // números impares ingresados por el usuario. Se deben unir ambas cantidades de números
        // encontrados de manera intercalada y mostrar su resultado.

        int numero, cantidad;
        Scanner consola = new Scanner(System.in);
        System.out.println("ingrese la cantidad de numeros");
        cantidad = consola.nextInt();
        int[] pares = new int[cantidad];
        int[] impares = new int[cantidad];
        int[] total = new int[cantidad * 2];

        for (int i = 0; i < cantidad; i++) {
            do {
                Random rnd = new Random();
                numero = rnd.nextInt(50);
            } while (numero % 2 != 0);
            pares[i] = numero;
            System.out.println("par " + pares[i]);
        }
        for (int i = 0; i < cantidad; i++) {
            do {
                Random rnd = new Random();
                numero = rnd.nextInt(50);
            } while (numero % 2 == 0);
            impares[i] = numero;
            System.out.println("impar " + impares[i]);
        }
        int j=0;
        for (int i = 0; i < cantidad; i++) {

            total[j] = pares[i];
            j = j + 1;
            total[j] = impares[i];
            j = j + 1;
        }
        for (int i = 0; i < cantidad*2; i++) {
            System.out.println("arreglo intercalado "+total[i]);
        }
    }
}
