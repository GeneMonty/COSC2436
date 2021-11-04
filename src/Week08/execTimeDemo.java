/*

Name: Eugenio Montealegre
Course: COSC 2436
Date: 11/07/21
Assignment Description:
- This programs measure the execution time of six different sorting altorightms.
- We Accepts user input to select a predifined array size between 50,000 and 350,000, and ask user to select the sorting altorightm.
- We generate a new array filled with nuimbers from 1 to n and then suffle it to pseudo-randomize the array.
- We pass that array into the sorting class and sort respectively.
- We print the results and log into result.txt
*/


package Week08;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

// package execTimeDemo;

//import java.util.concurrent.ThreadLocalRandom; deprecated
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class execTimeDemo {

	public static void main(String[] args) throws IOException {

		// Init timer variables
		long startTime = 0; 							// mark start time
		long endTime = 0;								// end time var
		long executionTime = (endTime - startTime); 	// total time

		// Init Scanner
		Scanner input = new Scanner(System.in);

		// Init Constants
		int M = 1000; // multiplier default 1000
		int SIZE1 = 50 * M; 	// 50,000
		int SIZE2 = 100 * M; 	// 100,000
		int SIZE3 = 150 * M; 	// 150,000
		int SIZE4 = 200 * M; 	// 200,000
		int SIZE5 = 250 * M; 	// 250,000
		int SIZE6 = 300 * M; 	// 300,000
		int SIZE7 = 350 * M; 	// 350,000
		
		//Init Variables
		int size = 0; 		// temp variable size to pass after size selection for printing
		String name = "Sorting Name"; // string to pass into result printing

		// Init Empty Array
		Integer[] populatedArr = {};
		
		//************************************
		// Array size Selection Menu
		//************************************

		// Request size of the array to user.
		System.out.println("Select the Array Size"
				+ "\n[1] 50,000 items"
				+ "\n[2] 100,000 items"
				+ "\n[3] 150,000 items"
				+ "\n[4] 200,000 items"
				+ "\n[5] 250,000 items"
				+ "\n[6] 300,000 items"
				+ "\n[7] 350,000 items");
		
		// Get User input
		int selection = input.nextInt();
		
		// Switch to Array size and populate with values
		switch (selection) {
		case 1:
			populatedArr = generateUniqueArray(SIZE1);
			size = SIZE1;
			break;
		case 2:
			populatedArr = generateUniqueArray(SIZE2);
			size = SIZE2;
			break;
		case 3:
			populatedArr = generateUniqueArray(SIZE3);
			size = SIZE3;
			break;
		case 4:
			populatedArr = generateUniqueArray(SIZE4);
			size = SIZE4;
			break;
		case 5:
			populatedArr = generateUniqueArray(SIZE5);
			size = SIZE5;
			break;
		case 6:
			populatedArr = generateUniqueArray(SIZE6);
			size = SIZE6;
			break;
		case 7:
			populatedArr = generateUniqueArray(SIZE7);
			size = SIZE7;
			break;
		default:
			System.out.println("[!]Invalid Selection");
			break;
		}

		//************************************
		// Sorting Algorithms Menu
		//************************************

		// Request sorting method
		System.out.println("\nSelect the Sorting Algorithm"
				+ "\n[1] Selection Sort" // Selection Sort
				+ "\n[2] Bubble Sort" // Bubble // Sort
				+ "\n[3] Merge Sort" // Merge sort
				+ "\n[4] Quick Sort" // Quick Sort
				+ "\n[5] Heap Sort" // Heap Sort
				+ "\n[6] Radix Sort" // Radix Sort
		);

		int sortSelection = input.nextInt();

		// Switch to number of selected algorithm
		switch (sortSelection) {
		case 1:
			name = "Selection Sort";
			startTime = System.nanoTime(); 				// Start Timer
			Sorting.selectionSort(populatedArr);
			executionTime = timerEnd(startTime);
			printer(executionTime, name, populatedArr); // pass timer, name,array to printer
			usingPrintWriter(executionTime, name,size); // Print to file
			break;
		case 2:
			name = "Bubble Sort";
			startTime = System.nanoTime(); // mark start time
			Sorting.bubbleSort(populatedArr);
			executionTime = timerEnd(startTime);
			printer(executionTime, name, populatedArr);// mark end time
			usingPrintWriter(executionTime, name,size); // Print to file
			break;
		case 3:
			name = "Merge Sort";
			startTime = System.nanoTime();
			Sorting.mergeSort(populatedArr,0,size-1);
			executionTime = timerEnd(startTime);
			printer(executionTime, name, populatedArr); // mark
			usingPrintWriter(executionTime, name,size); // Print to file

			break;
		case 4:
			name ="Quick Sort";
			startTime = System.nanoTime(); // mark start time
			Sorting.quickSort(populatedArr, 0, size - 1);
			executionTime = timerEnd(startTime);
			printer(executionTime, name, populatedArr);
			usingPrintWriter(executionTime, name,size); // Print to file
			break;
		case 5:
			name = "Heap Sort";
			startTime = System.nanoTime();
			Sorting.heapSort(populatedArr);
			executionTime = timerEnd(startTime);
			printer(executionTime, name, populatedArr);
			usingPrintWriter(executionTime, name,size); // Print to file
			// debugArrayPrinter(populatedArr);
			break;
		case 6: 
			name = "Radix Sort";
			startTime = System.nanoTime();
			Sorting.radixSort(populatedArr,size);
			executionTime = timerEnd(startTime);
			printer(executionTime, name, populatedArr);
			usingPrintWriter(executionTime, name,size); // Print to file
			//debugArrayPrinter(populatedArr);
			break;

		default:
			System.out.println("[!]Invalid Selection");
			break;

		}

		input.close();
	}

	//************************************
	// End of Main
	//************************************

	// Debug printer to check array sorting solution
	private static void debugArrayPrinter(Integer[] populatedArr) {
		// Debug Print Array
		for (Integer x : populatedArr)
			System.out.print(x + ", ");
	}

	// Execution timer to reduce clutter, calculates exectTime
	private static long timerEnd(long startTime) {
		long endTime;
		long executionTime;
		endTime = System.nanoTime();
		executionTime = (endTime - startTime); //
		return executionTime;
	}
	//************************************
	// Pseudo Random Number Generator for Array Population
	//************************************
	public static Integer[] generateUniqueArray(int max) {
		// Init Array List
		List<Integer> myIntList = new ArrayList<Integer>();
		
		// Populate Array List sequentially
		int size = max; 		// max size of list
		for (int i = 1; i < max + 1; i++) {
			myIntList.add(i); 	// add to list

		}
		// System.out.println(myIntList); // Debug Ordered Array
		
		// Shuffle the ordered list
		Collections.shuffle(myIntList);
		for (int i = 0; i < max + 1; i++) {
		}
		// System.out.println(myIntList); // Debug Shuffled Array
		
		// Convert myIntList to regular intArr
		Integer[] intArr = new Integer[myIntList.size()];
		intArr = myIntList.toArray(intArr);
		System.out.println("\n[" + size + "] Int array generated succesfully!");
		return intArr;
	}

	//************************************
	// Method Printer for results
	//************************************
	public static void printer(long executionTime, String name, Integer[] populatedArr) {
		// init time divisor for miliseconds and seconds as extra output
		double ms = 1000000;
		double s = 10000000000.0;

		System.out.println("\n[" + name + " of [" + populatedArr.length + "] elements]");// mark end time
		System.out.println("Execution Time: " + executionTime + " nanoseconds.");
		System.out.println("Execution Time: " + executionTime / ms + " milliseconds.");
		System.out.println("Execution Time: " + executionTime / s + " seconds.");
		// Print to log file
	}
	
	//************************************
	// Print to text file to ease data collection
	//************************************
	public static void usingPrintWriter(long executionTime, String name,int size) throws IOException {
		String textToAppend = "\n[" + name + "]["+size+"]Execution Time: " + executionTime + " nanoseconds.";

		FileWriter fileWriter = new FileWriter("result.txt", true); // Set true for append mode
		PrintWriter printWriter = new PrintWriter(fileWriter);
		printWriter.println(textToAppend); // New line
		printWriter.close();
	}

}
