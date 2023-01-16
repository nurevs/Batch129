package methodcreaationobjectcreation1;

public class SchoolRunner {

    public static void main(String[] args) {
        School obj=new School();
        System.out.println(obj.isActive);
        System.out.println(obj.yil);
        System.out.println(obj.okulIsmi);

        School.okulIsmiYazdir("Star okulu");

        School.yilIsmiYazdir(1996);

        System.out.println(obj.isActive(false));

        Calculator.Cikartma(45,34);

    }

}
