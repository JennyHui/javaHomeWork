package util.GenericsTest;

public class GenericsTest {

    /**
     * 泛型方法
     * @param c 用来创建泛型对象
     * @param <T> 声明一个泛型T
     * @return
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    public <T> T getObject(Class<T> c) throws IllegalAccessException, InstantiationException {
        T t = c.newInstance();
        return t;
    }

    /**
     *  <T> : 声明此方法持有一个类型T，也可以理解为声明此方法为泛型方法
     *  T : 指明改方法返回一个类型T
     *  Class<T> : 作用是指明泛型T的类型
     *  c : 用来创建泛型T代表的类的对象
     *
     */

    public static void main(String[] args) {

        /**
         * 上界
         */
        Plate<? extends Fruit> p = new Plate<Apple>(new Apple());
        //不能存入任何元素
        //  p.set(new Fruit()); //Error
        //  p.set(new Apple()); //Error
        //  读取出来的东西只能存放在Fruit或它的基类里。
        Fruit newFruit1=p.get();
        Object newFruit2=p.get();
        //  Apple newFruit3=p.get(); //Error

        /**
         * 下界
         */
        Plate<? super Fruit> f = new Plate<Fruit>(new Fruit());
        //存入元素正常
        f.set(new Fruit());
        f.set(new Apple());
        //读取出来的东西只能存放在Object类里。
//        Apple newFruit3=f.get(); //Error
//        Fruit newFruit1=f.get(); //Error
        Object newFruit3=f.get();
    }



}


