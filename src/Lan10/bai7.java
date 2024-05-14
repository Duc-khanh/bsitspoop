package Lan10;

import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập điểm của bạn");

        int diemm = scanner.nextInt();

        switch (diemm) {
            case 1:
                System.out.println("1 điểm");

                break;
            case 2:
                System.out.println("2 điểm");

                break;
            case 3:
                System.out.println("3 điểm");
                break;
            case 4:
                System.out.println("4 điểm");
                break;
            case 5:
                System.out.println("5 điểm");
                break;
            case 6:
                System.out.println("6 điểm");
                break;
            case 7:
                System.out.println("7 điểm");
                break;
            case 8:
                System.out.println("8 điểm");
                break;
            case 9:
                System.out.println("9 điểm");
                break;
            case 10:
                System.out.println("10 điểm");
                break;
            default:

                System.out.println("0 điêm");
                break;
        }


    }
}
