package exception;

public class GlassBreakingException extends Exception {
    
    // Конструктор без параметров
    public GlassBreakingException() {
        super();
    }
    
    // Конструктор с сообщением
    public GlassBreakingException(String message) {
        super(message);
    }
    
    // Конструктор с сообщением и причиной
    public GlassBreakingException(String message, Throwable cause) {
        super(message, cause);
    }
}