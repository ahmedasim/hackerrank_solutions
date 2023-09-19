package basic;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


/* Problem statement
 * There are two players, and there is a number of sequence of size n. Players alternate turns for n round.
 * Each round a player removes first number from sequence and add its value to their score.
 * After that if removed number is even, the remaining sequence is reversed.
 * Calculate the difference between player score.
 * time limit is 4 second
 */
/*
 * Input Sample 

1 2 3 4 5

 * Output

Player 1 score:9
Player 2 score:6
Score Diff:3

 * */
public class PlayersScoreDifference {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        String input =in.nextLine();
        in.close();
        List<Integer> inputList = Arrays.stream(input.split(" ")).map(e -> Integer.parseInt(e)).collect(Collectors.toList());
        
        loopSolution(inputList);
        optimzeSolution(inputList);
	}

	private static void loopSolution(List<Integer> inputList) {
		int playerScore1 = 0;
        int playerScore2 = 0;
        boolean currentPlayer = true; // true for player1 and false for player2
        
        while(inputList.size() > 0) {
        	int num = inputList.get(0);
        	if(currentPlayer) {
        		playerScore1 += num;
        	}else {
        		playerScore2 += num;
        	}
        	currentPlayer = !currentPlayer;
        	inputList= inputList.stream().skip(1).collect(Collectors.toList());
        	if(num%2 == 0 && inputList.size() > 1) {
        		Collections.reverse(inputList);
        	}
        	
        }
        System.out.println("Player 1 score:" + playerScore1);
        System.out.println("Player 2 score:" + playerScore2);
        System.out.println("Score Diff:" + (playerScore1 - playerScore2));
	}
	
	private static void optimzeSolution(List<Integer> inputList) {
		int playerScore1 = 0;
        int playerScore2 = 0;
        int direction = 1;
        int currentIndex = 0;
        boolean currentPlayer = true; // true for player1 and false for player2
        while(inputList.size() > 0) {
        	int num = inputList.get(currentIndex);
        	inputList.remove(currentIndex);
        	
        	if(currentPlayer) {
        		playerScore1 += num;
        	}else {
        		playerScore2 += num;
        	}
        	currentPlayer = !currentPlayer;
        	
        	if(num%2 == 0 && inputList.size() > 1) {
        		 direction *= -1;
        	}
        	if(direction == -1) {
        		currentIndex = inputList.size() - 1;
        	}else {
        		currentIndex = 0;
        	}
        	
        }
        System.out.println("---------Optimize Solution---------");
        System.out.println("Player 1 score:" + playerScore1);
        System.out.println("Player 2 score:" + playerScore2);
        System.out.println("Score Diff:" + (playerScore1 - playerScore2));
	}
	
}
