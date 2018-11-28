package Spring.DiDemo2;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author jennyhui
 * 使用@ComponentScan 默认扫描相同的包路径下的组件
 * 使用@Configuration 说明这个是一个配置类
 */
@ComponentScan
@Configuration
public class CDPlayerConfig {
}
