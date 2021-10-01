package application;

//import java.util.Arrays;
//
//import fundamentals.*;

import classandobjects.balls.Ball;
import classandobjects.balls.Basket;
import classandobjects.balls.Color;

public class Main {
	
	public static void main(String[] args) {
		
		Basket basket = new Basket();
		basket.addBall(new Ball(Color.BLACK, 10));
		basket.addBall(new Ball(Color.BLACK, 4));
		basket.addBall(new Ball(Color.WHITE, 14));
		basket.addBall(new Ball(Color.WHITE, 3));
		basket.addBall(new Ball(Color.WHITE, 2));
		basket.addBall(new Ball(Color.RED, 17));
		basket.addBall(new Ball(Color.GREEN, 11));
		basket.addBall(new Ball(Color.BLUE, 16));
		basket.addBall(new Ball(Color.BLUE, 13));
		basket.addBall(new Ball(Color.BLUE, 17));
		basket.addBall(new Ball(Color.BLUE, 12));
		
		System.out.println("Balls total weight: " + basket.getTotalWeight());
		System.out.println("Blue balls count: " + basket.getBallCountBy(Color.BLUE));
		
//		System.out.println("Task1:");
//		System.out.println("\tResult: " + Task1.evaluateExpression(32.5, 14.42) + "\n");
//		
//		System.out.println("Task2:");
//		System.out.println("\tResult: " + Task2.checkPointBelonging(0.0f, -3.0f) + "\n");
//		
//		System.out.println("Task3:");
//		for (Task3Result result : Task3.findRangeOfValue(-5.0, 5.0, 0.5)) {
//			System.out.println("\t" + result);
//		}
//		System.out.println();
//		
//		System.out.println("Task4:");
//		int[] task4Array = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
//		System.out.println("\tResult: " + Task4.findIndexesOfPrimes(task4Array) + "\n");
//		
//		System.out.println("Task5:");
//		int[] task5Array = { 1, 5, 8, 3, 4, 5, 8, 10 };
//		System.out.println("\tResult: " + Task5.findMinExcludeSequenceCount(task5Array) + "\n");
//		
//		System.out.println("Task6:");
//		int[] task6Array = { 1, 2, 3, 4, 5 };
//		for (int[] array : Task6.buildMatrix(task6Array)) {
//			System.out.print("\t");
//			for (int element : array) {
//				System.out.print(element + " ");
//			}
//			System.out.println();
//		}
//		System.out.println();
//		
//		System.out.println("Task7:");
//		int[] task7Array = { 73, 67, 56, 32, 52, 41, 83, 37, 32, 10 };
//		System.out.println("\tResult: " + Arrays.toString( Task7.shellSort(task7Array)) + "\n");
//		
//		System.out.println("Task8:");
//		int[] task8Array1 = { 1, 3, 5 };
//		int[] task8Array2 = { 2, 4 };
//		System.out.println("\tResult: " + Task8.findInsertIndexes(task8Array1, task8Array2) + "\n");
	}

}
