package day15arraysmultidimensionalarrays;

public class C04_Arrays {
    public static void main(String[] args) {

        //Bir arrayin icerisinde herhangi bir elemanin olup olmadigini kontrol eden
        // ve kac kere tekrardandigini gosteren kodu yazin


        int arr[]={5,1,5,-3};

        int counter=0;
        int eleman=-9;

        for (int w : arr) {
            if (w==eleman){
                counter++;
            }
        }

        if (counter>0){
            System.out.println(eleman+" Elemani "+counter+" kere var");
        }else System.out.println(eleman+" Arrayde yok");


    }
}
