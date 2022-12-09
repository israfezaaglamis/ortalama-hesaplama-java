import java.sql.SQLOutput;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int mat, fzk, turkce, muzk, kimya,tarih;

        Scanner inp = new Scanner(System.in);

        System.out.println("Matematik notunuz: ");
        mat = inp.nextInt();


        System.out.println("Turkçe notunuz: ");
        turkce = inp.nextInt();

        System.out.println("Kimya notunuz: ");
        kimya = inp.nextInt();


        System.out.println("Tarih notunuz: ");
        tarih = inp.nextInt();

        System.out.println("Müzik notunuz: ");
        muzk = inp.nextInt();

        System.out.println("fizik notunuz: ");
        fzk = inp.nextInt();

        int toplam = (mat+ fzk+ turkce+ kimya+ muzk + tarih);
        double sonuc = toplam /6.0;
        System.out.println("Ortalaman : " +sonuc);

        String durum = (sonuc >= 60) ? " Sınıfı geçtin" : "Sınıfı geçemedin";
        System.out.println("Durumun : "+ durum);


    }
}
