import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorld {
 public static void main(String args[]) {
  ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "spring.xml" });

  ChildBean childBean = context.getBean("child", ChildBean.class);

  System.out.println(childBean);

  ((ClassPathXmlApplicationContext) context).close();
 }
}