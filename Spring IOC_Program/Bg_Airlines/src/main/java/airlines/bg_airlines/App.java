package airlines.bg_airlines;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
    	
    	
    	BangaloreFlight obj = (BangaloreFlight) context.getBean("welcome");
    	
    	
    	System.out.println(obj.getMessage());
    	
    }
}
