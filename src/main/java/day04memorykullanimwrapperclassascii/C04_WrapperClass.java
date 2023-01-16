package day04memorykullanimwrapperclassascii;

public class C04_WrapperClass {

    /*

    Non- Primitive data turleri sadece data barindikmak icin degil ayni zamanda
    methotlarda bulundurur.
    Primitive data turleri ise sadece deger saklar.Methodu yoktur.
    Java bu duruma bir cozum uretmistir.
    Her primitive data turunu Non-primitive kullanabilmek icin ozel classlar olusturmustur.
    Oracle firmasinin urunu olan Java primitivelere method ekleyerek olusturduklari
    bu yeni yapiya Wrapper Class adini vermistir.

    Primitive               Wrapper Class
     byte                       Byte
     short                      Short
     int                        Integer  ****
     long                       Long
     float                      Float
     double                     Double
     boolean                    Boolean
     char                       Character ****
     */

    public static void main(String[] args) {
        byte primitiveByte= 12;//primitive data typelarinda nokta koydugumuzda method yok

        Byte wrapperByte=12;// wrapper classlarda nokte koydugumuzda bir cok method cikar

        //Exp: byte data typelerin en kucuk ve en buyuk degerini ekrana yazdirin
        System.out.println(Byte.MIN_VALUE);//-128
        System.out.println(Byte.MAX_VALUE);//127

        //Exp: tum data tiplerini hespla
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);

        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);



        //*******************************************
        //Primitivler Wrapper Classlar Nasil Cevrilir
        //*******************************************


        float f1= 13.99F; // kucuk kutu primitive

        Float wrapperF1 = f1; // otoboxing yaptik. primitive data typeni non-primitive data tipine yerlestirdik

        //***********************************************************
        //Wrapper Classlari primitive data typelarina nasil cevrilir
        //***********************************************************
        //(Unboxing)

        Float F2= 13.99F;
        float unF2= F2;//unboxing .. Non-pri'yi primitive cevirdik

        Character w1='s';
        char primitiveW1= w1; // unboxing yapiyorz

        //Exp: Verilen iki String datanin toplamini veren kod

        String str1= "12345";
        String str2= "6789";

        System.out.println(str1+str2);//123456789 yan yana yazdirdi

        System.out.println(Integer.valueOf(str1)+Integer.valueOf(str2));





    }

}
