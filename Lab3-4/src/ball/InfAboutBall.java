package ball;
import java.time.LocalDate;
public record InfAboutBall( 
    LocalDate data,
    String place,
    String startTime,
    int readyInPercent
    
) {}
