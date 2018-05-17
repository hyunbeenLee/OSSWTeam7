pakage getcard;

import java.util.ArrayList;

public class CheckResult {
      int[] countSameCard = new int[13];

      public String getResult(int[] card) {
        MappingCard mc = new MappingCard();
      }

      // 스트레이트 여부 판단 field
      int spadeNum = 0;
      int heartNum = 0;
      int cloverNum = 0;
      int diaNum = 0;

      // 모양이 같은 5개의 카드를 담을 변수
		ArrayList<Integer> selSpadeCardPattern 	= new ArrayList<Integer>();
		ArrayList<Integer> selCloverCardPattern = new ArrayList<Integer>();
		ArrayList<Integer> selHeartCardPattern 	= new ArrayList<Integer>();
		ArrayList<Integer> selDiaCardPattern 	= new ArrayList<Integer>();


		// ********************************************
		// * 로열 스트레이트 플러시(Royal Straight Flush) *
		// * 5장의 카드가 같은 문양과 함께 A부터 순서적으로 *
		// * 나열되어 있는 것 *
		// ********************************************

		// ********************************************
		// * 스트레이트 플러시 (Straight Flush) *
		// * 5장의 카드가 같은 문양과 함께 A보다 낮은 순서로 *
		// * 나열되어 있는 것 *
		// ********************************************

		// 같은 문양이 몇 장있나 판단.
		for (int i = 0; i < Constants.CARDNUM; i++) {
			if (mc.getCardPattern(card[i]).equals(Constants.SPADE)) {
				spadeNum++;
				selSpadeCardPattern.add((Integer) mc.getCardNum(card[i]));
			} else if (mc.getCardPattern(card[i]).equals(Constants.CLOVER)) {
				cloverNum++;
				selCloverCardPattern.add((Integer) mc.getCardNum(card[i]));
			} else if (mc.getCardPattern(card[i]).equals(Constants.HEART)) {
				heartNum++;
				selHeartCardPattern.add((Integer) mc.getCardNum(card[i]));
			} else if (mc.getCardPattern(card[i]).equals(Constants.DIAMOND)) {
				diaNum++;
				selDiaCardPattern.add((Integer) mc.getCardNum(card[i]));
			}
		}

		// Straight_Flush or Royal_Straight
		if ((selCloverCardPattern.size() >= 5) && (IsContinuous(selCloverCardPattern) == true)) {
			return GetStraightResult(selCloverCardPattern, Constants.CLOVER);
		} else if ((selDiaCardPattern.size() >= 5) && (IsContinuous(selDiaCardPattern) == true)) {
			return GetStraightResult(selDiaCardPattern, Constants.DIAMOND);
		} else if ((selHeartCardPattern.size() >= 5 && (IsContinuous(selHeartCardPattern) == true))) {
			return GetStraightResult(selHeartCardPattern, Constants.HEART);
		} else if ((selSpadeCardPattern.size() >= 5) && (IsContinuous(selSpadeCardPattern) == true)) {
			return GetStraightResult(selSpadeCardPattern, Constants.SPADE);
		}

    // ********************************************
		// * 플러시 (Flush) *
		// * 5장의 카드가 숫자와는 관계없이 같은 문양으로 *
		// * 되어 있는 것 *
		// ********************************************

		else if (selCloverCardPattern.size() >= 5) {
			return Flush(selCloverCardPattern);
		} else if (selDiaCardPattern.size() >= 5) {
			return Flush(selDiaCardPattern);
		} else if (selHeartCardPattern.size() >= 5) {
			return Flush(selHeartCardPattern);
		} else if (selSpadeCardPattern.size() >= 5) {
			return Flush(selSpadeCardPattern);
		}

    // ********************************************
		// * 스트레이트 (Straigh) 						  *
		// * 5장의 카드가 순서적으로 나열되어 있는 것. 			  *
		// ********************************************

    ArrayList<Integer> straight1 = devOriginCard(card, 0, 5);
    ArrayList<Integer> straight2 = devOriginCard(card, 1, 6);
    ArrayList<Integer> straight3 = devOriginCard(card, 2, 7);

    if(IsContinuous2(0, 5, straight1) || IsContinuous2(1, 6, straight2) || IsContinuous2(2, 7, straight3))
			return "Straight";

		countSameCard = countSameNumCard(card);

    // Four Card 미만인 경우 판단
		String pairedCard = getPairCard(countSameCard);

		if (!pairedCard.equals("")) {

			// Triple or Two_pair or One_pair 리턴
			return pairedCard;
    }
  return null;
}

private ArrayList<Integer> devOriginCard(int[] card, int start, int end) {
  ArrayList<Integer> straight = new ArrayList<Integer>();
  for (int i = start; i < end; i++) {
    straight.add(card[i]);
  }
  return straight;
}

private String Flush(ArrayList<Integer> selCardPattern) {
  for (int i = selCardPattern.size(); i > selCardPattern.size() - 5; i--) {
    if ((Integer) selCardPattern.get(i - 1) == 14) {
      return "A_Flush";
    } else {
      return "" + selCardPattern.get(i - 5) + "_Flush";
    }
  }
  return null;
}

private String getPairCard(int[] countSameCard2) {
  MappingCard mc = new MappingCard();
  int checkThree = 0;
  int checkTwo = 0;

  // 트리플 or 투페어 개수
		int tripleNum = 0;
		int twoPairNum = 0;

    // ********************************************
		// * 4 카드 (Four Card) 		  *
		// * 4장의 카드가 같은 숫자로 나열되어 있는 것 				  *
		// ********************************************

		for (int i = 0; i < countSameCard.length; i++) {
			// FourCard인 경우 return
			if (countSameCard[i] == 4) {
				if (i < 9) {
					return "" + (i + 2) + "_Four_Card";
				} else
					return mc.aboveTen(i + 2) + "_Four_Card";
			} else if (countSameCard[i] == 3) {
				checkThree++;
				tripleNum = (i + 2);
			} else if (countSameCard[i] == 2) {
				checkTwo++;
				twoPairNum = (i + 2);
			}

      // ********************************************
			// * 풀 하우스 (Full House) 					  *
			// * 3장의 카드의 숫자가 같고, 						  *
			// * 2장의 카드 숫자가 동일 한 것. 					  *
			// ********************************************
			if ((checkThree == 1) && (checkTwo >= 1)) {
				if (tripleNum <= 10) {
					return "" + tripleNum + "_Full_House";
				} else
					return mc.aboveTen(tripleNum) + "_Full_House";
			}
		}
}
