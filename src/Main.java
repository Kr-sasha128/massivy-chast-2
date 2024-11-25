import java.util.Arrays;
import java.util.Random;
import java.util.random.RandomGenerator;

public class Main {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {


//        int[] weights = new int[]{90, 90, 93, 92, 85, 87, 88, 89, 0, 0, 0, 0};
//        int[] weightsCopy = new int[]{90, 90, 93, 92, 85, 87, 88, 89, 0, 0, 0, 0};
////        int januaryWeigh = weights[0];
////        System.out.println(januaryWeigh);
////        System.out.println(weights[0]);
////        System.out.println(weights[4]);
//        int january = 0;
////        System.out.println(weights[january]);
//        for (int i = 0; i < weights.length; i++) {
////            System.out.println(weights[i]);
//        }
//        boolean arraysAreEgual = true;
//        arraysAreEgual = weights.length == weightsCopy.length;
//        if (arraysAreEgual) {
//            for (int i = 0; i < weights.length; i++) {
//                if (weights[i] != weightsCopy[i]) {
//                    arraysAreEgual = false;
//                }
//            }
//        }
//        if (arraysAreEgual) {
//
//            System.out.println("Массиввы одинаковые");
//        } else {
//            System.out.println("Массивы разные");
//        }
//        int maxWeight = -1;
//        for (final int current : weights) {
//            if (current > maxWeight) {
//                maxWeight = current;
//            }
//        }
//        System.out.println(maxWeight);
//        for (int i = 0; i < weights.length - 1 && weights[i + 1] != 0; i++) {
//            System.out.println(weights[i + 1] - weights[i]);
//        }
//        int[] arr2 = Arrays.copyOf(weights, weights.length);
//        arr2[0] = 5;
//        System.out.println(Arrays.toString(new int[]{arr2.length}));

//
    }
}
