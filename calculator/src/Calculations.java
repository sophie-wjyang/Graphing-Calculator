public class CalcTest {

	public static void main(String[] args) {
		//declaring variables and arrays
		String equation = "62/3";
		String temp = "";
		char [] equationArray = equation.toCharArray(); //convert equation to an array of characters
		String [] numbersArray = new String [equation.length()];
		String [] operationsArray = new String [equation.length()];
		int j = 0, k = 0;
		int count = 0, count2 = 0;
		int result = 0;
		
		//still need to do:
		//input decimals
		//input negative numbers
		//ouput decimal numbers (doesn't evenly divide)
		//number starting with 0
		//error messages (equation starts with an operator, multiple operators in a row, 
	
		
		//creating two arrays: one for numbers and one for operators
		for(int i = 0; i < equation.length(); i++) {
			if(equationArray[i] != '+' && equationArray[i] != '-' && equationArray[i] != '*' && equationArray[i] != '/') {
				temp += equationArray[i];
				numbersArray [j] = temp;
			}
			else {
				j++;
				temp = "";
				operationsArray [k] = Character.toString(equationArray[i]);
				
				k++;
			}
		}


		//counting the non-null strings in numbersArray
		for(int i = 0; i < equation.length(); i++) {
			if(numbersArray[i] != null) {
				count++;
			}
		}
		
		
		//TEST CODE
		System.out.println("numbersArray and operationsArray:");
		System.out.println("numbers:");
		for(int i = 0;  i < count; i++) {
			System.out.println(numbersArray[i]);
		}
		
		System.out.println("operations:");
		for(int i = 0;  i < count-1; i++) {
			System.out.println(operationsArray[i]);
		}
		
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		//declaring new arrays
		int [] newNumbersArray = new int [count];
		String [] newOperationsArray = new String [count-1];
		int m = 0, n = 0;
		
		
		
		
		//multiplication and division
		for(int i = 0; i < count-1; i++) {
			if(operationsArray [i].equals("*")) {
				numbersArray [i+1] = Integer.toString(Integer.parseInt(numbersArray [i])*Integer.parseInt(numbersArray [i+1]));
				numbersArray [i] = null;
				operationsArray [i] = null;
			}
		}
		for(int i = 0; i < count-1; i++) {
			if(operationsArray [i].equals("/")) {
				numbersArray [i+1] = Integer.toString(Integer.parseInt(numbersArray [i])/Integer.parseInt(numbersArray [i+1]));
				numbersArray [i] = null;
				operationsArray [i] = null;
			}
		}
		
		
		
		
		
		
		
		//getting rid of null values in numbersArray  
		for(int i = 0; i < count; i++) {
			if(numbersArray [i] != null){
				newNumbersArray [m] = Integer.parseInt(numbersArray[i]);
				m++;
			}
		}
		 
		//getting rid of null values in operationsArray
		for(int i = 0; i < count-1; i++) {
			if(operationsArray [i] != null){
				newOperationsArray [n] = operationsArray[i];
				n++;
			}
		}
		
				
		
		
		
		
		
		
		
		
		
		//TEST CODE
		System.out.println("newNumbersArray and newOperationsArray:");
		System.out.println("numbers:");
		for(int i = 0;  i < count; i++) {
			System.out.println(newNumbersArray[i]);
		}
		
		System.out.println("operations:");
		for(int i = 0;  i < count-1; i++) {
			System.out.println(newOperationsArray[i]);
		}
		
		
		
		//counting the non-null strings in newNumbersArray
		for(int i = 0; i < count; i++) {
			if(newNumbersArray[i] != 0) {
				count2++;
			}
		}
		
				
		
		
		
		
		
		
		
		//add and subtract
		result = newNumbersArray[0];
		
		for(int i = 0; i < count2-1; i++) {
			if(newOperationsArray[i].equals("+")){
				result += newNumbersArray[i+1];
			}
			else if(newOperationsArray[i].equals("-")){
				result += - newNumbersArray[i+1];
			}
		}
		
		System.out.println();
		System.out.println("Answer: " + result);
			
	}

}
