package challeng;

public class CheckNums {
	
	public String check(int num1, int num2) {
		
		if(num2 > num1) {
			return "true";
		}
		else if(num2 < num1) {
			return "false";
		}
		else {
			return "-1";
		}
	}

}
