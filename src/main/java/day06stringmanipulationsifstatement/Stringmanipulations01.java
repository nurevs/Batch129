package day06stringmanipulationsifstatement;

import java.util.Locale;

public class Stringmanipulations01 {

    public static void main(String[] args) {

        //Exp1: Bir stringin bas ve sonunda space karakteri varsa siliniz



        String s="   Ali Can  ";
        System.out.println(s);

        //trim ()methodu bir stringin bas ve sonindaki spaceleri siler,aradaki spacelere dokunmaz.

        String sTrimmed= s.trim();
        System.out.println(sTrimmed);

        //Exp2: asagida fiyatlari verilen urunlerin toplam fiyaitni bulunuz
        //         String tv=$456.99    String laptop=$875.99

        String tv1="$456.99";
        String laptop1="$875.99";

        String tv2=tv1.replace("$","");
        System.out.println(tv2);

        String laptop2=laptop1.replace("$","");
        System.out.println(laptop2);

       Double totalPrice= Double.valueOf(tv2)+Double.valueOf(laptop2);
        System.out.println(totalPrice);

        //EXP3: Verilen ismin ilk iki harfini ve soyisminin ilk harfini ekrana yazdirin
        // "Ali Can" ==> AC

        String name= "    ali cAN    ";
       char first= name.trim().toUpperCase().charAt(0);
        System.out.print(first);

        char second= name.trim().toUpperCase().split(" ")[1].charAt(0);
        System.out.println(second);

        //Exp4: Bir stringidn hic karatkter icermedini (bos string)nasilanlarim

        String str= "";

        //1.yol lenght();

        boolean result1=str.length()==0;
        System.out.println("String bos mu ?"+result1);//true

        //2.yol isEmtty()
        boolean result2=str.isEmpty();
        System.out.println(result2);

        //exp5: Bir stringin space haric hicbir charakter icermedini kontrol ediniz

        String t= "   ";

        //1.yol
        boolean result3=t.replace(" ","").length()==0;
        System.out.println("Sadece space mi var? " + result3);

        //2.yol
        boolean result4=t.replace(" ","").isEmpty();
        System.out.println(result4);

        //3.yol
        //isBlank() methodu sadece space iceren Stringler icin true verir, space disinda baska karakter iceriyorsa
        //false verir
        boolean result5=t.isBlank();
        System.out.println(result5);

        //exp6: Bir Stringte a ,e,i caharcterlerinin ilk gorunumlerinin indecleri toplamini ekrana yazdir
        // "Java is easy to learn"

        String r="Java is easy to learn";
         int idxA=r.indexOf('a');
        System.out.println(idxA);//1


        int idxI=r.indexOf('i');
        System.out.println(idxI);//5

        int idxE=r.indexOf('e');
        System.out.println(idxE);//8

        System.out.println("Indexler toplami: "+(idxE+idxA+idxI));//14

        //EXP7: bir Strginde "Java" kelimesinin kacinci indexlerde kullanildigini gosteren kodui yaziniz
        // " Ah Java vah Java sensiz olmuyor Java."

        String u="Ah Java vah Java sensiz olmuyor Java.";
        //indexOf("Java") kullanildiginda siz "Java" kelimesinin ilk bolumundeki ilk harfin indexini almis olursunuz

        int idxJava= u.indexOf("Java");
        System.out.println(idxJava);//3
        //indexOf() methodu olmayan character icin kullanildiignda indexi her zaman -1 olur

        int idxOFXyz=u.indexOf("xyz");
        System.out.println(idxOFXyz);// -1

        //EXP8:Bir Strginde a,i.e characterlerinin son gorunumlerinin indexlerini topla
        // "Java is easy to learn"

        String v="Java is easy to learn";
        int idxOfA=v.lastIndexOf('a');//18
        System.out.println(idxOfA);

        int idxOfI=v.lastIndexOf('i');
        System.out.println(idxOfI);//5

        int idxOfe=v.lastIndexOf('e');
        System.out.println(idxOfe);//17

        System.out.println(idxOfe+idxOfA+idxOfI);//40

        //Note: lastIndexOf() String olmayan bir character icin kullanildiignda indexi her zaman -1 olur


        //EXP9:Bir Stringdeki tekrarsiz charackterleri ekrana yazdir
        // abbccdc==> ad

        //Note:  Bazi kodlarin bazi sartlara bagli olarak calismasi gerekir.
        //Bazi kodlari bazi sartlara gore aktice etmek icin "if statement" kullanilir.
        //if you study hard,you will learn Java.
       // String y="abbccdc";
//BENIMKI
//        int idxy=y.indexOf('a');
//        int idxOfY=y.lastIndexOf('a');
//
//        if (y.indexOf('a')==y.lastIndexOf('a')){
//
//            System.out.println("a Tekrarlamayanb");
//        }
//        else System.out.println("a tekrarlayan");
//
//        int idxB=y.indexOf('b');
//        int idxOfB=y.lastIndexOf('b');
//
//        if (y.indexOf('b')==y.lastIndexOf('b')){
//
//            System.out.println("b Tekrarlamayan");
//        }
//        else System.out.println("b terkarlayan");
        //HOCANINKI

        String y="aac";
        char ch1=y.charAt(0);

        if (y.indexOf(ch1)==y.lastIndexOf(ch1)){

            System.out.println(ch1);
        }
        char ch2=y.charAt(1);

        if (y.indexOf(ch2)==y.lastIndexOf(ch2)){

            System.out.println(ch2);
        }
        char ch3=y.charAt(2);

        if (y.indexOf(ch3)==y.lastIndexOf(ch3)){

            System.out.println(ch3);
        }


        //Exp10:Sayi cift ise ekrana cift yazdirin

        int num=-12;
        if(num>0){
            System.out.println("pozitir");
        }
        else System.out.println("Negatif");
        //Exp11:Sayi -1 ile 10 arasinda ise ekrana "Rakam " yazidirin

        if (num>-1 && num<10){
            System.out.println("Rakam");
        }
        else System.out.println("Sayi");

        //Exp12: Sayi uc basamakli ise ekrana"Wooow!" yazdirin

        int n=12;

        Math.abs(n); //SAyinin mutlka degerini hesaplar

        if(n>99 && n<1000){
            System.out.println("Wooow!");
        }
        else System.out.println("Sayi uc basamakli degil");














    }
}
