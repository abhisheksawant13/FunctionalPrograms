/****************************************************************************** 
 *  Purpose: Find WindChill
 *  @author  Abhishek Sawant
 *  @version 1.0
 *  @since   22-01-2018
 *
 ******************************************************************************/

/*
* Find WindChill.
*/
package com.bridgelabz.util;
public class WindChill {
	public static void main(String args[]) {
		int v = Integer.parseInt(args[0]); //velocity
		int t = Integer.parseInt(args[1]); //temperature
		double w = 0;
		if(t>50&&v>120&&v<3){
			System.out.println("Enter a valid parameters");
		}
		else{	
			System.out.println(+(35.74 + 0.62215*t +(0.4275*t - 35.75))*Math.pow(v,0.16));
		}
	}
}

