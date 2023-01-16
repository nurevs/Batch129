package day13whileloopdowhileloop;

import java.util.Scanner;

public class DoWhileLoop03 {
    public static void main(String[] args) {

        /*

        Gecerli Username="admin" ve Password="pwd123" dur
        Kullanicidan username ve password alin
        username ve password dogru ise "Hesabiniza hosgeldiniz!" yazdirin
        Username eve password yanlis ise 4 kere "Username ve passwordunuzu giriniz " mesaji versin
        Username eve password 4.kere yanlis girilirse "Hesabiniz bloke olmustur" mesaji vererek islemi tamamlayiniz

         */

        Scanner input=new Scanner(System.in);




        int counter=0;

        do {

            if (counter==4){
                System.out.println("Hesabiniz bloke olmustur");
                break;
            }

            System.out.println("Username  giriniz");
            String userName=input.next();

            System.out.println("Password giriniz");
            String pwd=input.next();

            if (userName.equals("admin")&& pwd.equals("pwd123")){
                System.out.println("Hesabiniza hosgeldiniz");
                break;
            }

            counter++;
        }while (true);













    }
}
