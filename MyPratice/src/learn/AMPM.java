package Patterns;

import java.util.Arrays;

public class AMPM {

	public static void main(String[] args) {
		System.out.println(timeConversion("12:05:45PM"));

	}

	public static String timeConversion(String s) {

		String output="";
		String[] time = s.split(":");
		time[2]=time[2].replace("PM", "");
		time[2]=time[2].replace("AM", "");
		int hour = Integer.parseInt(time[0]);
		if (s.contains("PM") && hour<12) {
			hour = hour + 12;
			time[0] = String.valueOf(hour);
		}
		else if (time[0].equals("12") && s.contains("AM")) {
		time[0]="00";	
		}
		

		Arrays.toString(time);
		int len = 0;
		for (String ss : time) {
			int size = time.length;
			output = output+ss;
			len++;
			if (len < size) {
				
				output = output + ":";
			}
		}

		return output;
	}

}
