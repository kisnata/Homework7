public class Main {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();

        //Задание 1
        int sumMonths = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            sumMonths = sumMonths + arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sumMonths + " рублей");

        //Задание 2
        int spendingMin = arr[0];
        int spendingMax = arr[0];
        for (int i = 0; i <= arr.length - 1; i++) {
            if (spendingMin > arr[i]) {
                spendingMin = arr[i];
            }
        }
        for (int i = 0; i <= arr.length - 1; i++) {
            if (spendingMax < arr[i]) {
                spendingMax = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + spendingMin + " рублей. Максимальная сумма трат за день составила " + spendingMax + " рублей");

        //Задание 3
        double spendingAverage = Math.ceil((double) sumMonths / arr.length);
        System.out.println("Средняя сумма трат за месяц составила " + spendingAverage + " рублей");

        //Задание 4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}

