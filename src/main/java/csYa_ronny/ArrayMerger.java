package csYa_ronny;

public class ArrayMerger {
    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int arr1index=0;
        int arr2index=0;
        int index=0;
        int[] arr=new int[arr1.length+arr2.length];
        while(index<=arr1.length+arr2.length) {
            if (arr1[arr1index] < arr2[arr2index]) {
                arr[index] = arr1[arr1index];
                arr1index++;
            } else {
                arr[index] = arr[arr2index];
                arr2index++;
            }
            index++;
        }
        return arr;
    }

    public static void main(String[] args) {
        // דוגמה לשימוש בשיטה
        int[] array1 = {1, 3, 5};
        int[] array2 = {2, 4, 6};
        int[] result = mergeSortedArrays(array1, array2);

        // הדפסת המערך הממוזג
        System.out.print("Merged array: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}