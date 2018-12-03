import java.lang.*;

public class coordinateTest{
	public static void main(String args[]){
		double lat2 = 36.9761155;
		double lon2 = -122.0553419;
		double lat1 = 36.9760692;
		double lon1 = -122.0554275;
		double R = 6371000;
		double var1 = Math.toRadians(lat1);
		double var2 = Math.toRadians(lat2);
		double var3 = Math.toRadians(lat2-lat1);
		double var4 = Math.toRadians(lon2-lon1);
		System.out.println(var1+" "+var2+" "+var3+" "+var4);

		double a = Math.sin(var3/2) * Math.sin(var3/2) +
					Math.cos(var1) * Math.cos(var2) *
					Math.sin(var4/2) * Math.sin(var4/2);
		double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
		double d = R * c;
		d = d/1609.344;
		System.out.println(d);
	}
}