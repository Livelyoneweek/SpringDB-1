package hello.jdbc.repository.ex;

/**
 * 데이터 중복인 경우메만 던질 예외임
 */
public class MyDuplicateKeyException extends MyDbException{
    
    public MyDuplicateKeyException() {
    }

    public MyDuplicateKeyException(String message) {
        super(message);
    }

    public MyDuplicateKeyException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyDuplicateKeyException(Throwable cause) {
        super(cause);
    }
}
