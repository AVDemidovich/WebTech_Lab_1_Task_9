package Main;

import Objects.Ball;
import Objects.Basket;

public class Main {

    public static void main(String[] args) {
        Ball firstBlueBall = new Ball(5,"blue");
        Ball secondBlueBall = new Ball(2,"blue");
        Ball thirdBlueBall = new Ball(3,"blue");
        Ball firstGreenBall = new Ball(9,"green");

        Basket basket = new Basket();

        basket.putBall(firstBlueBall);
        basket.putBall(secondBlueBall);
        basket.putBall(thirdBlueBall);
        basket.putBall(firstGreenBall);

        System.out.println("Суммарный вес мячей в корзине: " + basket.getWeightOfBalls());
        System.out.println("Голубых мячей вкорзине: " + basket.getCountBlueBalls());
    }
}
