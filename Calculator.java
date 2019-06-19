import java.util.*;
 
public class Calculator {
     
	// Проверка, является ли строка числом 
	public static boolean isNumeric(String str) {
		return str.matches("^[0-9]*$"); 
	}
   
	// Выполнение арифметической операции и вывод результата
	public static void calculate(Arguments arguments, String[] tokens)  throws ArithmeticException {
	      int result = 0;
	      switch (tokens[1].charAt(0)) {
	          case '+':
	              result = arguments.getFirstArg()
	                      + arguments.getSecondArg();
	              break;
	          case '-':
	              result = arguments.getFirstArg()
	                      - arguments.getSecondArg();
	              break;
	          case '*':
	              result = arguments.getFirstArg()
	                      * arguments.getSecondArg();
	              break;
	          case '/':
	              result = arguments.getFirstArg()
	                      / arguments.getSecondArg();
	         default: throw new ArithmeticException();  
	          
	      }
	 
	      System.out.println(result);
	  }
	         
	      
	    public static void main(String[] args) throws ArrayIndexOutOfBoundsException, NullPointerException {
	 
	        Scanner userInput = new Scanner(System.in);
	 
	        System.out.println("Введите выражение");
	        String expression = userInput.nextLine(); 
	          
	        String[] tokens = expression.split(" ");
	        
	  
	         
	        try {
	        	// Проверка формата операндов 
	        	if (  isNumeric(tokens[0]) && isNumeric(tokens[2]) ) {
	        		Arguments arguments = new Arabic(tokens[0], tokens[2]);
	        		calculate(arguments, tokens);      
	        	} else if (  !(isNumeric(tokens[0])) && !(isNumeric(tokens[2])) ) {
	        		Arguments arguments = new Roman(tokens[0], tokens[2]);  
	        		calculate(arguments, tokens);
	        	}
	        } 
	        catch (Exception e) {
	            System.out.println("Некорректное выражение");
	        } 
	        finally {  
	          userInput.close();
	        }  
	         
	         
	    }
	}