import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int rate = 23000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số tiền (đơn vị USD): ");
        int moneyUSD = scanner.nextInt();
        int moneyVND = moneyUSD*rate;
        System.out.println("số tiền sau khi quy đổi (VND): "+moneyVND);
    }
}