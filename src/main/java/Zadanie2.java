import java.util.Arrays;

public class Zadanie2 {
    public static void main(String[] args) {
        //Дан массив с целыми числами:
        //int[] {1, 2, 3, 4, 5};
        //Поменяйте местами первый и второй элементы этого массива:
        //int[] {2, 1, 3, 4, 5};
        int[] array = {1, 2, 3, 4, 5};
        int temp = array[1]; // во временную кладем 2
        array[1] = array[0]; // в 2 кладем 1
        array[0] = temp; // в 1 кладем временную, которая является 2
        System.out.println(Arrays.toString(array));
    }
}
