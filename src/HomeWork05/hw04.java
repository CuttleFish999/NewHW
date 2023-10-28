package HomeWork05;

public class hw04 {
    public static void main(String[] args) {
        int count = 8;
        char[] arr = new char[count];

        int BigWordStart = 65;
        int BigWordEnd = 90;

        int SmallWordStart = 97;
        int SmallWordEnd = 122;

        int NumStart = 48;
        int NumEnd = 57;

        int guessCheeseM;

        int i = 0;
        do {
            guessCheeseM = (int) (Math.random() * 3);
            switch (guessCheeseM) {
                case 0:
                    arr[i] = (char) ((int) (Math.random() * (BigWordEnd - BigWordStart + 1) + BigWordStart));
                    break;
                case 1:
                    arr[i] = (char) ((int) (Math.random() * (SmallWordEnd - SmallWordStart + 1) + SmallWordStart));
                    break;
                case 2:
                    arr[i] = (char) ((int) (Math.random() * (NumEnd - NumStart + 1) + NumStart));
                    break;
            }
            i++;
        } while (i < count);

        for (int i1 = 0; i1 < arr.length; i1++) {
            System.out.print(arr[i1]);
        }
    }
}
