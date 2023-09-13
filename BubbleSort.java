package J4V4.BubbleSort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        // int[] lista = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
        int[] lista = { 1, 2, 4, 7, 9, 5 };
        int i, j, temp;
        boolean done;

        for (i = 0; i < lista.length - 1; i++) {
            done = true;
            for (j = 0; j < lista.length - i - 1; j++) {

                if ((lista[j]) > (lista[j + 1])) {
                    temp = lista[j];
                    lista[j] = lista[j + 1];
                    lista[j + 1] = temp;
                    done = false;
                }

            }
            System.out.println(Arrays.toString(lista));
            if (done) {
                System.out.println("Ordenaçao concluída: break!");
                break;
            }

        }

    }

}
