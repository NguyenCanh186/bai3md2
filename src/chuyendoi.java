import java.util.Scanner;

public class chuyendoi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice;

        do {
            System.out.println("Menu.");
            System.out.println("1. Chuyen do f sang do c");
            System.out.println("2. chuyen do c sang do f");
            System.out.println("0. thoat");
            System.out.println("Nhap lua chon cua ban: ");
            choice = input.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("Nhap do f: ");
                    fahrenheit = input.nextDouble();
                    System.out.println("do f sang do c: " + fahrenheitToCelsius(fahrenheit));
                    break;
                }
                case 2:{
                    System.out.println("nhap do c: ");
                    celsius = input.nextDouble();
                    System.out.println("do c sang do f: " + celsiusToFahrenheit(celsius));
                    break;
                }
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }

    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
}
