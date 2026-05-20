public class App {

    public static void main(String[] args) {

        int[] numbers1 = {8, 3, 5, 1, 9, 6};
        int[] numbers2 = {8, 3, 5, 1, 9, 6};

        Sorts sort = new Sorts();
        // MERGE SORT

        System.out.println("MERGE SORT");

        System.out.println("Arreglo original:");
        printArray(numbers1);

        sort.mergeSort(numbers1);

        System.out.println("Arreglo ordenado:");
        printArray(numbers1);

        System.out.println();

        
        // QUICK SORT
        System.out.println("QUICK SORT");
        System.out.println("Arreglo original:");
        printArray(numbers2);
        sort.quickSort(numbers2, 0, numbers2.length - 1);
        System.out.println("Arreglo ordenado:");
        printArray(numbers2);
    }

    public static void printArray(int[] array) {

        for (int num : array) {
            System.out.print(num + " ");
        }

        System.out.println();
    }
}
