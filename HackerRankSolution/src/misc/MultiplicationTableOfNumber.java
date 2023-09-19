package misc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

/*
 * This will take an integer input and display multiple table till 10
 * */
public class MultiplicationTableOfNumber {
	
	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(bufferedReader.readLine().trim());
        bufferedReader.close();
        //printUsingLoop(number);
        printUsingJS(number);
    }
	
	public static void printUsingLoop(int number) {
		int MAX_NUMBER = 10;
		for(int factor = 1; factor <= MAX_NUMBER; factor++) {
			System.out.println(number + " x " + factor + " = " + (number * factor));
		}
	}
	
	public static void printUsingJS(int number) {
		int MAX_NUMBER = 10;
        IntStream.rangeClosed(1, MAX_NUMBER)
        	.forEach(factor -> System.out.println(number + " x " + factor + " = " + (number * factor)));   
	}
}
