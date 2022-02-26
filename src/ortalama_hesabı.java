import  java.util.Scanner;
public class ortalama_hesabı {
    public  static  void  main (String []args ){
        Scanner brt = new Scanner(System.in);

        System.out.println(" Fizik  notunuzu giriniz ");
        double  fizik  = brt.nextDouble();

        System.out.println(" Kimya notunuzu giriniz ");
        double  kimya  = brt.nextDouble();

        System.out.println(" Türkçe  notunuzu giriniz ");
        double  turkce  = brt.nextDouble();

        System.out.println("  Tarih notunuzu giriniz ");
        double  tarih  = brt.nextDouble();

        System.out.println(" Müzik notunuzu giriniz ");
        double  muzık  = brt.nextDouble();

        double ort =(fizik+kimya+turkce+tarih+muzık)/5;

        boolean sonuc = ort >50;
        String  str= (sonuc)? "gectin":"kaldın ";
        System.out.println(str);
    }
}
