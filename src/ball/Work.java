package ball;

public class Work {

    private boolean done;
    private final String описание;

    public Work(String описание) {
        this.описание = описание;
    }

    public void выполнить() {
        done = true;
        System.out.println("Работа выполнена: " + описание);
    }

    public void add(Work work) {
        
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }
}
