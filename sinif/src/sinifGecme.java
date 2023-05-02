import java.util.Scanner;

public class sinifGecme {
    public static void main(String[] args) {

        int mat, fizik, kimya, tarih, turkce, muzik;

        Scanner input = new Scanner(System.in);

        System.out.print("matematik notunu giriniz :");
        mat = input.nextInt();

        System.out.print("fizik notunu giriniz : ");
        fizik = input.nextInt();

        System.out.print("kimya notunu giriniz : ");
        kimya = input.nextInt();

        System.out.print("tarih notunu giriniz :");
        tarih = input.nextInt();

        System.out.print("türkçe notunu giriniz :");
        turkce = input.nextInt();

        System.out.print("müzik notunu giriniz : ");
        muzik = input.nextInt();

        int toplam = mat + fizik + kimya + tarih + turkce + muzik;
        double ortalama  = toplam / 6;

        System.out.println("ortalamanız : " + ortalama);
        System.out.println(ortalama>=60? "sınıfı gectiniz":"sınıfta kaldınız");

    }
}
