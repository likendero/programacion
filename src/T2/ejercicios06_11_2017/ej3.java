package T2.ejercicios06_11_2017;
/**
 * @Author Sergey Shevchenko
 */
import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        /*
        Escribir numero de dias del mes
         */
        System.out.println("Introduzca el numero del mes.");
        Scanner teclado=new Scanner(System.in);
        int mes=teclado.nextInt();
        switch (mes){
            case 2:
                System.out.println("28 dias");break;
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("31 dias");break;
            case 4: case 6: case 9: case 11:
                System.out.println("30 dias");break;
        }
    }
}
