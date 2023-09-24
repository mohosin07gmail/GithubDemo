package gitHubDemo;

public class UseOfJavaBreak {
	
	public static void main(String[] args) {
		System.out.println("\n----------- for loop -------\n");
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
		
		System.out.println("\n -------- for loop after break --------");
		
		for (int j = 1; j <= 5; j++) {
			if (j == 3) {
				break;
			}
			System.out.println(j);
		}
		
		System.out.println("\n---------- for loop after break ----------\n");
		
		for (int k = 1; k <= 5 ; k+=2) {
			if (k == 4) {
				break;
			}
			System.out.println(k);
		}
		
		System.out.println("\n---------- while loop ----------\n");
		
		int i = 0;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("\n---------- while loop after break 01 \n");
		
		int j = 0;
		while (j <= 10) {
			if (j == 7) {
				break;
			}
			System.out.println(j);
			j+=2;
		}
		
		System.out.println("\n---------- while loop after break 02 ----------\n");
		
		int n = 1;
		while (n <= 10) {
			if (n == 7) {
				break;
			}
			System.out.println("the value is: " + n);
			n+=2;
		}
		
		System.out.println("\n---------- do while loop after break 01 ----------\n");
		
		int l = 1;
		do {			
			if (l == 5) {
				break;
			}
			System.out.println(l);
			l+=2;
		} while (l <= 7);
		
		System.out.println("\n---------- do while loop after break 02 ----------\n");
		
		int m = 1;
		do {						
			if (m == 5) {
				break;
			}
			System.out.println(m);
			m+=2;
		} while (m <= 7);
		
		
		
		
		
		
		
		
	}	

}
