package ball;

import java.util.Objects;
import java.util.Random;

public class Pattern {

    private final String title;
    private final int complexity ;

    public Pattern(String title, int complexity ) {
        this.title = title;
        this.complexity  = complexity ;
    }

    public boolean бытьЗатейливым() {
        return complexity  > new Random().nextInt(10);
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof Pattern у && title.equals(у.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }

    @Override
    public String toString() {
        return "Pattern{" + title + ", complexity =" + complexity  + '}';
    }
}
