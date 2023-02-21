import com.qf.service.HouseService;
import com.qf.service.impl.HouseServiceImpl;
import com.qf.test.MyClass;
import com.qf.test.TestModel;
import com.qf.test.TestModel2;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringFactory {

    @Test
    public void test() {
        //  获取 path， 注意  resource 就是 根目录
        String path = "applicationContext.xml";

        // get the context(容器, because all the beans are in the context)
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(path);

        // now get the bean
        MyClass myClass = context.getBean("myClass", MyClass.class);

        // conduct the test() in MyClass
        myClass.test();



    }

    @Test
    public void testSetDI() {
        String path = "applicationContext.xml";

        // get the context(容器, because all the beans are in the context)
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(path);

        // now get the bean
        TestModel testModel = context.getBean("testModel", TestModel.class);

        System.out.println(testModel.toString());
    }

    @Test
    public void testConstructorDI() {
        String path = "applicationContext.xml";

        // get the context(容器, because all the beans are in the context)
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(path);

        // now get the bean
        TestModel2 testModel2 = context.getBean("testModel2", TestModel2.class);

        System.out.println(testModel2.toString());
    }

    @Test
    public void TestAutoDI() {
        String path = "applicationContext.xml";

        // get the context(容器, because all the beans are in the context)
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(path);

        HouseServiceImpl houseService = context.getBean("houseService", HouseServiceImpl.class);
        houseService.findHouseById();
    }
}
