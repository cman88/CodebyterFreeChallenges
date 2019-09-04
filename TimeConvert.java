package challeng;

public class TimeConvert {
	
	public String timeCon(int num) {
		
		String solution ="";
		
		if(num >= 60) {			
			int hours = num/60;
			int minutes = num - (hours *60);
			solution = String.valueOf(hours)+":"+String.valueOf(minutes);
			
		}

		else if(num < 60) {
			int minutes = num;
			solution ="0"+":"+String.valueOf(minutes);
		}
		
		return solution;
		
	}

}
