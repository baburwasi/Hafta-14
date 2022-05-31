
public class SelectionSort {

    public void sort(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            int min_index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min_index]) {
                    min_index=j;
                }
            }
            int tmp = array[min_index];
            array[min_index] = array[i];
            array[i] = tmp;
        }
    }

    public void printArray(int[] array) {
        for (int index = 0; index < array.length; index++) {
            System.out.print(array[index] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {15, 12, 14, 20, 30, 5};
        SelectionSort ob = new SelectionSort();
        ob.sort(array);
        System.out.println("Sirali dizi: ");
        ob.printArray(array);
    }

}
