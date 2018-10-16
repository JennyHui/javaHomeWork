package Spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");// 加载Spring上下文
        Knight knight = (Knight) context.getBean("knight");// 获取knight Bean
        knight.embarhOnQuest();// 使用knight
    }
}
