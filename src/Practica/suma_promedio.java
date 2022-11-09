package Practica;

import java.util.Scanner;

public class suma_promedio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Programa que me calcula el promedio de n notas");
        System.out.println("Cuantas notas quiere ingresar");
        System.out.println("ingrese cuantas  notas desea ingresar");
        int a;
        a = sc.nextInt();

        int n[] = new int[a];
        int con = 0;

        while (con != n.length) {
            System.out.println("Ingresame la nota"+(con+1));
            n[con] = sc.nextInt();
            con++;
        }
        int suma=0;
        con=0;
        while (con!=a) {
            suma=suma+n[con];
            con++;
            
        }
        
        float promedio = suma / n.length;

        System.out.println("promedio: " + promedio);
    }

}
