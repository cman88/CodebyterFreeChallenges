package challeng;

import java.util.Arrays;

public class AlphabetSoup {
	
	public String alpha(String text) {
		
		char[] chArray = text.toCharArray();
		Arrays.sort(chArray);
		String solution = new String(chArray);
		
		
		//System.out.println(solution);
		
		return solution;
		
	}

}
