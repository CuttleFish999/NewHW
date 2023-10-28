package HomeWork05;

public class Work03 {
	public static void work03() {

	}

	public static int maxElement(int x[][]) {
		int maxNum = x[0][0];
//		int minNum = x[0][0];

		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (maxNum < x[i][j]) {
//					minNum = maxNum;
					maxNum = x[i][j];
				}
			}
		}
		return maxNum;
	}

	public static double maxElement(double x[][]) {
		double maxNum = x[0][0];
//		int minNum = x[0][0];

		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (maxNum < x[i][j]) {
//					minNum = maxNum;
					maxNum = x[i][j];
				}
			}
		}
		return maxNum;
	}
}
