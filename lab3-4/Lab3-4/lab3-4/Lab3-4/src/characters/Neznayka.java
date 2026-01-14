package characters;

public class Neznayka extends Citizen {

    public Neznayka() {
        super("Neznayka");
    }

    @Override
    public void doSmt() {
        System.out.println("Neznayka суетится и мешает");
        changeMood(Mood.HAPPY);
    }
}
