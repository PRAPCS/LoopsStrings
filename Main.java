class Main {
  public static void main(String[] args) {
    String s = "are apples tasty without a's?";
    int index =0;
    System.out.println("original string: "+s);

    //loop while there still is an a in the string s
    while(s.indexOf("a")>=0){
      
      //Find the next index of a
      index = s.indexOf("a");

      //Remove the a at index and then make a new string by appending from the index to the rest of the string
      s = s.substring(0,index)+s.substring(index+1);
    }
    System.out.println("Changed string: "+s);

   //=========================================

   s = "Hello";
   String sReversed ="";
   String ithLetter;

   for(int i=0; i<s.length();i++){
     ithLetter = s.substring(i,i+1);

     sReversed = ithLetter + sReversed;

   }
   System.out.println(sReversed);







  }
}