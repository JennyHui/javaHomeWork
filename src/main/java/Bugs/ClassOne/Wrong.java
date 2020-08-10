package Bugs.ClassOne;

import java.util.HashMap;
import java.util.Map;

public class Wrong {
    private static final ThreadLocal<Integer> currentUser = ThreadLocal.withInitial(() -> null);

    public static Map inputUserId(Integer userId){
        try{
            //设置用户信息之前先查询一次ThreadLocal中的用户信息
            String before  = Thread.currentThread().getName() + ":" + currentUser.get();
            //设置用户信息到ThreadLocal
            currentUser.set(userId);
            //设置用户信息之后再查询一次ThreadLocal中的用户信息
            String after  = Thread.currentThread().getName() + ":" + currentUser.get();
            //汇总输出两次查询结果
            Map result = new HashMap();
            result.put("before", before);
            result.put("after", after);
            return result;
        }finally {
            currentUser.remove();
        }


    }

    public static void main(String[] args) {
        System.out.println(inputUserId(1));
        System.out.println(inputUserId(2));
        System.out.println(inputUserId(3));
    }

}
