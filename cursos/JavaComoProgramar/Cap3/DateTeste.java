public class DateTeste{
	static Date date;
	public static void main(String args[]){
	    date = new Date(20,4,2019);
	    System.out.println(displayDate());
	}

	public static String displayDate(){
		String men = date.toString();
		return "Data(MM/dd/yyyy):  "+men;
	}
}