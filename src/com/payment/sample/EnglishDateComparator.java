package com.payment.sample;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Comparator;
import java.util.Locale;

public class EnglishDateComparator implements Comparator<LocalDate> {
	
	private Locale locale;
	private String checkString;
	
	public EnglishDateComparator() {
		locale = new Locale("en","US");
		checkString = "r";
	}

	@Override
	public int compare(LocalDate o1, LocalDate o2)  {
		
		if (o1 == null) {
			return 1;
		}
		if (o2 == null) {
			return -1;
		}
		
		boolean o1Contains = containsCheckString(o1);
		boolean o2Contains = containsCheckString(o2);
		
		if (!o1Contains && o2Contains) {
			return 1;
		}
		if (o1Contains && !o2Contains) {
			return -1;
		}
		if (o1Contains && o2Contains) {
			return o1.compareTo(o2);
		}
		if (!o1Contains && !o2Contains) {
			return -1 * o1.compareTo(o2);
		}
		
		return 0;
	}
	
	private boolean containsCheckString(LocalDate date) {
		return date.getMonth().getDisplayName(TextStyle.FULL, locale).toLowerCase().contains(checkString.toLowerCase());
	}

}
