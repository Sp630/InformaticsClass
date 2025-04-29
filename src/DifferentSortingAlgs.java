public class DifferentSortingAlgs {
    public static void main(String[] args) {

        int[] arr = new int[]{5, 3, 4, 2, 1};
        int[] arr1 = new int[]{5, 4, 3, 2, 1};
        int[] arr2 = new int[]{1, 2, 3, 5, 4};
        System.out.println("Array one took: ");
        int[] sortedArr = selectSort(arr);
        System.out.println("Array two took: ");
        int[] sortedArr1 = selectSort(arr1);
        System.out.println("Array three took: ");
        int[] sortedArr2 = selectSort(arr2);

    }
    static int[] selectSort(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                count ++;
                if(arr[j] < arr[i]) {
                    minIndex = j;
                }
                int temp = arr[j];
                arr[j] = arr[minIndex];
                arr[minIndex] = temp;
            }

        }
        System.out.println(count + " loops");
        return arr;
    }


}
