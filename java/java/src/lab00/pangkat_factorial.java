package lab00;

import java.util.Scanner;

public class pangkat_factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan bilangan utama (n): ");
        int n = sc.nextInt();
        System.out.print("Masukkan pemangkatan(m): ");
        int m = sc.nextInt();

        // Factorial
        int hasil_fact = 1;
        int temp_n = n;
        while(temp_n >= 1){
            hasil_fact *= temp_n;
            temp_n -= 1;
        }

        // Pangkat
        int hasil_pangkat = 1;
        for (int i = 0; i < m; i++){
            hasil_pangkat *= n;
        }

        System.out.println("n factorial = " + hasil_fact);
        System.out.println("n pangkat m = " + hasil_pangkat);

        sc.close();
    }
}
