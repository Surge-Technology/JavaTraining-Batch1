package phonebill;

public class StdCode {

	String StdCode;
	int secperunit;

	StdCode() {

	}

	public StdCode(String stdCode, int secperunit) {
		super();
		StdCode = stdCode;
		this.secperunit = secperunit;
	}

	public String getStdCode() {
		return StdCode;
	}

	public void setStdCode(String stdCode) {
		StdCode = stdCode;
	}

	public int getSecperunit() {
		return secperunit;
	}

	public void setSecperunit(int secperunit) {
		this.secperunit = secperunit;
	}

	@Override
	public String toString() {
		return "StdCode [StdCode=" + StdCode + ", secperunit=" + secperunit + "]";
	}

}



