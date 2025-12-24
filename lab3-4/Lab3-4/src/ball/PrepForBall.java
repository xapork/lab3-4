package ball;

import java.util.List;

public class PrepForBall {

    private int готовность = 0;
    private final List<ReadyPercent> steps;

    public PrepForBall(List<ReadyPercent> steps) {
        this.steps = steps;
    }

    public void start() {
        System.out.println("🎭 Подготовка к балу началась");

        for (ReadyPercent step : steps) {
            step.prepare();
            готовность += step.inputBall();
            готовность = Math.min(готовность, 100);
            System.out.println("=> Готовность: " + готовность + "%");
        }
    }

    public int getReadiness() {
        return готовность;
    }
}
