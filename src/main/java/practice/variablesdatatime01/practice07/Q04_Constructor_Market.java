package practice.variablesdatatime01.practice07;

public class Q04_Constructor_Market {
    public static void main(String[] args) {
        Market obj1=new Market("Çikolata",20,6);
        System.out.println(obj1);

        Market obj2=new Market("Peynir",100,3);
        System.out.println(obj2);

        Market obj3 = new Market("Detarjan",200);
        System.out.println(obj3);

        Market obj4 = new Market();
        System.out.println("obj4 = " + obj4);

    }
}
