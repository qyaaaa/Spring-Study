import com.qy.dao.UserDaoSqlServerImpl;
import com.qy.service.UserServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
//        //用户实际调用的是业务层，dao层不需要他们接触
//        UserServiceImpl userServiceImp1 = new UserServiceImpl();
//        userServiceImp1.setUserDao(new UserDaoSqlServerImpl());
//
//        userServiceImp1.getUser();

        //获取ApplicationContext
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        UserServiceImpl serviceImpl = (UserServiceImpl) context.getBean("UserServiceImpl");

        serviceImpl.getUser();
    }


}
