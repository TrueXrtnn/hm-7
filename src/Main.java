public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] number = new int[3];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        float[] numberTwo = {1.57f, 7.654f, 9.986f};
        int[] myNumber = {1, 2, 4, 5, 67, 8, 9, 10};
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] number = new int[3];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        float[] numberTwo = {1.57f, 7.654f, 9.986f};
        int[] myNumber = {1, 2, 4, 5, 67, 8, 9, 10};
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i]);
            if (i < 2) System.out.print(", ");
            else System.out.print(".");
        }
        System.out.println();
        for (int i = 0; i < numberTwo.length; i++) {
            System.out.print(numberTwo[i]);
            if (i < 2) System.out.print(", ");
            else System.out.print(".");
        }
        System.out.println();
        for (int i = 0; i < myNumber.length; i++) {
            System.out.print(myNumber[i]);
            if (i < 7) System.out.print(", ");
            else System.out.print(".");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] number = new int[3];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        float[] numberTwo = {1.57f, 7.654f, 9.986f};
        int[] myNumber = {1, 2, 4, 5, 67, 8, 9, 10};
        for (int i = 2; i >= 0; i--) {
            System.out.print(number[i]);
            if (i > 0) System.out.print(", ");
            else System.out.print(".");
        }
        System.out.println();
        for (int i = numberTwo.length; i > 0; ) {
            i--;
            System.out.print(numberTwo[i]);
            if (i > 0) System.out.print(", ");
            else System.out.print(".");
        }
        System.out.println();
        for (int i = myNumber.length; i > 0; ) {
            i--;
            System.out.print(myNumber[i]);
            if (i > 0) System.out.print(", ");
            else System.out.print(".");
        }
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача 4");
        int[] number = new int[3];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        for (int i = 0; i < number.length; i++) {
            if (number[i]%2 !=0) number[i]=number[i]+1;
            System.out.print(number[i]);
            if (i < 2) System.out.print(", ");
            else System.out.print(".");
        }
    }
}
