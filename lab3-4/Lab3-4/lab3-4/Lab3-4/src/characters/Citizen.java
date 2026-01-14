package characters;

import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Citizen {

    protected String name;
    protected Mood mood;

    protected Citizen(String name) {
        this.name = name;
        this.mood = getRandomMood();
    }
    private Mood getRandomMood() {
        Mood[] moods = Mood.values();
        return moods [
            ThreadLocalRandom.current().nextInt(moods.length)
        ];
    }
    public abstract void doSmt();

    public void changeMood(Mood newMood) {
        this.mood = newMood;
        System.out.println(name + " теперь в настроении: " + mood);
    }

    public void reactToFound(Citizen foundCitizen) {
    if (foundCitizen == null || foundCitizen == this) {
        return;
    }

    String reaction;

    switch (mood) {
        case HAPPY -> reaction = "искренне радуется, что нашёлся ";
        case SAD -> reaction = "с облегчением замечает, что найден ";
        case CALM -> reaction = "спокойно реагирует на находку ";
        default -> reaction = "реагирует на находку ";
    }

    System.out.println(name + " " + reaction + foundCitizen.getName());
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Citizen citizen)) return false;
        return Objects.equals(name, citizen.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Citizen{" +
                "name='" + name + '\'' +
                ", mood=" + mood +
                '}';
    }
}