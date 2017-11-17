package test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import test.app.MathApplicationTestWithMockMethod;
import test.app.MathApplicationTester;
import test.app.MathApplicationTesterUsingCallbacks;
import test.app.MathApplicationTesterUsingInOrder;

public class TestRunner {

   public static void main(String[] args) {
      Result result = JUnitCore.runClasses(MathApplicationTester.class);
	  Result result2 = JUnitCore.runClasses(MathApplicationTestWithMockMethod.class);
	  Result result3 = JUnitCore.runClasses(MathApplicationTesterUsingInOrder.class);
	  Result result4 = JUnitCore.runClasses(MathApplicationTesterUsingCallbacks.class);

	  printFailures(result);
	  printFailures(result2);
	  printFailures(result3);
	  printFailures(result4);
      
      System.out.println("From MathApplicationTester: " + result.wasSuccessful());
      System.out.println("From MathApplicationTestWithMockMethod: " + result2.wasSuccessful());
      System.out.println("From MathApplicationTesterUsingInOrder: " + result3.wasSuccessful());
      System.out.println("From MathApplicationTesterUsingCallbacks: " + result4.wasSuccessful());
   }
   
   public static void printFailures(Result result) {
	  for (Failure failure : result.getFailures()) {
         System.out.println("From " + result.getClass() + " : " + failure.toString());
      }
   }
	
}
