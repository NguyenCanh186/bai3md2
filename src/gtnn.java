public class gtnn {
    public static void main(String[] args) {
        int[] arr = {1, 23, 15, 16, 48, 17};
        int index = min(arr);
        System.out.println("gia tri nho nhat trong mang la " + arr[index]);
    }
    public static int min(int[] arr){
        int index = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < arr[index]){
                index = i;
            }
        }return index;
    }
}
