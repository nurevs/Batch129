package day10switchloops;

public class Loops01 {
    public static void main(String[] args) {

        /*
        Code Standarts
        i)Tekrar(Repetition ) olmamalidir
        ii)Dynamic olmalidir
        iii)tamir(fix) ve update kolay yapilabilmelidir.

         */

        //exp1: Ekrana 5 kere "Hi" yazdiriniz
        //1.yol
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");

        //2.yol
        //dort tane loop var. for,while,do-while,for-each


        for(int i=1;i<6;i++){

            System.out.println("Hi");


        }



        //Exp2: 11den 44e kadar tum tam sayilari ekrana yazdiran kodu yaziniz

        for (int j=11;j<45;j++){
            System.out.println(j);
        }

        //Exp3:40dan 23 e kadar tum cift sayilari

        for (int i=40;i>23;i--){

            if (i%2==0){
            System.out.println(i);}
        }

        //exp4: 18den 56ya kadar tum tek sayilari

        for (int i=18;i<57 ;i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }







    }
}
