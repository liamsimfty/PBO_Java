import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        boolean a = true;
        do {
            System.out.println("Pilih Operasi\n1. Penjumlahan\n2. Pengurangan\n3. Perkalian\n4. Pembagian\n5. Keluar\n\nPilih Operasi");
            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();

            switch (input)
            {
                case 1:
                    penjumlahan();
                    break;
                case 2:
                    pengurangan();
                    break;
                case 3:
                    perkalian();
                    break;
                case 4:
                    pembagian();
                    break;
                case 5:
                    a = false;
                    break;
                default:
                    System.out.println("Err Input");
            }


        } while (a == true);


    }

    public static void penjumlahan()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Operasi Penjumlahan\n----------------------\nMasukkan Angka ke 1 : ");
        int satu = scanner.nextInt();
        System.out.println("Masukkan Angka ke 2 : \n----------------------");
        int dua = scanner.nextInt();
        int hasil =  satu + dua;
        System.out.println("Hasil : " + hasil);
    }
    public static void pengurangan()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Operasi Pengurangan\n----------------------\nMasukkan Angka ke 1 : ");
        int satu = scanner.nextInt();
        System.out.println("Masukkan Angka ke 2 : \n----------------------");
        int dua = scanner.nextInt();
        int hasil =  satu - dua;
        System.out.println("Hasil : " + hasil);
    }
    public static void perkalian()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Operasi Perkalian\n----------------------\nMasukkan Angka ke 1 : ");
        int satu = scanner.nextInt();
        System.out.println("Masukkan Angka ke 2 : \n----------------------");
        int dua = scanner.nextInt();
        int hasil =  satu * dua;
        System.out.println("Hasil : " + hasil);
    }
    public static void pembagian()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Operasi Pembagian\n----------------------\nMasukkan Angka ke 1 : ");
        int satu = scanner.nextInt();
        System.out.println("Masukkan Angka ke 2 : \n----------------------");
        int dua = scanner.nextInt();
        int hasil =  satu / dua;
        System.out.println("Hasil : " + hasil);
    }

}