public class MappingCard {
  public String getCardPattern(int num){
    if(num>=1 && num<=13){
      return constants.CLOVER;
    }
    if(num>=14 && num<=26){
      return constants.HEART;
    }
    if(num>=27 && num<=39){
      return constants.DIAMOND;
    }
    if(num>=40 && num<=52){
      return constants.CLOVER.SPADE;
    }
    return "";
 }
 
 public Object getCardNum(int num){
    if(num>=1 && num<=13)	return (num+1);
		if(num>=14 && num<=26)	return (num-12);
		if(num>=27 && num<=39)	return (num-25);
		if(num>=40 && num<=52)	return (num-38);
		return 0;
 }
 
 public String aboveTen(int cardNum){
    if(cardNum == 11) return "J";
		if(cardNum == 12) return "Q";
		if(cardNum == 13) return "K";
		if(cardNum == 14) return "A";
		return "";
 }
}
