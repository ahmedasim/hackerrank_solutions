package basic;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
 * Input Sample 
arrlist = [-4 3 -9 0 4 1]
  
 * Output
0.500000
0.333333
0.166667
 * */
public class PositiveNegativeZeroRatioInList {

	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<Integer>(Arrays.asList(-4, 3, -9, 0, 4, 1));
		long positiveCount = arr.stream().filter(e -> e > 0).count();
		long negativeCount = arr.stream().filter(e -> e < 0).count();
		long zeroCount = arr.size() - (positiveCount + negativeCount);
		double positiveRatio = (double)positiveCount / arr.size();
		double negativeRatio = (double)negativeCount / arr.size();
		double zeroRatio = (double)zeroCount / arr.size();
		
		
		DecimalFormat df = new DecimalFormat("#." + "0".repeat(6));

		System.out.println(df.format(positiveRatio));
		System.out.println(df.format(negativeRatio));
		System.out.println(df.format(zeroRatio));

	}
}
