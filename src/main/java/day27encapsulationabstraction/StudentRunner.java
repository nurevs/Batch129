package day27encapsulationabstraction;

public class StudentRunner {
    public static void main(String[] args) {

        Student myStd=new Student();

       // String stdId= myStd.getStdId();

        //Student1
        System.out.println(myStd.getStdId());
        System.out.println(myStd.getGpa());
        System.out.println(myStd.isPoor());

        //Student2

        myStd.setStdId("Th123");
        myStd.setGpa(4.0);
        myStd.setPoor(false);






    }
}
