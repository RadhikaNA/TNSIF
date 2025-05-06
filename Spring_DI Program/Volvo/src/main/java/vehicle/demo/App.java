package vehicle.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        
    	ApplicationContext con = new ClassPathXmlApplicationContext("beans.xml");
    	
    	Car c = (Car) con.getBean("car");
    	
    	
    	System.out.println("Car has a wheel of size: "+c.getWheelObj().getWheelsize());
    	
    	
    	
    	
    }
}
