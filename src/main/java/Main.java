
import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        Integer aa = null;
        try{
            int cc = aa;
        }catch (Exception e){
            System.out.println(e);
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
        }

    }
}
