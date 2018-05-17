import java.util.Random;

public class GetCard{
   int[] cardNum = new int[12];
   int[] cardShape = new int[3];
   
   Random random = new Random();
   for(int i=0; i<13; i++){
    cardNum[i] = random.nextInt(52) + 1;
    }
  }
}
