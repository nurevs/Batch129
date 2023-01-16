package day25accessmodifiersinherintance;

public class Honda extends Car {

    public Honda(){
        this("R8",2023);
        System.out.println("Honda 1");
    }

    public Honda(String model,int year){
            super("Audi");
        //super()==>Car(); a gider, cunku parametre vermedik.//ama yazmasakta ayni ici gorur,.
        //super() parantezinin icine parametre koydukta kesin yazmak lazim parametre ile birlikte.
        System.out.println("Honda 2: "+model+"-"+year);
    }

}
