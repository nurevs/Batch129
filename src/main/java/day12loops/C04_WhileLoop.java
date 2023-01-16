package day12loops;

public class C04_WhileLoop {
    public static void main(String[] args) {

        //3'den 10'a kadar tamsayilari ayni satira yazdiran kodu yaziniz

        //1.yol
        for (int i = 3; i <11 ; i++) {
            System.out.print(i+ " ");

        }

        System.out.println();
        //2.yol


        int i=3;// baslangic degeri

        while (i<11){//bitis degeri
            System.out.print(i+" ");
            i++;//arttirma while loopun body icerisinde
        }

        System.out.println();
        //exp; 17den 4 e kadar tum cift

        int x=17;

        while (x>3){
            if (x%2==0){
                System.out.print(x+ " ");

            }
            x--;
        }

        //Example 3: Verilen bir tamsayinin rakamlari toplamini console'a yazdiran kodu yaziniz
        int num = -578;

        num = Math.abs(num);
        int sum = 0;

        while(num>0){
            sum = sum + num%10;
            num/=10;
        }
        System.out.println(sum);

        //2.yol for-loop

        int a=684;
        int toplam=0;

        for (int m=a;m>0;m/=10){
            toplam+=m%10;
        }
        System.out.println(toplam);




    }
}
