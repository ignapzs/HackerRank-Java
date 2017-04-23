package es.ignapzs.hackerrank.java.algorithms.graphtheory.snakesandladders;

import java.io.*;
import java.util.*;

public class Solution {

	private final static byte MAX_ROLL = 6;
	private final static byte BOARD_LENGTH = 100;

	public static void main(String[] args) throws IOException {
		final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		final byte[] board = new byte[BOARD_LENGTH];

		for (byte T = Byte.parseByte(br.readLine()); T > 0; --T) {

			// Initializing the board
			for (byte i = 0; i < BOARD_LENGTH; ++i) {
				board[i] = i;
			}

			// Getting the snakes
			for (byte n = Byte.parseByte(br.readLine()); n > 0; --n) {
				final String[] line = br.readLine().split(" ");
				final byte s = (byte) (Byte.parseByte(line[0]) - 1);
				final byte e = (byte) (Byte.parseByte(line[1]) - 1);
				board[s] = e;
			}

			// Getting the ladders
			for (byte m = Byte.parseByte(br.readLine()); m > 0; --m) {
				final String[] line = br.readLine().split(" ");
				final byte s = (byte) (Byte.parseByte(line[0]) - 1);
				final byte e = (byte) (Byte.parseByte(line[1]) - 1);
				board[s] = e;
			}

			// Print the solution
			System.out.println(getMinMoves(board));
		}
	}

	private static byte getMinMoves(final byte[] board) {

		// Initialize moves counting
		final byte[] moves = new byte[BOARD_LENGTH];

		for (byte i = 1; i < BOARD_LENGTH; moves[i++] = BOARD_LENGTH) {
		}
		final Queue<Byte> q = new PriorityQueue<Byte>(new Comparator<Byte>() {
			@Override
			public int compare(Byte a, Byte b) {
				return b.compareTo(a);
			}
		});

		// Go through the board and find the min moves
		q.add((byte) 0);
		do {
			final byte square = q.poll();
			final byte numMoves = (byte) (moves[square] + 1);
			for (byte i = (byte) (square + 1), n = (byte) (Math.min(BOARD_LENGTH, i + MAX_ROLL)); i < n; ++i) {
				final byte j = board[i];
				if (numMoves < moves[j]) {
					moves[j] = numMoves;
					q.add(j);
				}
			}
		} while (!q.isEmpty());

		// Check if it is possible to reach max square
		final byte minMoves = moves[BOARD_LENGTH - 1];

		return (minMoves == BOARD_LENGTH) ? -1 : minMoves;
	}

}