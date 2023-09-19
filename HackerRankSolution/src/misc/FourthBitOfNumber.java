package misc;

import java.util.Scanner;

/*
 * Given a int num, convent it to bit and find the fourth bit from right side. if no fourth bit available then return -1
 * Input 
 	* 23
 * Output
 	* 23 -> 10111, so fourth bit from right is 0
 * */
public class FourthBitOfNumber {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int num=in.nextInt();
        in.close();
        int fourthBit = fourthBit(num);
        System.out.println(fourthBit);

	}

	private static int fourthBit(int num) {
		String bitsStr = Integer.toBinaryString(num);
		//System.out.println(bitsStr);
		
		if(bitsStr.length() > 4) {
			char fourthBit = bitsStr.charAt(bitsStr.length() - 4);
			return Integer.parseInt(fourthBit + "");
		}else {
			return -1;
		}
	}
}
