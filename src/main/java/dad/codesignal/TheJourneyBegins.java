package dad.codesignal;

public class TheJourneyBegins {
	public int add(int param1, int param2) {
		 return param1 + param2;
		}
	public int centuryFromYear(int year) {
		int j;
	    j = year/100;
	    if(year%100==0){
	        return j;
	    } else {
	        return j+1;
	    }
	}
	public boolean checkPalindrome(String inputString) {
		 boolean test =  true;
		 for(int i=0;i<inputString.length()/2;i++){
		     if(inputString.charAt(i)!=inputString.charAt(inputString.length()-1-i)){
		         test=false;
		     }
		 }
		 return test;
		}
}
