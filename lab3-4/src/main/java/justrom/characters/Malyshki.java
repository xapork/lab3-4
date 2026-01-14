package characters;

import java.util.ArrayList;
import java.util.List;

import ball.Flowers;
import ball.ReadyPercent;
import ball.Decorating;

public class Malyshki extends Citizen implements ReadyPercent {

    public Malyshki (String name) {
        super(name);
    }

    private final List<Flowers> flowers = new ArrayList<>();
    private final List<Decorating> decoratings = new ArrayList<>();

    public void addFlowers(Flowers flower) {
        flowers.add(flower);
    }

    public void addDecorating(Decorating decorating) {
        decoratings.add(decorating);
    }

    @Override
    public void prepare() {
        System.out.println("Malyshki украшают площадку");
        flowers.forEach(Flowers::украсить);
        decoratings.forEach(Decorating::повесить);
    }

    public int inputBall() {
        return 20;
    }

    @Override
    public void doSmt() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'doSmt'");
    }

}
