package day05typecastingstringmanipulations;

import javax.swing.plaf.IconUIResource;

public class StringManipulation01 {
    public static void main(String[] args) {

        String s="Java is easy";

        //Exp: "s" Stringindeki tum characterleri buyuk harf yapiniz
        String sUpper= s.toUpperCase();
        System.out.println(sUpper);//JAVA IS EASY

        //Exp2: "s" Stringindeki tum characterleri kucuk harf
        String sLower= s.toLowerCase();
        System.out.println(sLower);//java is easy

        //Exp3: "s" Stringindeki ilk characteri aliniz
        char firstChar= s.charAt(0);
        System.out.println(firstChar);//J

        //EXP4: "s" Stringdeki ikinci ve sondan ikinci characteri al ve ekrana yan yana yazdir
        char secondChar=s.charAt(1); //a
        char secondLastChar=s.charAt(10); //s

        //1.yol: Ayni satirda yazdirmak icin
        System.out.print(secondChar);
        System.out.println(secondLastChar);

        //2.Yol: Ayni satirda yazdirmak icin
        System.out.println(""+secondChar+secondLastChar);

        //Exp5: "s" Stringinde kullanilan character sayisini bulunuz

        int sLenght=s.length();
        System.out.println(sLenght);

        //Exp6: "s" Stringindeki ilk 4 characteri aliniz
        //substringte (0,4) ==> "0" yani ilk index dahil, "4" yani ikinci index harictir
        String sSub=s.substring(0,4);// 0'dan 4. karaktere kadar alir.
        System.out.println(sSub);

        //Exp7: "s" deki "is" i cek
        String sIs=s.substring(5,7);
        System.out.println(sIs);

        //Exp8: "s" deki "easy" cek
        String sub3=s.substring(8,12);
        System.out.println(sub3);

        //Exp9:bir yerden baslayip sonuna kadar yazdiran
        //Note: Bir characterden baslayip string sonuna kadar almak isterseniz, ikinci indexi yazmayiniz
        String sToLast=s.substring(5);
        System.out.println(sToLast);

        //Exp10: "s" Stringinde "money" kelimesinin var olup olmadigini kontrol ediniz

        boolean isExist=s.contains("money");
        System.out.println(isExist);//false

       /*
       NOTE: Bir methodu ogrenirken 3 seyi mutlaka ogrenin
        1) bu method ne is yapar?
        2)bu methodun farkli kullanimlari nasildir?
        3)Bu method size ne return eder?
        */

        //Exp11: "s" Stringinin belli bir harfle baslayip baslamadigini kontorl ediniz

        boolean isStart=s.startsWith("Java");
        System.out.println(isStart);//true

        //Exp11: "s"Stringinin 6.karakterden itibaren belli bir harfle baslayip baslmadigini kontrol ediniz
        // bitinci yere karakter, ikinci yere kas tane harfi cope attigimiiz yazicaz
        boolean s6=s.startsWith("i",5);
        System.out.println(s6);










    }
}
