import com.by.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wangby
 * @version 0.0.1
 * @date 2020-10-04 3:22
 * @update 2020-10-04 3:22
 */
public class MyTest {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    @Test
    public void test01() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user);
    }

}
