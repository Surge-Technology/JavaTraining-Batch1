package phonebill;

import java.math.BigInteger;

public class PhoneNumber {

	String telephone;
	String date;
	String time;
	int duration;
	String flag;
	StdCode std = new StdCode();
     
	
	PhoneNumber() {

	}

	 PhoneNumber(String telephone, String date, String time, int duration, String flag, StdCode std ) {
		
		this.telephone = telephone;
		this.date = date;
		this.time = time;
		this.duration = duration;
		this.flag = flag ;
		this.std = std;
	}

	
	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public StdCode getStd() {
		return std;
	}

	public void setStd(StdCode std) {
		this.std = std;
	}

	@Override
	public String toString() {
		return "PhoneNumber [telephone=" + telephone + ", date=" + date + ", time=" + time + ", duration=" + duration
				+ ", flag=" + flag + ", std=" + std + "]";
	}

	

	

}
