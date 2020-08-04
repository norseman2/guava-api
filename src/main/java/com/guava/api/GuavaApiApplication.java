package com.guava.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.beans.factory.annotation.Autowired;

import com.guava.api.domain.Account;
import com.guava.api.domain.AccountRepository;
import com.guava.api.domain.Policy;
import com.guava.api.domain.PolicyRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class GuavaApiApplication {

	private static final Logger logger = LoggerFactory.getLogger(GuavaApiApplication.class);

	@Autowired 
	private AccountRepository accountRepository;	

	@Autowired 
	private PolicyRepository policyRepository;		

	public static void main(String[] args) {
		SpringApplication.run(GuavaApiApplication.class, args);
		logger.info("Spring Boot guava-api launched");
	}

	@Bean

	CommandLineRunner runner(){
		return args -> {
			Account a1 = new Account("FK810FH", "Michel Onfray", "27 King's College Cir, Toronto, ON M5S", "446 686 792");
			Account a2 = new Account("FK822KN", "Marcus Aurelius", "2500 University Dr NW, Calgary, AB T2N 1N4", "711 169 623");
			Account a3 = new Account("FH901EM", "Hayden Christensen", "800 Griffiths Way, Vancouver, BC V6B 6G1", "163 551 203");
			accountRepository.save(a1);
			accountRepository.save(a2);
			accountRepository.save(a3);
			java.sql.Timestamp effectiveDate1 = java.sql.Timestamp.valueOf("2019-11-15 15:30:00");
			java.sql.Timestamp expirationDate1 = java.sql.Timestamp.valueOf("2021-03-01 00:00:00");
			Policy p1 = new Policy("Personnal Auto", "Premium Program", "6573144459", effectiveDate1, expirationDate1, 741.00, 41.00, 782.00, "301-008578 ACV Property Insurance", a1);
			policyRepository.save(p1);
		};
	  }
}
