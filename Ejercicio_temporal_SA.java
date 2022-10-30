import java.util.Random;
import java.util.Scanner;

public class Ejercicio_temporal_SA {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        double salario, dias_laborados, auxilio_transporte, liquidacion, prima, cesantias, intereses, vacaciones,dato;
        String nombre = "",dato_nom;
        int cantidadEmpleados,cont=0;

        System.out.println("Ingrese la cantidad de empleados:");
        cantidadEmpleados = consola.nextInt();

        double[] salar = new double[cantidadEmpleados];
        double[] aux_trans = new double[cantidadEmpleados];
        double[] dias_lab = new double[cantidadEmpleados];
        double[] liquidac = new double[cantidadEmpleados];
        double[] prim = new double[cantidadEmpleados];
        double[] cesant = new double[cantidadEmpleados];
        double[] inter = new double[cantidadEmpleados];
        double[] vacacio = new double[cantidadEmpleados];
        String[] nom = new String[cantidadEmpleados];


        for (int i = 0; i < cantidadEmpleados; i++) {
            cont = cont + 1;
            System.out.println("Ingrese el nombre del empleado-"+cont);
            nombre=consola.next();
            nom[i]=nombre;
            System.out.println("Ingrese el salario del empleado-" + cont);
            salario = consola.nextDouble();
            salar[i] = salario;
            System.out.println("Ingrese auxilio de transporte del empleado-" + cont);
            auxilio_transporte = consola.nextDouble();
            aux_trans[i] = auxilio_transporte;
            System.out.println("Ingrese los dias laborados del empleado-" + cont);
            dias_laborados = consola.nextDouble();
            dias_lab[i] = dias_laborados;
            prima = ((salar[i] + aux_trans[i]) * dias_lab[i])/360;
            prima=Math.round(prima*100d)/100d;
            prim[i] = prima;
            cesantias = (salar[i] * dias_lab[i]) / 360;
            cesantias=Math.round(cesantias*100d)/100d;
            cesant[i] = cesantias;
            intereses = (cesant[i] * 0.012) / dias_lab[i];
            intereses=Math.round(intereses*100d)/100d;
            inter[i] = intereses;
            vacaciones = (salar[i] * dias_lab[i]) / 720;
            vacaciones=Math.round(vacaciones*100d)/100d;
            vacacio[i] = vacaciones;
            liquidac[i]=(prim[i]+cesant[i]+inter[i]+vacacio[i]);
        }
        cont = 0;
        for (int i = 0; i < cantidadEmpleados; i++) {
            cont = cont + 1;
            System.out.println("El nomre de empleado-"+cont+": "+nom[i]);
            System.out.println("El salario del empleado-" + cont+": "+salar[i]);
            System.out.println("El auxilio de transporte del empleado-" + cont+": "+aux_trans[i]);
            System.out.println("Los dias laborados del empleado-" + cont+": "+dias_lab[i]);
            System.out.println("La prima del empleado-" + cont+": "+prim[i]);
            System.out.println("Las cesantias del empleado-" + cont+": "+cesant[i]);
            System.out.println("Los intereses de cesantias del empleado-" + cont+": "+inter[i]);
            System.out.println("Las vaciones del empleado-" + cont+": "+vacacio[i]);
            System.out.println("La liquidacion del empleado-" + cont+": "+liquidac[i]);
            System.out.println("-------------------------------------------");
        }
        System.out.println();
        System.out.println();
        for (int i = 0; i < cantidadEmpleados-1 ; i++) {
            for (int j = 0; j < cantidadEmpleados-1; j++) {
                if (liquidac[j] > liquidac[j + 1]) {
                    dato = liquidac[j];
                    dato_nom=nom[j];
                    liquidac[j] = liquidac[j + 1];
                    nom[j]=nom[j+1];
                    liquidac[j + 1] = dato;
                    nom[j+1]=dato_nom;
                }
            }
        }
        for (double elemento : liquidac) {
            System.out.print(elemento + " ");
        }
        System.out.println();
        System.out.println("la tercera mejor liquidacion es "+(liquidac[cantidadEmpleados-3]=Math.round(liquidac[cantidadEmpleados-3]*100d)/100d));
        System.out.println("el tercer empleado con la mejor liquidacion es: "+nom[cantidadEmpleados-3]);
    }
}
