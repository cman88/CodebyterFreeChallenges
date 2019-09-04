package challeng;

public class FirstFactorial {
	
	public int FindFactorial(int num) {
		
			if(num == 1) {
				return 1;
			}
			else {
				return (num * FindFactorial (num - 1));
			}
		
	}

}
