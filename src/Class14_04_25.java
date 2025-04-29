public class Class14_04_25 {
    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 2, 1};
        sort(arr);
        int[] arr1 = {5, 4, 3, 2, 1};
        sort(arr1);
        int[] arr2 = {1, 2, 3, 5, 4};
        sort(arr2);



    }
    static int[] sort(int[] arr) {
        int count = 0;
        for(int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int possibleIndex = i;
            while(possibleIndex > 0 && temp < arr[possibleIndex - 1]) {
                arr[possibleIndex] = arr[possibleIndex - 1];
                possibleIndex--;
                count ++;
            }
            arr[possibleIndex] = temp;
        }
        System.out.println("This array took: " + count + " steps to sort.");
        return arr;
    }
}
