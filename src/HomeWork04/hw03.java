package HomeWork04;

//有個字串陣列如下 (八大行星):
//{"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"}
//請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
//(提示:字元比對,String方法)
public class hw03 {
	public static void main(String[] args) {
		String[] QQ = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
//		String Answer = "";
//		char momSounds;
		
		myAnswer(MixThisArr(QQ));

//		System.out.print(Answer);
		
		
	}
	public static String MixThisArr(String[] qQ) {
		String Answer = "";
		for (int i = 0; i < qQ.length; i++) {
			Answer += qQ[i];
			System.out.print(qQ[i]);
		}
		return Answer;
	}

	public static int[] myAnswer(String Answer) {
		char momSounds;
		int count = 0;
		int count_A = 0;
		int count_E = 0;
		int count_I = 0;
		int count_O = 0;
		int count_U = 0;
		int[] AnswerArr = new int[6];
		
		
		for (int i = 0; i < Answer.length(); i++) {
			momSounds = Answer.charAt(i);
			switch (momSounds) {
			case 'a':
				count++;
				count_A++;
				break;
			case 'e':
				count++;
				count_E++;
				break;
			case 'i':
				count++;
				count_I++;
				break;
			case 'o':
				count++;
				count_O++;
				break;
			case 'u':
				count++;
				count_U++;
				break;
			}
		}
		
			AnswerArr[0] = count;
			AnswerArr[1] = count_A;
			AnswerArr[2] = count_E;
			AnswerArr[3] = count_I;
			AnswerArr[4] = count_O;
			AnswerArr[5] = count_U;
			System.out.println("共有: " + AnswerArr[0] + "個母音。");
			System.out.println("其中有: " + AnswerArr[1] + "個a母音。");
			System.out.println("其中有: " + AnswerArr[2] + "個e母音。");
			System.out.println("其中有: " + AnswerArr[3]+ "個i母音。");
			System.out.println("其中有: " + AnswerArr[4]+ "個o母音。");
			System.out.println("其中有: " + AnswerArr[5] + "個u母音。");
	return AnswerArr;
	}
}
