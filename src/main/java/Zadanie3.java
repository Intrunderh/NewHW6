import java.util.Arrays;

public class Zadanie3 {
    public static void main(String[] args) {
        //Дан массив:
        //int[] [1, 2, 3, 4, 5, 6]
        //Получите из него следующий срез:
        //int[] [1, 2, 3]

//        for (int i : array) {
//            if (i <= 4) {
//                System.out.println(array[i]);
//            }
//        }
        int[] array = {1, 2, 3, 4, 5, 6};
        for (int i = 0; i < 3; i++) {
            System.out.print(array[i] + ", ");
        }
    }
}
