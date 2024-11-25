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
//        Задача 1
        int[] saleryArray = generateRandomArray();
        int salerySum = 0;
        for (int salery : saleryArray) {
            salerySum += salery;
        }
//        System.out.println("Сумма трат за месяц составила " + salerySum + " рублей");

//        Задача 2
        int[] saleryArray2 = {114690, 122714, 127389, 158395, 160281};
        int maximumWaste = saleryArray2[0];
        int minimumWaste = saleryArray2[0];
        for (int salere : saleryArray2) {
//            System.out.println(i);
            if (salere < maximumWaste) {
                minimumWaste = salere;
            }
            if (salere > maximumWaste) {
                maximumWaste = salere;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила" + minimumWaste + " рублей");
        System.out.println("Максимальгая сумма трат за неделю составила " + maximumWaste + " рублей");
//        Задача 3
        int[] saleryArray3 = new int[5];
        saleryArray3[0] = generateRandomArray()[0];
        saleryArray3[1] = generateRandomArray()[1];
        saleryArray3[2] = generateRandomArray()[2];
        saleryArray3[3] = generateRandomArray()[3];
        saleryArray3[4] = generateRandomArray()[4];
        int spendingPerWeek = 0;
        int monthlyExpenses = 0;
        double averageConsumption = 0;
        int numberOfWeeks = 4;
        for (int salere : saleryArray3) {
            spendingPerWeek += salere;
        }
//        System.out.println( "Траты за неделю " + spendingPerWeek + " рублей");
        monthlyExpenses = spendingPerWeek * numberOfWeeks;
//        System.out.println(monthlyExpenses + " за месяц");
        averageConsumption = (double) monthlyExpenses / saleryArray3.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageConsumption + " рублей");
//        Задача 4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int index = 0; index < reverseFullName.length / 2; index++) {
            char reverseName = reverseFullName[index];
            reverseFullName[index] = reverseFullName[reverseFullName.length - index - 1];
            reverseFullName[reverseFullName.length - index - 1] = reverseName;
        }
        System.out.println(Arrays.toString(reverseFullName));
//
    }
}
