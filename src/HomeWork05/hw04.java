package HomeWork05;
//身為程式設計師的你,收到一個任務,要幫系統的註冊新增驗證碼的功能,請設計一個方法
//genAuthCode(),當呼叫此方法時,會回傳一個8位數的驗證碼,此驗證碼內容包含了英文大小寫
//與數字的亂數組合,如圖:
public class hw04 {
    public static void main(String[] args) {
    	char[] AnswerArr = new char[8];
    	
    	
//    	System.out.println("Q: "+  Q);
    	
    	
    	for(int i = 0 ; i < AnswerArr.length ; i++) {
    		int Q = (int)((Math.random() * 3) + 1);
//    		int Q = 3;
    		switch (Q) {
        	case 1:
        		AnswerArr[i] = EnglishBig();
        		
        		break;
        	case 2:
        		AnswerArr[i] = EnglishSmall();
        		break;
        	case 3:
        		AnswerArr[i] = Num();
        		break;
        	}
    	}
    }
    public static char EnglishBig() {
    	char EnglishBigWriteRand;
    	int EnglishBigWriteStart = 65;
    	int EnglishBigWriteEnd = 90;
    	EnglishBigWriteRand = (char)(int)((Math.random() * (EnglishBigWriteEnd - EnglishBigWriteStart + 1 )) + EnglishBigWriteStart) ;
    	
    	System.out.print(EnglishBigWriteRand);
    	
    	return EnglishBigWriteRand ;
    }
    
    public static char EnglishSmall() {
    	char EnglishSmallWriteRand;
    	int EnglishSmallWriteStart = 97;
    	int EnglishSmallWriteEnd = 122;
    	EnglishSmallWriteRand = (char)(int)((Math.random() * (EnglishSmallWriteEnd - EnglishSmallWriteStart + 1 )) + EnglishSmallWriteStart );
    	
    	System.out.print(EnglishSmallWriteRand);
    	
    	return EnglishSmallWriteRand;
    }
    
    public static char Num() {
    	char NumRand;
    	int NumStart = 48;
    	int NumEnd = 57;	 
    	 
    	NumRand = (char)(int)((Math.random() * (NumEnd - NumStart + 1)) + NumStart);
    	
    	System.out.print(NumRand);
    	
    	return NumRand;
    }
    
}
