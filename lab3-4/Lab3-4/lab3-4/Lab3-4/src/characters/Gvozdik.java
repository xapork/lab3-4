package characters;

import exception.GlassBreakingException;

public class Gvozdik extends Korotysh {

    public Gvozdik() {
        super("Гвоздик");
        setStatus(Status.REEDUCATED);
    }

    @Override
    public void doSmt() {
        System.out.println("Гвоздик спокойно стирает одежду у реки.");
    }

    public void битьСтекла() throws GlassBreakingException {
        if (status == Status.REEDUCATED) {
            throw new GlassBreakingException(
                "Гвоздик перевоспитан и больше не бьет стекла."
            );
        }
        System.out.println("Гвоздик бьет стекла!");
    }

    public boolean isReeducated() {
        return status == Status.REEDUCATED;
    }
}