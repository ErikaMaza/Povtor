package povtor.important.scanners;

import java.util.Scanner;

public class ScannerOne {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter 2 number, please: ");
//        int i = sc.nextInt();
//        int j = sc.nextInt();
//        System.out.println("Chastnoe = " + i / j);
//        System.out.println("Ostatok = " + i % j);

        Scanner sc = new Scanner("Hi\nHow are you?\nWhat is it?");
        while (sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
    }
}
