package ball.enviroment;

import ball.ReadyPercent;

public class Tent implements ReadyPercent {

    private final String цвет;

    public Tent(String colour) {
        this.цвет = colour;
    }

    @Override
    public void prepare() {
        System.out.println("Палатка построена и покрашена в " + цвет);
    }

    @Override
    public int inputBall() {
        return 25;
    }
}
