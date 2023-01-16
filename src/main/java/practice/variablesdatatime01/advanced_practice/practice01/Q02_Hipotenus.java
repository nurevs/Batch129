package practice.variablesdatatime01.advanced_practice.practice01;

import java.util.Scanner;

public class Q02_Hipotenus {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("birinci dik kenar");
        int kenar1=input.nextInt();

        System.out.println("ikinci dik kenar");
        int kenar2=input.nextInt();

        double hip=Math.sqrt((kenar1*kenar1)+(kenar2*kenar2));//kenar1 ve kenar2'nin karekokunu aldik
        System.out.println("Hipotenus= "+hip);






    }
}
