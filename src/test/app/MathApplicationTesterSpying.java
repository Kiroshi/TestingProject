package test.app;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import main.app.MathApplication;
import main.service.CalculatorService;
import main.service.impl.Calculator;

import static org.mockito.Mockito.*;

//@RunWith attaches a runner with the test class to initialize the test data
@RunWith(MockitoJUnitRunner.class)
public class MathApplicationTesterSpying {

   private MathApplication mathApplication;
   private CalculatorService calcService;

   
   @Before
   public void setUp(){
      mathApplication = new MathApplication();
      Calculator calculator = new Calculator();
      calcService = spy(calculator);
      mathApplication.setCalculatorService(calcService);	     
   }

   @Test
   public void testAdd(){
      //perform operation on real object
      //test the add functionality
      Assert.assertEquals(mathApplication.add(20.0, 10.0),30.0,0);
   }
	
}
