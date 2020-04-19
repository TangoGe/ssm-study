import com.tango.spring.study.first.collection.MyCollection;
import com.tango.spring.study.first.dao.IUserDao;
import com.tango.spring.study.first.dao.impl.UserDaoImpl;
import com.tango.spring.study.first.domain.User;
import com.tango.spring.study.first.factory.DaoFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
    public static void main(String[] args) {
        //初始化上下文容器
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        //从上下文中获取一个bean
        IUserDao bean = (IUserDao) context.getBean("userDao");
        //调用bean定义的方法
        bean.Test("Bean 常用的装配方式");

        //使用使用工厂类获取bean的实例
        DaoFactory daoFactory = context.getBean("daoFactory", DaoFactory.class);
        IUserDao testDao = daoFactory.getUserDao();
        testDao.Test("使用使用工厂类获取bean的实例");

        //使用 Spring 的动态工厂 Bean
        IUserDao testDaoByFactory = context.getBean("userDaoByFactory", UserDaoImpl.class);
        testDaoByFactory.Test("使用 Spring 的动态工厂 Bean");

        //Bean 的作用域
        //Single
        IUserDao userDaoSingleA = (IUserDao) context.getBean("userDaoSingle");
        IUserDao userDaoSingleB = (IUserDao) context.getBean("userDaoSingle");
        System.out.println("userDaoSingleA==userDaoSingleB:" + (userDaoSingleA == userDaoSingleB));
        //prototype
        IUserDao userDaoPrototypeA = (IUserDao) context.getBean("userDaoPrototype");
        IUserDao userDaoPrototypeB = (IUserDao) context.getBean("userDaoPrototype");
        System.out.println("userDaoPrototypeA==userDaoPrototypeB:" + (userDaoPrototypeA == userDaoPrototypeB));

        //init-method 和 destroy-method 方法
        ClassPathXmlApplicationContext contextXml = new ClassPathXmlApplicationContext("spring-context.xml");
        IUserDao userDaoInitAndDestroyMethod = (IUserDao) contextXml.getBean("userDaoInitAndDestroyMethod");
        userDaoInitAndDestroyMethod.Test("执行init-method 和 destroy-method 方法");
        contextXml.close();

        //属性注入
        User userProperty = (User) context.getBean("userProperty");
        System.out.println("属性注入:" + userProperty.toString());

        //构造注入
        User userConstructor = (User) context.getBean("userConstructor");
        System.out.println("构造注入:" + userConstructor.toString());


        //复杂类型的注入
        MyCollection collection = (MyCollection) context.getBean("collection");
        System.out.println(collection.toString());


    }
}
