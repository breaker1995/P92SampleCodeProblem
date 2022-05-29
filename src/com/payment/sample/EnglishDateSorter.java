package com.payment.sample;

import java.time.LocalDate;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class EnglishDateSorter implements DateSorter {

	@Override
	public SortedSet<LocalDate> sortDates(Set<LocalDate> unsortedDates) {
		SortedSet<LocalDate> dates = new TreeSet<LocalDate> (new EnglishDateComparator());
		dates.addAll(unsortedDates);
		return dates;
	}

}
