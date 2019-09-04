package challeng;

public class LetterCapitalize {
	
	public String capi(String text) {
		
		boolean word = false;
		String newString = "";
		
		for(int x = 0 ; x<text.length(); x++) {
			char ch = text.charAt(x);
			if((Character.isLetter(ch)||Character.isDigit(ch)) && word == false) {
				word = true;
				ch =Character.toUpperCase(ch);
				newString = newString+ch;
			}
			else if(ch == ' ' && word == true) {
				newString = newString+ch;
				word = false;
			}
			else {
				newString = newString+ch; 
			}
		}
		
		return newString;
		
	}

}
