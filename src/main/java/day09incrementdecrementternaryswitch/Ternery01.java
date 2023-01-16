package day09incrementdecrementternaryswitch;

public class Ternery01 {


    public static void main(String[] args) {
        //exp1
        int a=10;
        int b=20;

        int r1= a < 7 ? a++ : b++;
        System.out.println(r1);//20
        System.out.println(a);//10
        System.out.println(b);//21

        //exp2:verilen bie sayinin mutlak degerini hesaplayan kodu yaziniz

        int c=-4;

        int r2= c<0? c*=-1 : c;
        System.out.println(r2);


    }
}
