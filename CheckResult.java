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


		// * 로열 스트레이트 플러시(Royal Straight Flush) *
		// * 5장의 카드가 같은 문양과 함께 A부터 순서적으로 *
		// * 나열되어 있는 것 *


		// * 스트레이트 플러시 (Straight Flush) *
		// * 5장의 카드가 같은 문양과 함께 A보다 낮은 순서로 *
		// * 나열되어 있는 것 *

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
}
