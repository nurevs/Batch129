package day28exceptions;

public class C02_Exceptions {
    public static void main(String[] args) {

/*
    2) StringOutOfBoundExceptions
     */

        //Bir String'in istedigimiz indexdeki datasini bize veren kodu yaziniz



            char ch = getCharFromString("Hakan",5);
            System.out.println("ch = " + ch);


        }

        private static char getCharFromString(String str, int i) {
            char c=' ';
            try {
                c= str.charAt(i);
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Of Bound");
            }

            return c;
        }
}
