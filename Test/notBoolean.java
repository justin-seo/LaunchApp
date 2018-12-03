public class notBoolean{
	public static void main(String args[]){
		boolean LOCK_REPORT_DATA_CHANGE = false;
		LOCK_REPORT_DATA_CHANGE = true;
		if(!LOCK_REPORT_DATA_CHANGE){
			fetchrpt();
		}
		LOCK_REPORT_DATA_CHANGE = false;
	}
	static void fetchrpt(){
		System.out.println("HELLO");
	}
}