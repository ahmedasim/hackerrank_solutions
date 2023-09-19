package misc;

import java.util.Scanner;
import java.util.stream.IntStream;

/*
 * Input Sample 
2
0 2 10
5 3 5
  
 * Output
2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98
 * */
public class SeriesInput1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            printUsingLoop(a, b, n);
            printUsingRecursion(a, b, n);
        }
        in.close();

	}

	private static void printUsingLoop(int a, int b, int n) {
		int last = 0;
		for(int j = 0; j < n; j++){
		    int current = (int)(a +  (Math.pow(2, j) * b));
		    System.out.print((current + last) + " ");
		    last =  (current + last) - a;
		}
		System.out.println("");
	}
	
	private static void printUsingRecursion(int a, int b, int n) {
		IntStream.rangeClosed(0, n-1)
			.forEach(power -> System.out.print(a + getBSeriesSum(power, b) + " "));
		System.out.println("");
	}
	
	private static int getBSeriesSum(int power, int b) {
		if(power >= 0) {
			return ((int)Math.pow(2, power)) * b + getBSeriesSum( power - 1, b);
		}else {
			return 0;
		}
		
	}
}
