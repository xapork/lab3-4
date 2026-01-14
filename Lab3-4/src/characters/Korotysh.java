package characters;

import java.util.Objects;

public class Korotysh extends Citizen {

    protected Status status;

    public Korotysh(String name) {
        super(name);
        this.status = Status.NORMAL; 
    }

    @Override
    public void doSmt() {
        System.out.println(name + " занимается своими делами.");
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Korotysh korotysh)) return false;
        return Objects.equals(name, korotysh.name)
                && status == korotysh.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, status);
    }
}