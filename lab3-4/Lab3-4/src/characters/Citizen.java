package characters;
import java.util.Objects;
import java.util.Random;

public abstract class Citizen {
    protected String name;
    protected String mood = "спокойное";
    protected Status status;

    protected Citizen(String name) {
        this.name = name;
        
    }
    public abstract void doSmt();
    public void changeMood(String recent) {
        mood = recent;
        System.out.println(name + "теперь в настроении: " + mood);
    }
    public void reactToFound(Citizen foundCitizen) {
        if (foundCitizen.setStatus() == Status.FOUND) {
            this.mood = "рад";
            this.status = Status.HAPPY;
            System.out.println(name + " рад, что найден " + foundCitizen.getName());
        }
    }
    public Status setStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }
    public String getName() {
        return name;
    }
    @Override 
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Citizen citizen)) return false;
        return Objects.equals(name, citizen.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Житель{" + "имя='" + name + '\'' + ", настроение='" + mood + '\'' + '}';
    }

   
}
