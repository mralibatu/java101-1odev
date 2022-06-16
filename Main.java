import java.util.Scanner;

public class Main {
    public static <str> void main(String[] args) {

        Scanner input = new Scanner(System.in);
        input = new Scanner(System.in);
        System.out.println("Matematik Ders Notu : ");
        int mat = input.nextInt();
        System.out.println("Fizik Ders Notu : ");
        int fiz = input.nextInt();
        System.out.println("Kimya Ders Notu : ");
        int kim = input.nextInt();
        System.out.println("Türkçe Ders Notu : ");
        int tr = input.nextInt();
        System.out.println("Tarih Ders Notu : ");
        int trh = input.nextInt();
        System.out.println("Müzik Ders Notu : ");
        int mzk = input.nextInt();

        int ortalama = (mat+fiz+kim+tr+trh+mzk);
        double sonuc = ortalama/6.0;
        System.out.println("Not Ortalamanız : " + sonuc);
        boolean kosul1 = 60 >= sonuc;
        boolean kosul2 = sonuc < 60;
        boolean result = !(kosul1&&kosul2) ;
        String str = result ? "Sınıfı Geçti":"Sınıfta Kaldı";
        System.out.println(str);
    }


    }
