/****************************************************************************** 
 *  Purpose: Print the Nth Harmonic Number
 *  @author  Abhishek Sawant
 *  @version 1.0
 *  @since   22-01-2018
 *
 ******************************************************************************/

package com.bridgelabz.util;

/*
* Print Nth Harmonic Number
*/
public class HarmonicNumber {
	public static void main(String args[]) {
		HarmonicNumber hm = new HarmonicNumber();
		hm.harmonicNumberDisplay(Integer.parseInt(args[0]));			
	}

	public void harmonicNumberDisplay(int range){
		double hnumber = 0;
		for(int i = 1;i<=range;i++) {
			hnumber = hnumber+(1/i);
			System.out.println("1/"+i);
		}
		System.out.println(hnumber);	
	}
}
