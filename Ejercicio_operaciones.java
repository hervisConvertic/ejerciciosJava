import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Ejercicio_operaciones {
    public static void main(String[] args) {
        //Escriba un algoritmo que, dados dos valores A y B, encuentre:
        Scanner consola = new Scanner(System.in);
        Double A;
        Double B;
        Double suma_A_B;
        Double suma_B_A;
        Double resta_A_B;
        Double resta_B_A;
        Double producto;
        Double div;
        Double mod_A_B;
        Double mod_B_A;
        Double raizB;
        do {
            System.out.println("ingrese el valor de A, ser diferente de '0'");
            A = consola.nextDouble();
        } while (A == 0);
        do {
            System.out.println("ingrese el valor de B, ser diferente de '0'");
            B = consola.nextDouble();
        } while (B == 0);

        suma_A_B = A + B;
        suma_B_A = B + A;
        resta_A_B = A - B;
        resta_B_A = B - A;
        producto = A * B;
        div = A / B;
        mod_B_A = B % A;
        mod_A_B = A % B;
        mod_B_A = B % A;
        raizB= Math.pow(A,1/B);



        System.out.println("la suma de A+B es: " + suma_A_B);
        System.out.println("la suma de B+A es: " + suma_B_A);
        System.out.println("la resta de A-B es: " + resta_A_B);
        System.out.println("la resta de B-A es: " + resta_B_A);
        System.out.println("la multiplicacion A*B es: " + producto);
        System.out.println("la division A/B es: " + div);
        System.out.println("la modulo A%B es: " + mod_A_B);
        System.out.println("la modulo A%B es: " + mod_B_A);
        System.out.println("la cuadrada de A es: " + raizB);
    }
}
