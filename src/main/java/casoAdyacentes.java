import java.util.Arrays;
import java.util.Scanner;
public class casoAdyacentes {
    public static void main(String[] args) {
        int[] array = entradaArray(entradaLargoArray());
        System.out.print(productoAdyacentes(array));
    }
    public static int entradaLargoArray() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el largo del array: ");
        return entrada.nextInt();
    }
    public static int[] entradaArray(int largo) {
        Scanner entrada = new Scanner(System.in);
        int[] arreglo = new int[largo];
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("Ingrese el valor de la posición " + i + ": ");
            arreglo[i] = entrada.nextInt();
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