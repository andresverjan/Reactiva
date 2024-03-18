package com.co.bancolombia.activitylearn1;

import com.co.bancolombia.activitylearn1.domain.collections.Person;
import com.co.bancolombia.activitylearn1.domain.dto.PersonDto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class ActivityLearn1Application {

	public static void main(String[] args) {
		SpringApplication.run(ActivityLearn1Application.class, args);

		List<Person> students = List.of(
				new Person("1", "Juan", "Pérez", "123456789", 30, "Aries"),
				new Person("2","María", "Gómez", "987654321", 25, "Virgo"),
				new Person("3","Carlos", "Martínez", "555444333", 40, "Capricorn"),
				new Person("4","Laura", "Rodríguez", "111222333", 35, "Taurus"),
				new Person("5","Pedro", "Sánchez", "999888777", 28, "Leo"),
				new Person("6","Ana", "Fernández", "666777888", 22, "Aquarius"),
				new Person("7","David", "López", "333222111", 45, "Cancer"),
				new Person("8","Sofía", "Díaz", "777666555", 32, "Geminis"),
				new Person("9","Javier", "Hernández", "888999000", 27, "Scorpio"),
				new Person("10","Elena", "García", "112233445", 33, "Libra"),
				new Person("11","Pablo", "Muñoz", "554433221", 38, "Pisces"),
				new Person("12","Rosa", "Jiménez", "998877665", 29, "Sagittarius")
		);


		// declarative form

		// print all students
		System.out.println("List of students: ");
		students.forEach(System.out::println);

		// print all students with star sign is Aquarius
		System.out.println("print all students with star sign is Aquarius");
		List<Person> aquariusStudents = students
				.stream()
				.filter(aquarius -> aquarius.getStarSign().equalsIgnoreCase("Aquarius"))
				.toList();
		
        aquariusStudents.forEach(System.out::println);

		// print all students over 25 years old
		System.out.println("print all students over 25 years old");
		students.stream()
				.filter(student -> student.getAge() > 25)
				.forEach(System.out::println);


		// imperative form

		// print all students
		for (Person student : students)
			System.out.println(student);

		// print all students with star sign "Aquarius"
		for (Person student1 : students){
			if (student1.getStarSign().equalsIgnoreCase("Aquarius")) {
				System.out.println(student1);
			}
		}

		// print all students over 25 years old
		for (Person student2 : students){
			if (student2.getAge() > 25) {
				System.out.println(student2);
			}
		}


	}

}
