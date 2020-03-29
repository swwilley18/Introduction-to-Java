import java.util.Scanner;
import java.util.Arrays;

public class Exercise7_15 {
	//Main method
	public static void main(String[] args) {
		//Create Array
		int[] numList=createArray();
		
		//Display Original Array
		System.out.println("\nThe numbers you entered are:");
		displayArray(numList);
		
		//sort array
		Arrays.sort(numList);
		
	    //remove duplicates
		int[] newList=eliminateDuplicates(numList);
		
		//remove empty elements
		newList=removeZeros(newList, 0); 
							
		//display results	
		System.out.println("\n\nYour list without duplicates, in order, is: ");
		displayArray(newList);		
	}
	
	//Creates an array from user input
	public static int[] createArray() {
		//create scanner
		Scanner input=new Scanner(System.in);

		//Create Array for 10 numbers
		int[] numList=new int[10];
		
		//get 10 values from the user
		System.out.println("Enter 10 numbers to compare:");
		
		//prompt the user to enter numbers
		for (int i=0; i<10; i++) {
			System.out.print("Num " + (i+1) +": ");
			numList[i]=input.nextInt();
		}		
		return numList;
	}
	
	//Displays original Array to the user
	public static void displayArray(int[] numList) {
		//display the integers in the original array
		for (int i=0; i<numList.length; i++) {
			System.out.print(numList[i] + " ");
		}
	}
	
	//removes duplicates from array
	public static int[] eliminateDuplicates(int[] numList) {
		//create new array to store deduplicated array
		int[] newList=new int[numList.length];
		int i=0; //newList index
		
		//check each element in numList
		for (int e: numList) {
			//call linear search method on each element to check for duplicates
			if (linearSearch(newList, e)==-1) {
				//if linear search returns -1, then add that element to the newList
				newList[i]=e;
				i++;
			}
		}
		//return list without duplicates to main method
	    return newList;		
     }
	
	//Searches for duplicate
	//pass array and key to search 
	public static int linearSearch(int[] array, int key) {
		//use linear search to step through each element in the array 
		for (int i=0; i<array.length; i++) {
			//if key matches then 
			if (key==array[i])
				//returning i causes the eliminateDuplicates method to skip this element from being
				//added to the newList
				return i;
		}
		//returning -1 causes eliminateDuplicates to execute if statement
		return -1;
	}
	
	//removes added default zeros from array
	//pass array and the value to remove from the array
	private static int[] removeZeros(int[] array, int remove)
    {
		//initialize increment counter
        int count = 0;
        //assign the length of the original array to a variable
        int arrayLength = array.length;

        //traverse each element
        for (int i = 0; i < array.length; i++)
        {
        	//if the element matches value to be removed then increment counter
            if (array[i] == remove)
                count++;
        }
        
        //create a new array to hold filtered values
        //subtract count from original array length to get new array length
        int[] newList = new int[arrayLength - count];
        //initialize index counter for new array
        int j = 0;
        //traverse array until the last value has been reached
        for (int i = 0; i < array.length; i++)
        {
        	//if the element at index i is not equal to the key value
        	//then add it to the new array
            if (array[i] != remove)
            {	
            	//add value to new array
                newList[j] = array[i];
                j++;
            }
        }
        //return the cleaned array to the main method  
        return newList;
    }
}

