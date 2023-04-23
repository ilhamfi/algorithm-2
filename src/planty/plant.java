package planty;

public class plant {

    protected String color;
    protected String respiration;
    protected String growth;
    protected String nutrition;

    protected String printInfo() {

       return color +" "+ respiration +" "+ growth +" "+ nutrition;

    }

    public plant(String color, String respiration, String growth, String nutrition) {
        this.color = color;
        this.respiration = respiration;
        this.growth = growth;
        this.nutrition = nutrition;
    }


}