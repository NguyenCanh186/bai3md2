import java.util.Scanner;

public class gtln {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("nhap 1 size: ");
            size = sc.nextInt();
            if (size>20)
                System.out.println("khong nhap size qua 20");
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i< array.length){
            System.out.print("nhap gia tri " + (i+1)+":");
            array[i] = sc.nextInt();
            i++;
        }
        System.out.print("danh sach: ");
        for (int j = 0; j < array.length; j++){
            System.out.print(array[j] + "\t");
        }
        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++){
            if (array[j] > max){
                max = array[j];
                index = j + 1;
            }
        }
        System.out.println("gia tri lon nhat la " + max +" tai vi tri thu " + index);
    }
}
