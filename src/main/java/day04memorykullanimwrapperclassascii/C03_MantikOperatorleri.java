package day04memorykullanimwrapperclassascii;

public class C03_MantikOperatorleri {

    // 10< sayi mantik operatoru <20;   yani uclu kiyaslamalari mantik op'leri ile yapiyor
    //== esittir demek icin cift esittir kullaniir. = tek esittir atama(assigment) yapar
    /*
      Java 3lu karsilastirma kabul etmez
     ikili karsilastirmalar yapip Mantik operatorleriyle birlestirmeliyiz.


     && and demek
     || or operatoru

     && butun sartlarin true olmasi gerekir. bir tane false gorse durur
     & 'de ise tum satiri tarar sonra durur.
     burda && 'ni &den daha hizli calismasini saglar


     || operatoru bir tane true gorse true doner




     */

    public static void main(String[] args) {

        System.out.println(5+2==8);

        boolean sonuc1= 5>4 && 7<9 && 6+3==9 && 5+2 != 8;//true
        System.out.println(sonuc1);

        boolean sonuc2= 5>4 && 7>9 && 6+3==9 && 5+2==7;//false
        System.out.println(sonuc2);

        int sayi1= 15;
        System.out.println(10< sayi1 && sayi1<20);//true

        int sayi2=5;
        System.out.println(sayi2<10 || sayi2>20);


    }
}
