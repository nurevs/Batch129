package day04memorykullanimwrapperclassascii;

public class C02_AsciiDegerleri {

    /*
    ASCII= Amerikan Standart Kodlama Sistemi uluslar arasi kabul gormus degerlerdir.

    *Klavyemizde kullandigimiz harf ve sembollerin matematiksel karsiligi char data turunde isleme alinirsa
    o char degerinin ASCII Table deki karsiligini isleme alir.
    *Harf ve sembollere deger atar.
    *Karakterlerin cebirsel karsiligini bulmak icin ortaya cikmistir.Cunku pcde her sey
    1 ve 0 dan olusur. Bu yapiya cevirebilmek icin Ascii table olusturulmustur.
    *Buyuk harflerin Ascii degeri kucuk harflerin degerinden kucuktur.
     */

    public static void main(String[] args) {
        //Bir tam sayi ile bir harfi toplayiniz

        int deger= 20;
        char harf='a';
        System.out.println(deger+harf);
        
        
        char rakam1='1';
        System.out.println("rakam1 = " + rakam1);
        char rakam2='2';
        System.out.println("rakam2 = " + rakam2);
        char rakam3='3';
        System.out.println("rakam3 = " + rakam3);

        System.out.println("rakam1+rakam2+rakam3= "+rakam3+rakam1+rakam2 );//321
        System.out.println("rakam1+rakam2+rakam3 ASII toplam = "+(rakam1+rakam2+rakam3));//150

        char kh='a';
        char bh ='A';

        System.out.println("a'nin Ascii degeri"+kh+0);
        System.out.println("A'nin Acsii degeri"+bh+0);

        System.out.println("kh> bh "+(kh >bh));//true false dondurur

        //Herhangi bir karakterin Ascii degerini hesaplayalim

        char space=' ';
        System.out.println("space in Ascii degeri= "+(space+0));// asciiyi gormek icin 1.yol

        int hrf='m';
        System.out.println(hrf);// m nin ascii degerini kabul etti bu da 2.yol

        byte b= 125;
        float f=2.34234F;
        long l=23489273498274734L;
        char ch='h';

        System.out.println(l>ch);
        System.out.println(b<f);

        System.out.println(b<ch);






    }
}
