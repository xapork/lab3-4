package ball;

import java.util.Objects;

public class Flowers {

    private final String kind;
    private final String colour;

    public Flowers(String kind, String colour) {
        this.kind = kind;
        this.colour = colour;
    }

    public void украсить() {
        System.out.println("Flowers " + kind + " (" + colour + ") украшает площадку");
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof Flowers f && kind.equals(f.kind);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kind);
    }

    @Override
    public String toString() {
        return "Flowers{" + kind + ", " + colour + '}';
    }
}

