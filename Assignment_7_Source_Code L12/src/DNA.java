/* 
Class: CSE 1321L 
Section: 	Assignemnt 7 Source Code       
Term:		Fall 2019  
Instructor:	Dexter Howard
Name:		Jimmy Nguyen    
Lab#:		N/A
 */
import java.util.Random;
public class DNA {
	public static char[] createArray() {
		Random rand = new Random();
		
		char[] dnaArrayL = new char[255];
		
		int randomHand = 0;
		char G = 'G';
		char C = 'C';
		char A = 'A';
		char T = 'T';
		
		for(int i = 0; i < dnaArrayL.length; i++) {
			randomHand = rand.nextInt(4);
			
			switch(randomHand) {
				case 0: dnaArrayL[i] = G;
				break;
				
				case 1: dnaArrayL[i] = C;
				break;
				
				case 2: dnaArrayL[i] = A;
				break;
				
				case 3: dnaArrayL[i] = T;
				break;
			}
		}
		return dnaArrayL;
	}
	
	public static char[] createRnaArray(char[] dnaArray) {
		char[] rnaArrayL = dnaArray;
		char U = 'U';
		for(int i = 0; i < rnaArrayL.length; i++) {
			if(rnaArrayL[i] == 'T') {
				rnaArrayL[i] = U;
			}
		}
		return rnaArrayL;
	}
	
	public static void main(String[] args) {
		char[] dnaArray = createArray();
		char[] rnaArray;
		int skipLine = 0;
		
		for(int i = 0; i < dnaArray.length; i++) {
			System.out.print(dnaArray[i]); 
			
			skipLine++;
			
			if(skipLine == 76) {
				System.out.println();
				skipLine = 0;
			}	
			
		}
		
		
		//this will reset the variables for rna printing
		System.out.println("\n");
		skipLine = 0;
		
		
		rnaArray = createRnaArray(dnaArray);
		
		for(int i = 0; i < rnaArray.length; i++) {
			System.out.print(rnaArray[i]); 
			
			skipLine++;
			
			if(skipLine == 76) {
				System.out.println();
				skipLine = 0;
			}	
		}
		
	}
}
