import java.text.SimpleDateFormat;
import java.util.Date;

public class checkTime{
	public static void main(String args[]){
		System.out.println(checkTime2("1543798097970", 53));
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm");
		System.out.println(sdf.format(new Date(System.currentTimeMillis())));
		System.out.println(Long.toString(System.currentTimeMillis()));

	}

	public static boolean checkTime2(String reported_time, int hour_preference){
		long reported_time_long = Long.parseLong(reported_time); //convert reported time to long. Stored as string
		long current_time = System.currentTimeMillis(); // store current time
		long hour = 3600000*Long.valueOf(hour_preference); //this is epoche
		current_time -= hour; //update current time by subtracting the number of hours to it
		System.out.println(current_time);
		System.out.println(reported_time_long);
		if(current_time >= reported_time_long){
			return true;
		}else{
			return false;
		}
	}
}