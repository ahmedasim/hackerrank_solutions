package triplets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class DiagonalDifference {

	public static void main(String[] args) throws IOException {
		List<List<Integer>> arr = new ArrayList<List<Integer>>();
		arr.add(0, new ArrayList<Integer>(Arrays.asList(11,2,4)));
		arr.add(1, new ArrayList<Integer>(Arrays.asList(4,5,6)));
		arr.add(2, new ArrayList<Integer>(Arrays.asList(10,8,-12)));
		System.out.print(diagonalDifference(arr));
	}
	
	public static Long diagonalDifference(List<List<Integer>> arr) {
		Long a = IntStream.range(0, arr.size()).mapToLong(i -> arr.get(i).get(i)).reduce(0, Long::sum);
		Long b = IntStream.range(0, arr.size()).mapToLong(i -> arr.get(i).get(arr.get(i).size() - i - 1)).reduce(0, Long::sum);
		return Math.abs(a-b);
       
    }
}
