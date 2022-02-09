import java.util.Scanner;

public class timmang {
    public static void main(String[] args) {
        String[] students = {"canh", "cuong", "dan", "huong", "l.anh"};
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ten mot hoc sinh: ");
        String ten = sc.nextLine();
        boolean check = false;
        for (int i = 0; i < students.length; i++) {
            if(students[i].equals(ten)){
                System.out.println("thu tu hoc sinh " + ten +" la " +(i+1));
                check = true;
                break;
            }
        }
        if (!check)
            System.out.println("khong tim thay hoc sinh " + ten + "trong danh sach");

    }
}
