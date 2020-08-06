package MangVaPhuongThucTrongJava.BaiTap;

public class GopMang {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 10};
        int[] arr3 = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int x = 0; x < arr2.length; x++) {
            arr3[x + arr1.length] = arr2[x];
        }
        for (int a = 0; a < arr3.length; a++) {
            System.out.print(arr3[a] + " ");
        }
    }
}
