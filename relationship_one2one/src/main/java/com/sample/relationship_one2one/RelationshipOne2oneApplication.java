package com.sample.relationship_one2one;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cglib.core.Local;
import org.springframework.context.ConfigurableApplicationContext;

import com.repository.PassportRepository;
import com.repository.PersonRepository;
import com.sample.model.Passport;
import com.sample.model.Person;

@SpringBootApplication
public class RelationshipOne2oneApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(RelationshipOne2oneApplication.class, args);

		PersonRepository personRepo=context.getBean(PersonRepository.class);

		PassportRepository passportRepository=context.getBean(PassportRepository.class);

		Person p=new Person();
		p.setPersonName("Manonmani");
		p.setPersonGender("Female");

		Passport passport=new Passport();
		passport.setPassportNum("KVG093432");
		passport.setIssueDate(LocalDate.now());
		passport.setExpiryDate(LocalDate.now().plusYears(10));

		p.setPassport(passport);
		passport.setPerson(p);

		personRepo.save(p);

		
	}

}
