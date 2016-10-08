package Objects;

/**
 * Created by Alexander_Demidovich on 10/8/2016.
 */
public class Ball {
    private  double weight = 0;
    private String color;

    public Ball(double weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
