import com.cj.pojo.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description: 测试类
 * @Author: chenj
 * @Date: 2020/11/13
 **/
public class SprintTest {

    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "applicationContext.xml" });
        Product product = (Product) context.getBean("product");
        System.out.println(product.getProductName());
        System.out.println(product.getCategory().getCategoryName());

    }
}
