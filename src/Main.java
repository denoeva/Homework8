import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        int [] intArray = new int[3];
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;
        double[] doubleArray = {1.57, 7.654, 9.968};
        char [] myArray = {'j', 'a', 'v', 'a'};
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int [] intArray = new int[3];
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;
        double[] doubleArray = {1.57, 7.654, 9.968};
        char [] myArray = {'j', 'a', 'v', 'a'};
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i]);
            if (i != intArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < doubleArray.length; i++) {
            System.out.print(doubleArray[i]);
            if (i != doubleArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i]);
            if (i != myArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int [] intArray = new int[3];
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;
        double[] doubleArray = {1.57, 7.654, 9.968};
        char [] myArray = {'j', 'a', 'v', 'a'};
        for (int i = intArray.length - 1; i >= 0; i--) {
            System.out.print(intArray[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = doubleArray.length - 1; i >= 0; i--) {
            System.out.print(doubleArray[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = myArray.length - 1; i >= 0; i--) {
            System.out.print(myArray[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
    public static void task4() {
        System.out.println("Задача 4");
        int [] intArray = new int[3];
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] % 2 != 0) {
                intArray[i] += 1;
            }
        }
        System.out.println(Arrays.toString(intArray));
    }
}