package ball;

import java.util.Objects;

public class Decorating {

    private final String style;
    private final String colour;

    public Decorating(String style, String colour) {
        this.style = style;
        this.colour = colour;
    }

    public void повесить() {
        System.out.println("Украшение " + style + " (" + colour + ") повешено");
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof Decorating у &&
                style.equals(у.style) &&
                colour.equals(у.colour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(style, colour);
    }

    @Override
    public String toString() {
        return "Украшение{" + style + ", " + colour + '}';
    }
}
