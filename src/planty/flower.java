package planty;

public class flower extends plant{
    protected String name;

    public flower(String color, String respiration, String growth, String nutrition, String name) {
        super(color, respiration, growth, nutrition);
        this.name = name;
    }

    public static void main(String[] args) {
        flower flower1=new flower("red","o2","unlimited","water","rose");
        System.out.println(flower1.printInfo());
    }
}
