package exception;

import java.io.FileInputStream;
import java.io.IOException;

public class CatchTest {


    public static void ttt(){
        try{
            System.out.println("1");
        }catch (Exception e){
            System.out.println("2");
        }

        try{
            System.out.println("3");
        }finally {
            System.out.println("release");
        }
    }

    public static void ttt1() throws Exception {
        try(MyAutoClosable myAutoClosable = new MyAutoClosable()){
            myAutoClosable.doIt();
        }
    }

    public static void main(String[] args) throws Exception {
        ttt1();
    }
}
