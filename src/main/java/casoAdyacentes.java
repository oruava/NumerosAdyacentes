package org.example;
import java.util.Scanner;

public class casoAdyacentes {
    public static void main(String[] args) {
        int[] array = entradaArray(entradaLargoArray());
        System.out.println("El mayor resultado de la multiplicación entre 2 numeros adyacentes es de: ");
        System.out.print(productoAdyacentes(array));
    }
    public static int entradaLargoArray() {
        boolean esNumero;
        int largo=0;
        Scanner sc = new Scanner(System.in);
        do{
            try{
                esNumero=true;
                System.out.print("Ingrese el largo del array: ");
                largo = sc.nextInt();
            } catch (Exception e){
                sc.next();
                System.out.println("Tienen que ser numeros enteros, ingreselos nuevamente");
                esNumero=false;
            }
        } while(!esNumero);
        while (largo<2){
            System.out.println("No es valido un largo de "+largo+", ingrese un largo mayor que 1:");
            largo=sc.nextInt();
        }
        return largo;
    }
    public static int[] entradaArray(int largo) {
        boolean esNumero;
        Scanner sc = new Scanner(System.in);
        int[] arreglo = new int[largo];
        for (int i = 0; i < arreglo.length; i++) {
            do{
                try{
                    esNumero=true;
                    System.out.print("Ingrese el valor de la posición " + (i+1) + ": ");
                    arreglo[i] = sc.nextInt();
                } catch (Exception e){
                    sc.next();
                    System.out.println("Tienen que ser numeros enteros, ingreselos nuevamente");
                    esNumero=false;
                }
            } while(!esNumero);
        }
        return arreglo;
    }
    public static int productoAdyacentes(int[] arrayNum) {
        int producto = arrayNum[0] * arrayNum[1];
        for (int i = 0; i < arrayNum.length - 1; i++) {
            if (arrayNum[i] * arrayNum[i+1] > producto) {
                producto = arrayNum[i] * arrayNum[i+1];
            }
        }
        return producto;
    }
}