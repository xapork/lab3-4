package characters;

import java.util.ArrayList;
import java.util.List;

import ball.AbleToDraw;
import ball.Pattern;
import ball.Surface;

public class Tubik extends Citizen implements AbleToDraw {

    public Tubik() {
        super("Tubik");
    }

    protected Tubik(String name) {
        super(name);
    }

    private final List<Pattern> patterns = new ArrayList<>();

    public void addPattern(Pattern pattern) {
        patterns.add(pattern);
    }

    @Override
    public void draw(Surface surface) {
        if (!surface.ready()) {
            throw new IllegalStateException("Поверхность не готова!");
        }
        patterns.forEach(u -> System.out.println("Тюбик рисует " + u));
    }

    @Override
    public void doSmt() {
        throw new UnsupportedOperationException("Unimplemented method 'doSmt'");
    }
}
