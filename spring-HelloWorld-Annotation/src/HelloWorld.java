
public class HelloWorld {
 public static void main(String args[]) {
  ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "myConfiguration.xml" });

  Book book = context.getBean("book1", Book.class);

  System.out.println(book);

  ((ClassPathXmlApplicationContext) context).close();
 }
}