/****************************************************************************** 
 *  Purpose: 2DArray
 *
 *  @author  Abhishek Sawant
 *  @version 1.0
 *  @since   23-01-2018
 *
 ******************************************************************************/
 
 /*
 *2DArray 
 */
package com.bridgelabz.util;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.*;
public class Array2D {

	public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter Rows and Columns");
			int rows = s.nextInt();	
			int cols = s.nextInt(); 
			System.out.println("Enter Your Choice /n 1 for Integer /n 2 for Float /n 3 for Double");	
			int choice = s.nextInt();
			switch (choice) {
				case 1 :
						int[][] intArray = new int[rows][cols];
						System.out.println("Enter Array Elements:");
						for(int i=0;i<rows;i++)
						{
							for(int j=0;j<cols;j++)
							{
								intArray[i][j] = s.nextInt();
							}
						}
						System.out.println();
						//printArray(intArray);
						for(int i=0;i<rows;i++)
						{
							for(int j=0;j<cols;j++)
							{
								System.out.print(" "+intArray[i][j]);
							}
						System.out.println("");
						}
						//printArray(intArray);
						break;
				
				case 2 :
					float[][] floatArray = new float[rows][cols];
					System.out.println("Enter Array Elements:");
					for(int i=0;i<rows;i++)
					{
						for(int j=0;j<cols;j++)
						{
							floatArray[i][j] = s.nextFloat();
						}
					}
					System.out.println();
					for(int i=0;i<rows;i++)
						{
							for(int j=0;j<cols;j++)
							{
								System.out.println(" "+floatArray[i][j]);
							}
						System.out.println("");
						}
					break;//printArray(floatArray);
					
				case 3 :
					double[][] doubleArray = new double[rows][cols];
					System.out.println("Enter Array Elements:");
					for(int i=0;i<rows;i++)
					{
						for(int j=0;j<cols;j++)
						{
							doubleArray[i][j] = s.nextDouble();
						}
					}
					System.out.println();
					for(int i=0;i<rows;i++)
						{
							for(int j=0;j<cols;j++)
							{
								System.out.print(" "+doubleArray[i][j]);
							}
						System.out.println("");
						}
						//printArray(intArray);
						break;
			}
}
	/*public static <E> void printArray(E inputArray) {
      		// Display array elements
      		for(E[][] element :inputArray) {
         		System.out.printf("%s ", element);
      		}
      		System.out.println();

	}*/

}

