import java.util.Random;
import java.util.Scanner;

public class Ejercicio_pares_impares {
    public static void main(String[] args) {

        //Construir un algoritmo que almacene una cantidad n de números pares y otra cantidad z de
        // números impares ingresados por el usuario. Se deben unir ambas cantidades de números
        // encontrados de manera intercalada y mostrar su resultado.
        String condicion_par = "si";
        String condicion_impar = "si";
        int numero, n, z, j, a = 0, b = 0, con_total = 0;
        Scanner consola = new Scanner(System.in);

        do{
            System.out.println("ingrese la cantidad n de numeros pares mayores de 0");
            n = consola.nextInt();
        }while (n<0);
        do{
            System.out.println("ingrese una cantidad z de numeros impares mayores de 0");
            z = consola.nextInt();
        }while (z<0);


        j = n + z;

        int[] pares = new int[n];
        int[] impares = new int[z];
        int[] total = new int[j];

        for (int i = 0; i < n; i++) {
            do {
                Random rnd = new Random();
                numero = rnd.nextInt(50);
            } while (numero % 2 != 0 || numero == 0);
            pares[i] = numero;
            System.out.println("par " + pares[i]);
        }
        for (int i = 0; i < z; i++) {
            do {
                Random rnd = new Random();
                numero = rnd.nextInt(50);
            } while (numero % 2 == 0 || numero == 0);
            impares[i] = numero;
            System.out.println("impar " + impares[i]);
        }
        System.out.println("vector total: ");
        while (con_total < j) {
            condicion_par = "si";
            condicion_impar = "si";

            //ingresa numero par
            if (a < n) {
                do {
                    total[con_total] = pares[a];
                    con_total = con_total + 1;
                    a = a + 1;
                    condicion_par = "no";

                } while (condicion_par.equals("si"));
            }

            //ingresa numero  impar
            if (b < z) {
                do {
                    total[con_total] = impares[b];
                    con_total = con_total + 1;
                    b = b + 1;
                    condicion_impar = "no";
                } while (condicion_impar.equals("si"));
            }
        }
        for (int elemento : total) {
            System.out.print(elemento + " ");
        }
    }
}

