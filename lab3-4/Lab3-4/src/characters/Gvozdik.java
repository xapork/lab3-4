package characters;

import exception.GlassBreakingException;

public class Gvozdik extends Citizen {

    public Gvozdik() {
        super("Gvozdik");
        this.setStatus(Status.REEDUCATED); 
    }

    @Override
    public void doSmt() {
        System.out.println("Gvozdik ведет себя прилично");
    }

    public void битьСтекла() throws GlassBreakingException {
        if (this.setStatus() == Status.REEDUCATED) {
            throw new GlassBreakingException("Gvozdik перевоспитан и не может бить стекла!");
        } else {
            System.out.println("Gvozdik бьет стекла!");
        }
    }
    
    public void setReeducated(boolean reeducated) {
        if (reeducated) {
            this.setStatus(Status.REEDUCATED);
        } else {
            this.setStatus(null); 
        }
    }
    

    public boolean isReeducated() {
        return this.setStatus() == Status.REEDUCATED;
    }
}