package day05typecastingstringmanipulations;

public class TypeCasting01 {


    /*

    Numeric privite data typelerinin birbirine donusturulmesine "Type Casting" denir.
    Numeric DatavTypeler byte-short-int-long-float-double

    Note: Kucuk data typelerini buyuk data typelerine cevirmeyi Java kendisi yapar.
    Bu isleme 'AutoWidening' denir(otomatik genisletme)

    Note2:Buyuk data typelerini kucuk data typlerine cevirmek riskli bir istir.
    Java bu riskli isi otomatik olarak yapmaz.Bu islemi kod yazanlar yapar.
    Bu isleme "ExplicitNarrowing" denir (Aciktan Daraltma)

     */
    public static void main(String[] args) {

        //byte data typlerini int data typeina ceviriniz
        byte age=13;
        int ageInt = age; //AutoWidening

        //long data typeini shorta cevirin
        long weight= 234;

        short weightInt= (short)weight; // Explicit Narrowing

        //int datayi floata cevir

        int populatin=26;
        System.out.println(populatin); //26
        float populationFloat=populatin;
        System.out.println(populationFloat); //26.0

        //double to short

        double boy=15.7;
        System.out.println(boy);// 15.7
        short boyShort=(short)boy;
        System.out.println(boyShort);//15

        //Dikkat !!
        short num= 260;
        System.out.println(num);// 260

        byte numByte= (byte)num;
        System.out.println(numByte);// 4
        //Note : byte -128 ve 127 arasinda toplam 256 tane sayi var
        //bytein sinirini asan sayiyi byte a cevirirsek 256ya boler
        //ve bize kalani cikti olarak verir

        //Exp: 2
        short n= 1023;
        System.out.println(n);//1023

        byte nByte=(byte) n;
        System.out.println(nByte);//-1



    }
}
