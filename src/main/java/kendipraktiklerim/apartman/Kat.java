package kendipraktiklerim.apartman;

public class Kat extends Daire{

    public Kat() {
       this(18);

    }

    public Kat(int katNo){

        super(25);
        System.out.println("Kat No: "+katNo);

    }


}
