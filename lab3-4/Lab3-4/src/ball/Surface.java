package ball;

public class Surface {

    private boolean ready;

    public void подготовить() {
        ready = true;
        System.out.println("Поверхность подготовлена для росписи");
    }

    public boolean ready() {
        return ready;
    }
}
