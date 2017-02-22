package ru.knbase.java1.lec71;

public class BigNumbers {

	public static void main(String[] args) {
		int correct=0;
		int wrong=0;
		
		int total = 1_000;
		for (int k = 0; k < total; k++) {
			int count = 0;

			for (int i = 0; i < 10; i++) {
				boolean rnd = Math.random() < 0.5;
				if (rnd)
					count++;
			}
			boolean rnd = Math.random() < 0.5;
			if (count == 10) { // ÂÑÅ Îðëû!
				if(rnd){
					correct++;
				}else{
					wrong++;
				}
			} else if (count == 0) { // ÂÑÅ Ðåøêè!
				if(!rnd){
					correct++;
				}else{
					wrong++;
				}
			} else {
				k--;
			}
		}

		System.out.println(correct/(double)total);
		System.out.println(wrong/(double)total);

	}

	private static void test1() {
		int countCorrect = 0;
		int countWrong = 0;
		int total = 100_000;
		int passed = 0;
		for (int k = 0; k < total; k++, passed++) {
			double sum = 0;
			int r = 1;// (int) (Math.random()*200);
			sum = getMid(r);
			double rnd = getMid(1000);
			if (sum < 0.43) {
				if (rnd > 0.5) {
					countCorrect++;
				} else {
					countWrong++;
				}
			} else if (sum > 0.57) {
				if (rnd < 0.5) {
					countCorrect++;
				} else {
					countWrong++;
				}
			} else {
				k--;
			}
		}

		System.out.println(countCorrect / (double) total);
		System.out.println(countWrong / (double) total);
		System.out.println(passed);
	}

	private static double getMid(int count) {
		double sum = 0;

		for (int i = 0; i < count; i++) {
			double rnd = Math.random();
			sum += rnd;
		}

		sum /= count;
		return sum;
	}

}
