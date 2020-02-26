
package date_time_api;

import java.time.Duration;
import java.time.Instant;

public class InstantExample {

	public static void main(String[] args) {
		// Current timestamp
		Instant timestamp = Instant.now();
		System.out.println("Current Timestamp = " + timestamp);

		System.out.println(timestamp.toEpochMilli());
		// Instant from timestamp
		// Instant specificTime =
		// Instant.ofEpochMilli(timestamp.toEpochMilli());
		Instant specificTime = Instant.ofEpochMilli(0);
		System.out.println("Specific Time = " + specificTime);

		// Duration example
		Duration thirtyDay = Duration.ofDays(30);
		System.out.println(thirtyDay);
	}

}
