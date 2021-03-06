package fill.jma.Ex;

public class Flower {

    private String name;
    private String color;
    private int longFlover;
    private double cost;
    private int freshnessLevel;

    public Flower() {
    }

    public int getFreshnessLevel() {
        return freshnessLevel;
    }

    public void setFreshnessLevel(int freshnessLevel) {
        this.freshnessLevel = freshnessLevel;
    }


    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLongFlover() {
        return longFlover;
    }

    public void setLongFlover(int longFlover) {
        this.longFlover = longFlover;
    }

    public Flower(String myFlower, String myColor, int myLongFlower, double myCost, int myFresh) {
        name = myFlower;
        color = myColor;
        longFlover = myLongFlower;
        cost = myCost;
        freshnessLevel = myFresh;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", longFlover=" + longFlover +
                ", cost=" + cost +
                ", freshnessLevel=" + freshnessLevel +
                '}';
    }

    public Flower(String name) {
        this.name = name;
    }

    public Flower(int longFlover) {
        this.longFlover = longFlover;
    }

    public Flower(double cost) {
        this.cost = cost;

    }
}