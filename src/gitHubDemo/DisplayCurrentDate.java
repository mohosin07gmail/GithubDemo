package gitHubDemo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DisplayCurrentDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		
		LocalTime localTime = LocalTime.now();
		System.out.println(localTime);
		
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);
		
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("E MMM dd yyyy hh:mm:ss");
		String formattedDateAndTime = localDateTime.format(dateTimeFormatter);
		System.out.println(formattedDateAndTime);
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
