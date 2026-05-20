public class App {

    public static void main(String[] args) {

        int[] numbers = {8, 3, 5, 1, 9, 6};

        Sorts sort = new Sorts();

        System.out.println("MERGE SORT");

        System.out.println("Arreglo original:");
        printArray(numbers);

        sort.mergeSort(numbers);

        System.out.println("Arreglo ordenado:");
        printArray(numbers);
    }

    public static void printArray(int[] array) {

        for (int num : array) {
            System.out.print(num + " ");
        }

        System.out.println();
    }
}