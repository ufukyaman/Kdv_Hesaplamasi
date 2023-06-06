import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Değişkenlerin tanımlanması
        double tutar,kdvlitutar,kdvtutari;
        double kdvorani=0.18;

        //Scanner sınıfı
        Scanner imp=new Scanner(System.in);

        //Kullanıcıdan verilerin alınıp ilgili değişkene atanması
        System.out.print("Tutar giriniz: ");
        tutar=imp.nextDouble();

        //Tutar 1000'den fazla ise kdv oranını %8'e düşüren kontrol
        kdvorani=tutar >= 1000 ? 0.08 : 0.18;

        //Kdv tutarı ve Kdvli tutarın hesaplanması
        kdvtutari=tutar*kdvorani;
        kdvlitutar=tutar+kdvtutari;

        //Sonuçların ekrana bastırılması
        System.out.println("KDV oranı: "+kdvorani);
        System.out.println("KDV tutarı: "+kdvtutari);
        System.out.println("Toplam tutar: "+kdvlitutar);
    }
}