import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
public static void main(String[] args) {
Resource rs=new ClassPathResource("spring.xml");
BeanFactory bf=new XmlBeanFactory(rs);
A obj1 = bf.getBean("id", A.class);
A obj2 = bf.getBean("id", A.class);

}
}
