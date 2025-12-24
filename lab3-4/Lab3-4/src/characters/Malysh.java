package characters;

import java.util.ArrayList;
import java.util.List;

import ball.ReadyPercent;
import ball.Work;
import ball.enviroment.Pavilion;

public class Malysh extends Citizen implements ReadyPercent {

    private final List<Work> works = new ArrayList<>();

    public Malysh (String name) {
        super(name);
    }

    public void addWork(Work work) {
        works.add(work);
    }

    @Override
    public void doSmt() {
        prepare();
    }

    @Override
    public void prepare() {
        System.out.println(name + " выполняет работы");
        works.forEach(Work::выполнить);
    }

    @Override
    public int inputBall() {
        return 15;
    }
}
