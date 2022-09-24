package TestPack;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNg {

	
	
	
	@BeforeClass
    public void beforeClass()
    {
    	System.out.println("Before class");
    	
    	
    }
    
    
   @BeforeMethod
   public void beforeNethod()
   {
	   System.out.println("Before Method");
	   
	   
   }
   
   
   @Test
   public void test123()
   {
	   
   }
}
