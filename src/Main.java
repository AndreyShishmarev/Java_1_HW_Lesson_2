public class Main {

    public static void main(String[] args) {
        System.out.println("ДЗ № 1");
        invertArray();
        System.out.println();
        System.out.println("ДЗ № 2");
        fillArray();
        System.out.println();
        System.out.println("ДЗ № 3");
        changeArray();
        System.out.println();
        System.out.println("ДЗ № 4");
        fillDiagonal();
        System.out.println();
        System.out.println("ДЗ № 5");
        max_and_min_ArrayElement();
    }

    //1.	Задать целочисленный массив, состоящий из элементов 0 и 1.
    //      Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    //      С помощью цикла и условия заменить 0 на 1, 1 на 0;
    public static void invertArray() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Длинна массива = " + arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else arr[i] = 0;
            System.out.print(" " + arr[i]);
        }
    }

    //2.	Задать пустой целочисленный массив размером 8.
    //      С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
    public static void fillArray() {
        int arr[] = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 3;
            System.out.print(" " + arr[i]);
        }
    }

    //3.	Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
    //      пройти по нему циклом, и числа меньшие 6 умножить на 2;
    public static void changeArray() {
        int[] w = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < w.length; i++) {
            System.out.print(" " + w[i]);
        }
        System.out.println();
        for (int i = 0; i < w.length; i++) {
            if (w[i] < 6) {
                w[i] = w[i] * 2;
            }
            System.out.print(" " + w[i]);
        }
    }

    //4.	Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    //      и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
    public static void fillDiagonal() {
        int[][] arr = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                }
            }
        }
        for (int i = 5; i >= 0; i--) {
            for (int j = 0; j < 6; j++) {
                if (i == (arr.length - 1) - j) {
                    arr[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    //5.	** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
    public static void max_and_min_ArrayElement() {
        int[] arr = {1, -20, 33, 2, 4, 5, 6, 119};
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
            if (arr[i] >= max)
                max = arr[i];
            if (arr[i] <= min)
                min = arr[i];
        }
        System.out.println();
        System.out.println(" Максимальный элемент массива " + max);
        System.out.println(" Минимальный элемент массива " + min);
    }
}
