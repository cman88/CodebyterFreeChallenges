package challeng;

public class FirstReverse {
	public String firstRev (String text) {
		String solution ="";
		
		for(int x = text.length(); x>0;x--) {
			solution = solution + text.charAt(x-1);
			//System.out.println(solution);
		}
		
		return solution;
	}
}
