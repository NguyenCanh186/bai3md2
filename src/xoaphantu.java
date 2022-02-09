import java.util.Scanner;

public class xoaphantu {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] newArr;
        int index;
        int c = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap phan tu muon xoa: ");
        index = scanner.nextInt();
        newArr = new int[arr.length - 1];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != index){
                arr[c] = arr[i];
                c++;
            }
        }
        System.out.println("mang moi la: ");
        for (int i = 0; i < c; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
    }


