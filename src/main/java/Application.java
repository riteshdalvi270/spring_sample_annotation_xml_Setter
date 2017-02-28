import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.pluralsight.service.CustomerService;

/**
 * Created by ritesh on 2/18/17.
 */
public class Application {

    public static void main(String args[]) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        final CustomerService customerService = context.getBean("customerService",CustomerService.class);

        System.out.print("FirstName:"+ customerService.findCustomer());
    }
}
