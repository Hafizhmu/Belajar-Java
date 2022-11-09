package kelas;

import java.util.Queue;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class kyu {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        ArrayList<String> nama = new ArrayList<String>();

        Scanner input = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        boolean lanjut = true;
        String yn = "y";
        String tampung = null;
        System.out.println("Selamat datang di antrian bank tooth");
        while (lanjut != false) {
            System.out.print("Masukkan nama anda untuk mengambil antrian : ");
            tampung = input.nextLine();
            queue.add(tampung);
            nama.add(tampung);
            if (queue.size() == 4) {
                queue.poll();
            }
            System.out.println("Antrian sekarang : " + queue);
            System.out.print("Apakah ingin memasukkan antrian lagi : ");
            yn = scan.next();
            if (yn.equalsIgnoreCase("y")) {
                lanjut = true;
            } else if (yn.equalsIgnoreCase("n")) {
                lanjut = false;
            }

        }

        System.out.println("REKAP ANTRIAN");
        System.out.printf("%-15s %-15s %n", "NO ANTRIAN", "NAMA");
        System.out.println("-------------------------------------------------");
        int x = 0;
        for (int i = 0; i < nama.size(); i++) {
            ++x;
            System.out.printf("%-3s %-10d %-15s %n", "", x, nama.get(i));
        }

    }

}
