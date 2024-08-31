package new_date_time_api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class NewDateTimeApi 
{
	
	void meth1()
	{
		for(String s:ZoneId.getAvailableZoneIds()) {
			System.out.println(s);
		}
		System.out.println("==>"+ZoneId.getAvailableZoneIds().size());
	}
	public static void main(String[] args) {
		System.out.println(LocalDate.now());
		System.out.println(LocalDateTime.now());
		System.out.println(ZonedDateTime.now());
		System.out.println(LocalTime.now(ZoneId.of("America/Toronto")));
      new NewDateTimeApi().meth1();
	}

}
