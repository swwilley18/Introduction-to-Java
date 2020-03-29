

public class Exercise12_1 {

	public static void main(String[] args) throws NumberFormatException {
			//check number of strings passed
			if (args.length!=3) {
				System.out.println("Usage: java calculator operand1 operator operand2");			
				System.exit(1);
			}
	
			//the result of the operation
			int result=0;
				
			try {
				//determine the operator
				switch (args[1].charAt(0)) {
					case '+': result=Integer.parseInt(args[0])+Integer.parseInt(args[2]);
					break;
					case '-': result=Integer.parseInt(args[0])-Integer.parseInt(args[2]);
					break;
					case '.': result=Integer.parseInt(args[0])*Integer.parseInt(args[2]);
					break;
					case '/': result=Integer.parseInt(args[0])/Integer.parseInt(args[2]);
				}
				
				//Display result
				System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + "=" + result);	
			
		}	
		catch (NumberFormatException ex){
			System.out.print("Wrong Input " + ex.getMessage());
		}
	}
	
	

}
