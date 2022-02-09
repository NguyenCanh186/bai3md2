import java.util.Scanner;

public class xoaphantu {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int[] newArr = arr;
        int index;
        int so;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("nhap thu tu phan tu muon xoa");
            index = scanner.nextInt();
            if (index > 10)
                System.out.println("khong nhap qua so 10");
        } while (index > 10);
        System.out.println("ban muon doi thanh so may? ");
        so = scanner.nextInt();
        arr[index - 1] = so;
        for (int i = 0; i < arr.length; i++) {
            if (i = (index-1)){
                arr[i] = so;
            } System.out.println("moi moi se la: " + arr[i] + "\t");

        }
    }
}

