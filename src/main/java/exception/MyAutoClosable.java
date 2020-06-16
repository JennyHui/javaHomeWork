package exception;

public class MyAutoClosable implements AutoCloseable{
    public void doIt() throws Exception {
        System.out.println("MyAutoClosable doing it!");
        throw new Exception("do it breaking");
    }

    @Override
    public void close() throws Exception{
        System.out.println("MyAutoCloseable Closed!");
    }
}
