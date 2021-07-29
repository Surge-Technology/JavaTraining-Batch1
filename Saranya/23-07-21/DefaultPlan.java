package phonebill;

public class DefaultPlan {
	int usage, units;
	double amount;
	static double unitCost = 0.75;
	int pulse = 60;// By default every 60 secs is one unit

	public DefaultPlan() {
		
	}

	public int getUnits() {
		return units;
	}

	public double getAmount() {
		return amount;
	}

	public void calculateUnits() {
		units = Math.round(usage / pulse);
	}

	public void calculateAmount() {
		amount = units * unitCost;
	}
}
