package main.app;

import main.service.CalculatorService;

public class MathApplication {

   private CalculatorService calcService;

   
   public void setCalculatorService(CalculatorService calcService){
      this.calcService = calcService;
   }
   
   public double add(double input1, double input2){
	   System.out.println("add"); 
      return calcService.add(input1, input2);
   }
   
   public double subtract(double input1, double input2){
	   System.out.println("substract");
      return calcService.subtract(input1, input2);
   }
   
   public double multiply(double input1, double input2){
	   System.out.println("multiply");
      return calcService.multiply(input1, input2);
   }
   
   public double divide(double input1, double input2){
	   System.out.println("divide");
      return calcService.divide(input1, input2);
   }
	
}
