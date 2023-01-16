package day11loops;

import java.util.Scanner;

public class C07_NestedLoop {
    public static void main(String[] args) {

        /*
         Type code to print the following image on the console
            X X X X X
            X X X X X
            X X X X X

*/

        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen satir ve sutun giriniz");
        int satir=input.nextInt();
        int sutun=input.nextInt();
        System.out.println("Lutfen karakter giriniz");
        char ch=input.next().charAt(0);

        for (int i=0;i<satir;++i){
            String str="";
            for (int j=0;j<sutun;++j){
                System.out.print(ch + " ");
            }
            System.out.println();
        }


    }
}