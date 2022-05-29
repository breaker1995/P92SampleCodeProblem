package com.payment.sample;

import java.time.LocalDate;
import java.util.SortedSet;
import java.util.TreeSet;

public class Program {
	public static void main(String[] args) {
		DateSorter dateSorter = new EnglishDateSorter();
		SortedSet<LocalDate> dates = new TreeSet<LocalDate> ();
		dates.add(LocalDate.parse("2019-03-13"));
		dates.add(LocalDate.parse("2019-07-01"));
		dates.add(LocalDate.parse("2019-01-02"));
		dates.add(LocalDate.parse("2019-01-01"));
		dates.add(LocalDate.parse("2019-05-03"));
		dates.add(LocalDate.parse("2019-06-04"));
		dates.add(LocalDate.parse("2019-11-30"));
		dates.add(LocalDate.parse("2019-08-20"));
		for (LocalDate date : dateSorter.sortDates(dates)) {
			System.out.println(date);
		}
	}
}
