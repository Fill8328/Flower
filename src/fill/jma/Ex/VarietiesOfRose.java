package fill.jma.Ex;

import java.util.Arrays;

public class VarietiesOfRose {
    public static void Rose() {

        Flower AvalancheOne = new Flower("Rose Avalanche", "White", 40, 1.8, 1);
        Flower AvalancheTwo = new Flower("Rose Avalanche", "White", 50, 2, 1);
        Flower AvalancheThree = new Flower("Rose Avalanche", "White", 60, 2.2, 1);
        Flower AvalancheOneWilted = new Flower("Rose Avalanche", "White", 40, 1, 2);
        Flower AvalancheTwoWilted = new Flower("Rose Avalanche", "White", 50, 1.2, 2);
        Flower AvalancheThreeWilted = new Flower("Rose Avalanche", "White", 60, 1.4, 2);

        Flower AvalanchePeachOne = new Flower("Rose Avalanche Peach", "Peach", 40, 1.8, 1);
        Flower AvalanchePeachTwo = new Flower("Rose Avalanche Peach", "Peach", 50, 2, 1);
        Flower AvalanchePeachThree = new Flower("Rose Avalanche Peach", "Peach", 60, 2.2, 1);
        Flower AvalanchePeachOneWilted = new Flower("Rose Avalanche Peach", "Peach", 40, 1, 2);
        Flower AvalanchePeachTwoWilted = new Flower("Rose Avalanche Peach", "Peach", 50, 1.2, 2);
        Flower AvalanchePeachThreeWilted = new Flower("Rose Avalanche Peach", "Peach", 60, 1.4, 2);

        Flower PennyLaneOne = new Flower("Rose Penny Lane", "Yellow", 40, 1.8, 1);
        Flower PennyLaneTwo = new Flower("Rose Penny Lane", "Yellow", 50, 2, 1);
        Flower PennyLaneOneWilted = new Flower("Rose Penny Lane", "Yellow", 40, 1, 2);
        Flower PennyLaneTwoWilted = new Flower("Rose Penny Lane", "Yellow", 50, 1.2, 2);

        Flower NaomiOne = new Flower("Rose Naomi", "Red", 40, 1.9, 1);
        Flower NaomiTwo = new Flower("Rose Naomi", "Red", 50, 2.1, 1);
        Flower NaomiThree = new Flower("Rose Naomi", "Red", 60, 2.3, 1);
        Flower NaomiOneWilted = new Flower("Rose Naomi", "Red", 40, 1.2, 2);
        Flower NaomiTwoWilted = new Flower("Rose Naomi", "Red", 50, 1.4, 2);
        Flower NaomiThreeWilted = new Flower("Rose Naomi", "Red", 60, 1.6, 2);

        Flower FifteenRoseBouquet[] = new Flower[3];
        FifteenRoseBouquet[0] = NaomiOne;
        FifteenRoseBouquet[1] = PennyLaneOne;
        FifteenRoseBouquet[2] = AvalanchePeachOneWilted;

            System.out.println(NaomiOne.toString());
        }
        


    }

