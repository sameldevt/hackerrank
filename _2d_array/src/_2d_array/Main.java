package _2d_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	/*
	 * 	1 1 1 0 0 0
		0 1 0 0 0 0
		1 1 1 0 0 0
		0 0 2 4 4 0
		0 0 0 2 0 0
		0 0 1 2 4 0
	 **/
	static int calculate(List<List<Integer>> matrix) {
		boolean probablyHourglass = false;
		int[][] hourglass = new int[3][3];

		for (int row = 0; row < matrix.size(); row++) {
			for (int column = 0; column < matrix.get(row).size(); column++) {
				if(matrix.get(row).get(column) != 0) {
					
				}
			}
		}

		return 0;
	}

	public static void main(String[] args) throws IOException {

	}
}
