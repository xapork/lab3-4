package ball.enviroment;

import ball.ReadyPercent;
import ball.Surface;
import characters.Tubik;

public class Pavilion implements ReadyPercent {

    private String pattern;
    private boolean расписана = false;
    private boolean построена = false;

    public Pavilion() {
        this.pattern = "без узора";
    }

    public void построить() {
        построена = true;
        System.out.println("Беседка для оркестра построена");
    }

    public void принятьОркестр() {
        if (!построена) {
            throw new IllegalStateException("Беседка ещё не построена!");
        }
        System.out.println("Оркестр разместился в беседке");
    }

    public void бытьРасписанной(Tubik tubik) {
        Surface surface = new Surface();
        surface.подготовить();

        tubik.draw(surface);

        расписана = true;
        pattern = "затейливый";
        System.out.println("Беседка расписана затейливым узором");
    }

    @Override
    public void prepare() {
        построить();
        System.out.println("Беседка готовится к приёму оркестра");
    }

    @Override
    public int inputBall() {
        return расписана ? 20 : 10;
    }


    @Override
    public boolean equals(Object o) {
        return o instanceof Pavilion;
    }

    @Override
    public int hashCode() {
        return 31;
    }

    @Override
    public String toString() {
        return "БеседкаДляОркестра{" +
                "узор='" + pattern + '\'' +
                ", расписана=" + расписана +
                ", построена=" + построена +
                '}';
    }
}
