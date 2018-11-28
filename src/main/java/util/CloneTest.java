package util;

/**
 * @author jennyhui
 */
public class CloneTest {

    public static void main(String[] args) throws CloneNotSupportedException {
//        JennyHui a = new JennyHui("jenny", "hui");
//        // 引用的复制
//        JennyHui b = a;
//        System.out.println(a);
//        System.out.println(b);

        //  真真正正的克隆了一个对象
        JennyHui c = new JennyHui("andy", "hui");
        JennyHui d = (JennyHui) c.clone();

        System.out.println(c);
        System.out.println(d);

        String result = c.getLastName() == d.getLastName()
                ? "clone是浅拷贝的" : "clone是深拷贝的";

        System.out.println(result);

    }
}
