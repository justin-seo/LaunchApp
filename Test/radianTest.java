import java.lang.*;
import java.util.ArrayList;
import java.util.List;

public class radianTest{
	public static void main(String args[]){
		//0.6453549600727093 0.0 -0.6453549600727093 2.1302675858023914
		//lat1, lon1 (36.9761155, -122.0553419) lat2, lon2 (36.9760686, -122.055403)

		List<String> lastKnownReports = new ArrayList<>();
		System.out.println(lastKnownReports);
		lastKnownReports.add("Test");
		System.out.println(lastKnownReports);
		lastKnownReports.clear();
		System.out.println(lastKnownReports);
	}
}