package challeng;

import java.util.Arrays;

public class LetterChanges {
	
	public String changing(String text) {
		
		String alpha = "abcdefghijklmnopqrstuvwxyz";
		String newString ="";
		
		for(int x = 0; x<text.length(); x++) {
			char ch = text.charAt(x);
			if(Character.isLetter(ch) && ch !='z' && ch!= 'Z') {
				int index = alpha.indexOf(ch);
				newString = newString + alpha.charAt(index+1);
			}
			else if(ch == 'z' || ch == 'Z') {
				newString = newString + 'a';
			}
			else {
				newString = newString + ch;
			}
		}
		
		String solution = "";
		
		for(int y = 0; y < newString.length(); y++) {
			char nSC = newString.charAt(y);
			if(nSC == 'a' || nSC == 'e' || nSC == 'i' || nSC == 'o' || nSC == 'u') {
				char upV = Character.toUpperCase(nSC);
				solution = solution + upV;
			}
			else {
				solution = solution + nSC;
			}
		}
		
		System.out.println(solution);
		
		return solution;
		
	}

}
