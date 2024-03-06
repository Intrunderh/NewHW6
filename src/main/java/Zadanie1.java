import java.util.Arrays;

public class Zadanie1 {
    public static void main(String[] args) {
        // Дан массив с числами:
        //int[] arr = {1, 2, 3, 4, 5};
        //Слейте элементы этого массива в строку:
        //"12345"
        int[] array = {1, 2, 3, 4, 5};
        String stroka = "";
        for (int i = 0; i < array.length; i++) {
            stroka = stroka + String.valueOf(array[i]);
        }
        System.out.println(stroka);
    } // решил примерно так, но String.valueOf нашел в интернете. Не проходили.
}
