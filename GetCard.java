import java.util.Random;

public class GetCard{
   public int[] mixCard() {
   int[] cardNum = new int[12];
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
  }
}
