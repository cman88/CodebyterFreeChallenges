package challeng;

public class SimpleAdding {
	
	public int adding(int num) {
		
		int total =0;
		if(num > 1000) {
			return -1;
		}
		
		for(int x = 0; x<num+1; x++){
			total = total +x;
		}
		
		
		return total;
		
	}

}
