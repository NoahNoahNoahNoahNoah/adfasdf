package edu.dselent.builder;

import java.time.LocalDate;

import edu.dselent.builder.Person.PersonBuilder;

public class PersonTest
{
	public static void main(String[] args)
	{
		PersonBuilder personBuilder = new Person.PersonBuilder();
		
		// Build person with method chaining
		Person myPerson = personBuilder.withFirstName("Doug")
				.withLastName("Selent")
				.withHeight(67.0)
				.withWeight(145.0)
				.withBirthDate(LocalDate.of(1987, 4, 14))
				.build();
		
		System.out.println(myPerson);
		
	}

}
