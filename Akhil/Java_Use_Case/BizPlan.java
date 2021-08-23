package com.telecom.billing;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;

public class BizPlan extends DefaultPlan {

	int usage;
	double unitCost = 0.75;
	int pulse = 60;
	static Boolean flag = true;

	public BizPlan(int total_seconds) {
		super(total_seconds);
		usage = total_seconds;
	}

	public static void main(String[] args) {
		Double amount = 0.0;
		int units = 0;
		int totalOutgoingSeconds = 0;

		// Current Date Format
		DateTimeFormatter date = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		// Current Time Format
		DateTimeFormatter time = DateTimeFormatter.ofPattern("HH:mm:ss");

		LocalDateTime localDateTime = LocalDateTime.now();
		// current date
		String currentDate = date.format(localDateTime);
		// current time
		String currentTime = time.format(localDateTime);

		ArrayList<PhoneDetails> arrayList = new ArrayList<PhoneDetails>();

		arrayList.add(new PhoneDetails("0803456", currentDate, currentTime, 1200, "Incoming"));
		arrayList.add(new PhoneDetails("0123456", currentDate, currentTime, 5200, "Outgoing"));
		arrayList.add(new PhoneDetails("0123456", currentDate, currentTime, 4500, "Outgoing"));
		arrayList.add(new PhoneDetails("0123456", currentDate, currentTime, 3000, "Incoming"));
		arrayList.add(new PhoneDetails("0123456", currentDate, currentTime, 2889, "Incoming"));

		// Sorting
		Collections.sort(arrayList, new CustomComparator());

		ArrayList<Customer> customer = new ArrayList<Customer>();
		for (int i = 0; i <= arrayList.size() - 1; i++) {
			if (arrayList.get(i).getFlag() == "Outgoing") {
				totalOutgoingSeconds = totalOutgoingSeconds + arrayList.get(i).getDuration();
			}
			BizPlan customerDuration = new BizPlan(arrayList.get(i).getDuration());
			amount = amount + customerDuration.calculateAmount(arrayList.get(i).getTelephoneNo(),
					arrayList.get(i).getFlag(), arrayList.get(i).getDuration());
			units = units + customerDuration.getUnits();

			int temp = arrayList.size() - 1;
			if (i == temp)
				customer.add(new Customer(amount, units, totalOutgoingSeconds));
		}
		System.out.println("Customer 1 Total Bill Amount:-" + customer.get(0).getAmount() + " Total Units:-"
				+ customer.get(0).getUnits());

	}

	// converting seconds into HH:MM:SS format
	public static String formatSeconds(int timeInSeconds) {
		int hr = (int) (timeInSeconds / 3600);
		int min = ((int) (timeInSeconds / 60)) % 60;
		int sec = (int) (timeInSeconds % 60);
		return hr + ":" + min + ":" + sec;
	}

	// calculating amount based on Std Code
	public double calculateAmount(String phoneNumber, String io, int duration) {
		// First 100 Seconds of the call are free
		if (flag & io == "Outgoing") {
			if (duration >= 100)
				usage = usage - 100;
			else
				usage = 0;
			flag = false;
		}
		// calculating the first 3 digits of teh phone number
		if (io == "Outgoing") {
			String stdcode = "";
			if (phoneNumber.length() > 3) {
				stdcode = phoneNumber.substring(0, 3);
			} else {
				stdcode = phoneNumber;
			}
			switch (stdcode) {
			case "080":
				pulse = 45;
				break;
			case "011":
				pulse = 10;
				break;
			case "012":
				pulse = 30;
				break;
			case "040":
				pulse = 40;
			default:
				pulse = 60;
			}

			units = Math.round(usage / pulse);
			return amount = units * unitCost;
		}
		return amount = 0;
	}

}
