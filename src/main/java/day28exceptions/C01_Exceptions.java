package day28exceptions;

public class C01_Exceptions {
    public static void main(String[] args) {

        //Compile Time Error --> Kodlarin yazim asamasinda meydana gelen hatalardir. CTE
        //Run Time Error --> Kodlari calistirdiktan sonra olusan hata tipi. RTE

        //1)NumberFormatExceptions-->Try Catch le handle ettik

        //EXP:bir Stringi alip int'e ceviren kodu yaziniz.

        //yukardan Code'a gittik,Surround With, Try Catch tikliyoruz, codu sectikten sonra..

        String str= "123";//happyScenario/Positive Scenario

        int result =convertStringtoInteger(str);

        System.out.println("result+5 "+(result+5));//int'e vevirdik o yuzden +5 yaptigimizda topladi

        String st="123a";//Negative Scenario
        int result2=convertStringtoInteger(st);
        System.out.println("result2+10: "+(result2+10));

    }

    private static int convertStringtoInteger(String str) {

        int i=0;
        try {
            i=Integer.valueOf(str);
            System.out.println("Burasi try Bolumu   :" +i);
        } catch (NumberFormatException e) {
            System.out.println("Rakam olmayan karakter iceren String'ler Integer'a cevrilmez.");
        }

        return i;
    }
}
