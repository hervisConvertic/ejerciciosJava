import java.util.Scanner;

public class Ejercicio_Prueba {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int numero;
        double numeroA;
        double numeroB;
        double promedio;
        for (int i = 0; i < 50; i++) {
            //random que entrega numeros aleatorios positivos y negativos
            numero = (int) (Math.random() * 50 * (Math.random() > 0.5 ? 1 : -1));
            System.out.println(numero);
        }
        System.out.println("ingrese el primer numero");
        numeroA=consola.nextInt();
        System.out.println("ingrese el segundo numero");
        numeroB=consola.nextInt();
        promedio=numeroA/numeroB;
        System.out.println("promedio: "+promedio);

    }

}
