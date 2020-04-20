import com.tango.spring.bean.autowire.domain.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutowire {
    @Test
    public void TestUserAutowire(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-context-autowire.xml");

        User user = (User) context.getBean("user");
        System.out.println(user);
    }
}
