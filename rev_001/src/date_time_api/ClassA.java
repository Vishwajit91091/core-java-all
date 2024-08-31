package date_time_api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Set;

public class ClassA {
	void meth1() {
		//Set<String> zones = ZoneId.getAvailableZoneIds();
		//for (String zone : zones)
		for(String s:ZoneId.getAvailableZoneIds())
		{
			System.out.println(s);
		}
		System.out.println("==>" + ZoneId.getAvailableZoneIds().size());
	}

	public static void main(String[] args) {
		new ClassA().meth1();
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());
		System.out.println(LocalTime.now(ZoneId.of("America/Cuiaba")));
	}

}
