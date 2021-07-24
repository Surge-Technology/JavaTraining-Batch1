package TelephoneBillCalculation;

public class StdCode {
	
	String StdCode;
	int SecondsperUnit;
	
	
	public String getStdCode() {
		return StdCode;
	}
	public void setStdCode(String stdCode) {
		StdCode = stdCode;
	}
	public int getSecondsperUnit() {
		return SecondsperUnit;
	}
	public void setSecondsperUnit(int secondsperUnit) {
		SecondsperUnit = secondsperUnit;
	}
	
	
	
	
	public StdCode(String stdCode, int secondsperUnit) {
		super();
		StdCode = stdCode;
		SecondsperUnit = secondsperUnit;
	}
	public StdCode() {
		
	}
	@Override
	public String toString() {
		return "StdCode [StdCode=" + StdCode + ", SecondsperUnit=" + SecondsperUnit + "]";
	}
	
	

}
