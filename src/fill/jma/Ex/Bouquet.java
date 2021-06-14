package fill.jma.Ex;

import java.util.Arrays;

public class Bouquet extends VarietiesOfRose {

    private Flower [] fifteenRose = new Flower[15];

    public void RoseBouquet(){
        this.fifteenRose = fifteenRose;
    }

    @Override
    public String toString() {
        return "Bouquet{" +
                "fifteenRose=" + Arrays.toString(fifteenRose) +
                '}';
    }

    public Flower[] getFifteenRose() {
        return fifteenRose;
    }

    public void setFifteenRose(Flower[] fifteenRose) {
        this.fifteenRose = fifteenRose;
    }

}
