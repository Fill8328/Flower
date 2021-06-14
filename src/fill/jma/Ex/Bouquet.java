package fill.jma.Ex;

public class Bouquet {

    public void foo() {

        Flower flower = new Flower();
        flower.name = "Romachka";
        flower.color = "White";

        Flower flower1 = new Flower("Rose", "Red");

        System.out.println(flower.color + " " + flower.name);
        System.out.println(flower1.color + " " + flower1.name);
    }
}
