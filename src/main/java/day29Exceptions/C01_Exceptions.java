package day29Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_Exceptions {

    public static void main(String[] args) throws IOException {//burda: Dosya bulamama hatasi olabilir diyor.

    /*6) FileNotFoundExceptions
     7)IOExceptions21
    Javada bir dataya ulasmak istedigimizde kullaniriz.Bir obje olustururuz.
    Cesitli methodlari vardir.
    read()==> Task'teki datalari okuyor ve getiriyor. Okuyacak hicbir data kalamadiginda  -1 donduruyor.
    skip()==> Belirli bir kismi atlayip kalan datalari dondurur.
    avaliable()==> Tast'te kac byte'lik data oldugunu size gosterir.

*/
        FileInputStream fis=new FileInputStream("src/main/java/day29Exceptions/TaskExceptions");

        int i;

        try {
            while ( (i = fis.read()) != -1){//Data bitene kadar donmesini saglar
                System.out.print((char)i);
            }
        } catch (FileNotFoundException e) {
            System.err.print("File path yanlis yada dosya silinmis: "+ e.getMessage());
          //  e.printStackTrace();
        }catch (IOException e){

            System.err.println("Dosya okurken problem olustu"+ e.getMessage());
       }

        System.out.println("Devam ");


    }
}
