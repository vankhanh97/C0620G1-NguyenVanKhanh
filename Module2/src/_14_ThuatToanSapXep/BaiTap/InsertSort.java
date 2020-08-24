package _14_ThuatToanSapXep.BaiTap;

public class InsertSort {
    public static void insertSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int a = arr[i];
            int b = i;
            while (b > 0 && arr[b - 1] > a) {
                arr[b] = arr[b - 1];
                b--;
            }
            if (b != i) {
                arr[b]=a;
            }
        }
        for (int i : arr) {
            System.out.print(i+"\t");
        }
    }

    public static void main(String[] args) {
        int[] array = {5,1,4,7,3,2,8};
        int[] array2 = {5,1,3,8,3,2,8,1,9,10};
        insertSort(array2);
    }
}
