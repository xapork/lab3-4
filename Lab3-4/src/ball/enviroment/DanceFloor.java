package ball.enviroment;

import ball.ReadyPercent;

public class DanceFloor implements ReadyPercent {

    private final String size;

    public DanceFloor(String size) {
        this.size = size;
    }

    @Override
    public void prepare() {
        System.out.println("Танцевальная площадка (" + size + ") готова");
    }

    @Override
    public int inputBall() {
        return 40;
    }
}

