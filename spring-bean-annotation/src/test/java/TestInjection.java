import com.tango.spring.bean.annotation.web.controller.UserController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestInjection {
    @Test
    public void TestSave() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-context-annotation.xml");

        UserController userController = (UserController) context.getBean("userController");
        userController.save();
    }
}
