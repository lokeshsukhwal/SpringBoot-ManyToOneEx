package com.app.lokesh.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.lokesh.entity.Account;
import com.app.lokesh.entity.Customer;
import com.app.lokesh.repository.AccountRepository;
import com.app.lokesh.repository.CustomerRepository;

@Component
public class TestRunner implements CommandLineRunner {
	@Autowired
	private CustomerRepository cRepository;
	@Autowired
	private AccountRepository aRepository;

	@Override
	public void run(String... args) throws Exception {
		Customer c1 = new Customer(473164911, "LOKESH");
		cRepository.save(c1);

		Account accountOne = new Account(461644679, "SAVING", "HDFC", c1);
		Account accountTwo = new Account(796415163, "Current", "ICICI", c1);
		Account accountThree = new Account(134648945, "SAVING", "PNB", c1);
		
		aRepository.save(accountOne);
		aRepository.save(accountTwo);
		aRepository.save(accountThree);
	}
}
