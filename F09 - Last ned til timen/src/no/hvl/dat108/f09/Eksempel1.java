package no.hvl.dat108.f09;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Eksempel1 {
	
	public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60), 
				new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51), 
				new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39));
		
		// Summen av aldre
//		int sumAlder = people.stream()
//				.map(p -> p.getAge())
//				.reduce(0, (sum,element) -> sum+element);
//		
//		System.out.println(sumAlder);
//		
//		int sumAlder = people.stream()
//					.map(p -> p.getAge())
//					.reduce(0, (akk,e) -> Integer.sum(akk, e));
//			
//			System.out.println(sumAlder);
//			
//			int sumAlder = people.stream()
//					.map(p -> p.getAge())
//					.reduce(0, Integer::sum);
//			
//			System.out.println(sumAlder);
		
		int sumAlder = people.stream()
				.mapToInt(Person::getAge)
				.reduce(0, Integer::sum);
		
		System.out.println(sumAlder);
		
		// En streng med alle initialene, "CD LC TC CB MA"
		
		String initialer = people.stream().map(p -> " " + p.getFirstName().charAt(0) + p.getLastName().charAt(0)
				).collect(Collectors.joining(" "));
		
		System.out.println("|" + initialer + "|");
	}	

}










