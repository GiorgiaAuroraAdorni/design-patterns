package model.math;

public class SimpleMath {

	int numOperations = 0;
	
	/*
	 * It returns a random number between 0 and 10
	 */
	public int getRandomNumber() {
		++numOperations;
		return (int)(Math.random()*10);
	}
	
	/*
	 *  It returns a+b
	 */
	public double sum(double a, double b) {
		++numOperations;
		return a+b;
	}
	
	/*
	 *  It returns the number of operations 
	 *  performed by this object
	 */
	public int getNumOperations() {
		return numOperations;
	}
}
