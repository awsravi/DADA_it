package com.awsr.functionalit;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CountrySortEx {
	public static void main(String[] args) {

		Country indiaCountry = new Country(1, "India");
		Country russiaCountry = new Country(4, "Russia");
		Country englandCountry = new Country(3, "England");
		Country germanyCountry = new Country(2, "Germany");

		List<Country> listOfCountries = new ArrayList<>();
		listOfCountries.add(indiaCountry);
		listOfCountries.add(russiaCountry);
		listOfCountries.add(englandCountry);
		listOfCountries.add(germanyCountry);

		listOfCountries.stream().sorted(Comparator.comparing(Country::getCountryName))
				.forEach(country -> System.out.println(country.getCountryName()));

	}
}
