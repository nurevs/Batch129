package day10switchloops;

public class Loops02 {
    public static void main(String[] args) {

        //exp1: 21den 180e kadar hem 4 hemde 6 ile bolunebilen tum sayilari

        for (int i = 21; i > 181; i++) {

            if (i % 4 == 0 && i % 6 == 0) {
                System.out.println(i);
            }
        }

        //Example 2: Size verilen kucuk harfle yazilmis String'in index'i cift sayi olan caharacter'lerini buyuk harf yapiniz
        //      ankara ==> AnKaRa
        //NOTE: Yazdiginiz kod belli seneryolar icin dcalisiyor tum seneryolar icin calismiyorda bu koda
        //hard code denir.Hard Code yanlis yazilmis koddur.

        //Note: Bir indexte son index= length()-1

        String s = "ankara";


        for (int i = 0; i < s.length(); i++) {

            String ch = s.substring(i, i + 1);


            if (i % 2 == 0) {
                System.out.print(ch.toUpperCase());


            }else System.out.print(ch);
        }

    }
}
