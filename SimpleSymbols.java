package challeng;

public class SimpleSymbols {
	
	public String simSym(String text) {
		
		String solution = "false";
		
		for(int x =0; x<text.length(); x++) {
			
			char ch = text.charAt(x);
			
			if((Character.isLetter(ch) || Character.isDigit(ch)) && x == 0) {
				solution = "false";
				break;
			}
			else if((Character.isLetter(ch) || Character.isDigit(ch)) && x == text.length()-1) {
				solution = "false";
				break;
			}
			else if(Character.isLetter(ch) && x > 0) {
				if(text.charAt(x-1) == '+' && text.charAt(x+1) == '+' ) {
					solution = "true";
				}
				else if(text.charAt(x-1) != '+' || text.charAt(x+1) != '+' ) {
					solution = "false";
					break;
				}
			}
		}
		
		return solution;
		
	}

}
