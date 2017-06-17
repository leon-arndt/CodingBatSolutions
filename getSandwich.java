public String getSandwich(String str) {
  String tmpString = "";
  String finalString = "";
  int start = 0;
  int finish = 0;
  boolean lastBread = false;
 
  if (str.length() <= 10) { //cannot contain anything, empty sandwich
    return "";
  }
 
  for (int i = 0; i < str.length() - 4; i++) {
    tmpString = str.substring(i, i + 5);
   
    if (tmpString.equals("bread") ) {
      if (lastBread) {
        finish = i; //before the b of the second bread
      } else {
        start = i + 5; //after the d of the first bread
        lastBread = true;
      }
    }
  }
 
  finalString = str.substring(start, finish);
  return finalString;
}