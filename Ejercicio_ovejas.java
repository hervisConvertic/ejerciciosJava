import java.util.Scanner;

public class Ejercicio_ovejas {
    public static void main(String[] args) {
        //se requiere construir un programa que cuente las ovejas que esta soñando una persona
        Scanner consola = new Scanner(System.in);

        int oveja, cont_oveja=0;
        String estoy_soñando = "si";

        do{
            System.out.println("estoy soñando y voy a contar ovejas: ");

            System.out.println("ingresa la cantidad de ovejas que vas a contar: ");
            oveja=consola.nextInt();
            cont_oveja=cont_oveja+oveja;
            System.out.println("estas soñando si/no");
            estoy_soñando=consola.next();
        }while (estoy_soñando.equals("si"));
        System.out.println("upps, me desperte, conte"+cont_oveja+" ovejas");
    }
}
