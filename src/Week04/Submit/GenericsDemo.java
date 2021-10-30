/*
Name: Eugenio Montealegre
Course: COSC 2436
Date: 09/26/21
Assignment Description: Uses has a generics bubble sort algorithm.
*/

package Week04.Submit;

public class GenericsDemo
{
	public static <E extends Comparable<E>> void bubblesort(E aList[]){

		int size = aList.length; // array size

		for(int i = 0; i < size-1; i++){

			for(int j = 0; j < size-i-1;j++){

				if(aList[j].compareTo(aList[j+1]) > 0){
					//Swapp  j+1 and j 
					E temp = aList[j];
					aList[j] = aList[j+1];
					aList[j+1]=temp;
				}
				
			}
		}

	}



	// Function to print an array
	public static <E> void print(E[] list){
		// int n= list.length;
		for (int i=0; i < list.length; i++){
			System.out.print("["+list[i] + "] ");
		}
		System.out.println();
		
	}


	// Driver program
	public static void main(String args[])
	{

		// Array of Integers
		Integer myInts[]={9 ,14, 3, 2, 43 ,11, 58 ,22};
		
		// Array of doubles
		Double myDoubles[]={3.1415,0.7071,2.718,1.61,0.866,0.5,9.807};
		
		// Array of Strings
		String myStrings[]={"Madrid","Paris","Berlin","Glasgow","Tokyo"};
		
		// Array of Characters
		Character myChars[]={'t','e','r','a','u','q','x'};

		
		System.out.println("Original Integers:");
		print(myInts);
		bubblesort(myInts);
		System.out.println("Sorted Integers:");
		print(myInts);
		System.out.println("\n");



		System.out.println("Original Doubles:");
		print(myDoubles);
		bubblesort(myDoubles); 
		System.out.println("Sorted Doubles:");
		print(myDoubles);
		System.out.println("\n");
		
		
		System.out.println("Original Strings:");
		print(myStrings);
		bubblesort(myStrings);
		System.out.println("Sorted Strings:");
		print(myStrings);
		System.out.println("\n");
		
		
		System.out.println("Original Chars:");
		print(myChars);
		bubblesort(myChars);
		System.out.println("Sorted Chars:");
		print(myChars);
		System.out.println("\n");





	}
}



