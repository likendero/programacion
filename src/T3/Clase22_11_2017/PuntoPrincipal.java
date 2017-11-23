package T3.Clase22_11_2017;

import java.util.Scanner;

public class PuntoPrincipal {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        Punto pun1=new Punto();
        System.out.println("El punto 1 por defecto es "+pun1.toString());
        System.out.println("Introduzca las cordenadas x y y del punto 2");
        Punto pun2=new Punto(entrada.nextInt(),entrada.nextInt());
        System.out.println("El punto 2 es "+pun2.toString());
        System.out.println("Las coordenadas del punto 2 se copiaran en el punto 3");
        Punto pun3=new Punto(pun2);
        System.out.println("El punto 3 es "+pun3.toString());
        System.out.println("La distancia entre el punto 1 y 2 es "+pun1.distancia(pun2));
        System.out.println("El punto medio entre el punto 1 y 3 es "+pun1.puntoMedio(pun3));

    }
}
