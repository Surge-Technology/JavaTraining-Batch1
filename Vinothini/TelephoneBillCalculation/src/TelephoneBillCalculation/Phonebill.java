package TelephoneBillCalculation;



public class Phonebill {


	String Phonenumber;
	String Date;
    String Time;
	int Duration;
	String Flag;
	StdCode std = new StdCode();
	
	
	
	
	public Phonebill(String phonenumber, String date, String time, int duration, String flag,
			TelephoneBillCalculation.StdCode std) {
		super();
		Phonenumber = phonenumber;
		Date = date;
		Time = time;
		Duration = duration;
		Flag = flag;
		this.std = std;
	}
	public String getPhonenumber() {
		return Phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		Phonenumber = phonenumber;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public String getTime() {
		return Time;
	}
	public void setTime(String time) {
		Time = time;
	}
	public int getDuration() {
		return Duration;
	}
	public void setDuration(int duration) {
		Duration = duration;
	}
	public String getFlag() {
		return Flag;
	}
	public void setFlag(String flag) {
		Flag = flag;
	}
	public StdCode getStd() {
		return std;
	}
	public void setStd(StdCode std) {
		this.std = std;
	}
	@Override
	public String toString() {
		return "Phonebill [Phonenumber=" + Phonenumber + ", Date=" + Date + ", Time=" + Time + ", Duration=" + Duration
				+ ", Flag=" + Flag + ", std=" + std + "]";
	}
	public Phonebill() {
		
	}
	
	
}

