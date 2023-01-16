package day20passbyvaluemethodoverloading;

public class PassByValue01 {
    public static void main(String[] args) {


        /*
        1)Java Passby-value sayesinde variablelarin original degerlerini korur

         */

        double shirt = 100;
        double studentShirtPrice=discount("student",shirt);
        double seniorShirtPrice=discount("senior",shirt);
       double veteranShirtPrice= discount("veteran",shirt);
        System.out.println(shirt);
        System.out.println("Student Price "+studentShirtPrice);
        System.out.println("Veteran Price "+veteranShirtPrice);
        System.out.println("Senior Price "+seniorShirtPrice);

    }

    public static double discount(String state, double price) {

        switch (state) {
            case "student":
                price = price * 0.90;
                break;
            case "veteran":
                price = price * 0.80;
                break;
            case "senior":
                price = price * 0.95;
                break;
            default:
                price=price;
        }

        return price;
    }
}
