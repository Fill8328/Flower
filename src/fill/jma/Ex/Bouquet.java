package fill.jma.Ex;

public class Bouquet extends VarietiesOfRose {



    private Flower [] fifteenRose = new Flower[15];


    public void RoseBouquet(){
        this.fifteenRose = fifteenRose;
    }

    public Flower[] getFifteenRose() {
        return fifteenRose;
    }

    public void setFifteenRose(Flower[] fifteenRose) {
        this.fifteenRose = fifteenRose;
    }

    public void RoseBouquet(Flower [] fifteenRose){
        fifteenRose[0] = new Flower();
    }

}
