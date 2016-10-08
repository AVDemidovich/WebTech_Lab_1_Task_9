package Objects;

/**
 * Created by Alexander_Demidovich on 10/8/2016.
 */

import java.util.HashMap;
import java.util.Map;

public class Basket {
    private Map<Integer, Ball> balls = new HashMap();

    public double getWeightOfBalls(){
        double WeightOfBalls = 0;
        for (int i=0;i<balls.size();i++){
            WeightOfBalls += balls.get(i).getWeight();
        }
        return  WeightOfBalls;
    }

    public void putBall(Ball ball){
        balls.put(balls.size(),ball);
    }

    public int getCountBlueBalls() {
        int countOfBlueBalls = 0;
        for (int i = 0; i < balls.size();i++){
            if (balls.get(i).getColor().compareTo("blue") == 0)
                countOfBlueBalls++;
        }
        return countOfBlueBalls;
    }
}
