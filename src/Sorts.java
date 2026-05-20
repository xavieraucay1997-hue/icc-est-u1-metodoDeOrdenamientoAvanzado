public class Sorts {

    public void mergeSort(int[] array) {
        if (array.length <= 1) {
            return;
        }
        int middle = array.length / 2;

        int[] left = new int[middle];
        int[] right = new int[array.length - middle];
        // izquierda
        for (int i = 0; i < middle; i++) {
            left[i] = array[i];
        }
        // derecha
        for (int i = middle; i < array.length; i++) {
            right[i - middle] = array[i];
        }
        // Recursividad
        mergeSort(left);
        mergeSort(right);
        // Mezclar
        merge(array, left, right);
    }

    public void merge(int[] array, int[] left, int[] right) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                array[k] = left[i];
                i++;
            } else {
                array[k] = right[j];
                j++;
            }

            k++;
        }

        while (i < left.length) {
            array[k] = left[i];
            i++;
            k++;
        }

        while (j < right.length) {
            array[k] = right[j];
            j++;
            k++;
        }
    }

    public void quickSort(int[] array, int inicio, int fin) {

        if (inicio < fin) {

            int pivote = dividir(array, inicio, fin);
            quickSort(array, inicio, pivote - 1);
            quickSort(array, pivote + 1, fin);
        }
    }
    public int dividir(int[] array, int inicio, int fin) {

        int pivote = array[fin];
        int i = inicio - 1;
        for (int j = inicio; j < fin; j++) {
            if (array[j] < pivote) {
                i++;

                int aux = array[i];
                array[i] = array[j];
                array[j] = aux;
            }
        }

        int aux = array[i + 1];
        array[i + 1] = array[fin];
        array[fin] = aux;

        return i + 1;
    }
}

