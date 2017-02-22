package ru.knbase.java1.lec71;

import java.io.IOException;
import java.util.Arrays;

public class Stat {

	public static void main(String[] args) throws IOException {

		int stat[] = { 1, 3, 6, 10, 15, 21, 25, 27, 27, 25, 21, 15, 10, 6, 3, 1 };

		double sum = 0;
		int up = 0;
		for (int x = 15; x >= 0; x--) {
			for (int y = x; y >= 0; y--) {
				for (int z = y; z >= 0; z--) {
					double p = stat[x] * stat[y] * stat[z] * 1.0 / 216 / 216 / 216;
					sum += p;
					up++;
				}
			}
		}
		System.out.println(sum);// 2180264 //0,2163454821419499 //10077696
		System.out.println(up); // 816 / 3375 //0,2417777777777778


		int total = 1000;

		double sqSum = 0;
		for (int k = 0; k < total; k++) {
			int countUp = throwBriks(total);
			double realP = countUp * 1.0 / total;
//			System.out.println("ups=" + countUp + "; " + realP);

			sqSum += (sum - realP) * (sum - realP);
		}

		double sigma = Math.sqrt(sqSum/total);
		System.out.printf("sigma = %9f\n", sigma);
		
//		for (int k = 0; k < total; k++) {
		System.out.println("Enter для броска");
		
		System.in.read();
		{
			int countUp = throwBriks(total);
			double realP = countUp * 1.0 / total;
//			System.out.println("ups=" + countUp + "; " + realP);

			double d = Math.abs(sum-realP);
			System.out.println("отклонение = " + d);
			double sigma_x_3 = 3*sigma;
			System.out.println("3 сигмы = " + sigma_x_3);
			
			System.out.println("Всего горок "+countUp + " из " +total +" бросков");
			
			if(sigma_x_3>d){
				System.out.println("тер.вер. победил");
			}else{
				System.out.println("магия");
			}
			
		}
		System.out.println("Enter для броска");
		System.in.read();
		{
			int[][] rnd = throwBrick();

			rnd[0][0] = rnd[0][0] + rnd[0][1] + rnd[0][2];
			rnd[1][0] = rnd[1][0] + rnd[1][1] + rnd[1][2];
			rnd[2][0] = rnd[2][0] + rnd[2][1] + rnd[2][2];

			if (rnd[0][0] >= rnd[1][0] && rnd[1][0] >= rnd[2][0]) {
				System.err.println("горка \\");
			}else{
				System.err.println("подъем /");
			}
		}

	}

	private static int throwBriks(int total) {
		int countUp = 0;
		for (int i = 0; i < total; i++) {
			int[][] rnd = throwBrick();

			rnd[0][0] = rnd[0][0] + rnd[0][1] + rnd[0][2];
			rnd[1][0] = rnd[1][0] + rnd[1][1] + rnd[1][2];
			rnd[2][0] = rnd[2][0] + rnd[2][1] + rnd[2][2];

			if (rnd[0][0] >= rnd[1][0] && rnd[1][0] >= rnd[2][0]) {
				countUp++;
			}
		}
		return countUp;
	}

	private static int[][] throwBrick() {
		int rnd[][] = { { getRnd(), getRnd(), getRnd() }, { getRnd(), getRnd(), getRnd() },
				{ getRnd(), getRnd(), getRnd() } };
		return rnd;
	}

	private static int getRnd() {
		return (int) (Math.random() * 6);
	}

	private static void run() throws IOException {
		int total = 100_000;
		int[] stat = new int[total];
		int open = 0;

		System.in.read();
		for (int k = 0; k < total; k++) {
			for (int i = 0; i < 3; i++) {
				int rnd = (int) (Math.random() * 15 + 3);
				stat[i] = rnd;
			}
			// 3375
			// 18*3 + 17*3 +... 3*(18+17+...+3) = 360
			// 0,1066666666666667
			// 0,8933333333333333
			if (stat[0] > stat[1] || stat[1] > stat[2]) {
				open++;
			} else {

			}
		}

		System.out.println(open / (double) total);

		System.in.read();

		for (int i = 0; i < 3; i++) {
			int rnd = (int) (Math.random() * 18 + 1);
			stat[i] = rnd;
		}
		if (stat[0] >= stat[1] || stat[1] >= stat[2]) {
			System.out.println("open");
		} else {
			System.out.println("close");
		}
	}

}
