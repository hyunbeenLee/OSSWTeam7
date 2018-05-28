import java.util.Random;

public class GetCard{
   public int[] mixCard() {
   int[] cardNum = new int[14];
   int[] cardShape = new int[3];
   int[] retVal  = new int[14];
   
   Random random = new Random();
   for(int i=0; i<14; i++){
    cardNum[i] = random.nextInt(52) + 1;
    }
   for (int i = 0; i < 14; i++) {
		for (int j = 0; j < 14; j++) {
			if( (i != j) && (cardNum[i] == cardNum[j]) ){
				cardNum[j] = random.nextInt(52) + 1;
			}
		}
	}
// cardNum은 오름차순으로 정렬된 카드 덱이다.
// retVal 배열은 랜덤한 순서의 카드 덱이다.
	   
	   retVal = cardNum.clone();
	   
	   int[] userCard = new int[Constants.CARDNUM];
	   int[] compCard = new int[Constants.CARDNUM];
	   
	   for(int j=0; j<7; j++){
		if(j==0) System.out.print("COM_CARD :" + "\t" + mc.getCardPattern(cardNum[j]) + "\t" + mc.getCardNum(cardNum[j]) + "\t");
		else System.out.print(mc.getCardPattern(cardNum[j]) + "\t" + mc.getCardNum(cardNum[j]) + "\t");
		if(j==6) System.out.println();
	   }
	   for(int k=7; k<14; k++){
		if(k==7) System.out.print("BSH_CARD :" + "\t" + mc.getCardPattern(cardNum[k]) + "\t" + mc.getCardNum(cardNum[k]) + "\t");
		else System.out.print(mc.getCardPattern(cardNum[k]) + "\t" + mc.getCardNum(cardNum[k]) + "\t");
		if(k==13) System.out.println();
	   }
  }
}
