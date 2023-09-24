package gitHubDemo;

public class UseOfContinue {

	public static void main(String[] args) {
		
		System.out.println("\n---------- for loop ----------\n");
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("the value is:" + i);
		}
		
		System.out.println("\n---------- for loop after contiue 01 ----------\n");
		
		for (int i = 1; i <= 5; i++) {
			if (i == 3) {
				continue;
			}
			System.out.println("the value is: " + i);
		}
		
		System.out.println("\n---------- for loop after contiue 02 ----------\n");
		
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				continue;
			}else if (i == 7) {
				continue;
			}
			System.out.println("the value is: " + i);
		}
		
System.out.println("\n---------- for loop after contiue 03 ----------\n");
		
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1) {
				continue;
			}else if (i == 8) {
				break;
			}
			System.out.println("the value is: " + i);
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
