import java.util.Arrays;

public class Zadanie4 {
    public static void main(String[] args) {
        //Дан массив с целыми числами:
        //int[] arr = {1, 2, 3, 0, 4, 5};
        //Выведите в консоль позицию первого нуля.
        int[] array = {1, 2, 3, 0, 4, 5, 0, 2, 0};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                System.out.println("Позиция первого нуля = " + i);
                break;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
