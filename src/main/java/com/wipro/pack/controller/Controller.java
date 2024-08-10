package com.wipro.pack.controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.pack.bean.Account;

@RestController
public class Controller {
	
	private static List<Account> accounts=Stream.of(new Account(101,"savings",1200.00),
													new Account(102,"current",1300.00),
													new Account(103,"demat",20000.00)).collect(Collectors.toList());
	
	@GetMapping(path="/accounts")
	public List<Account> getAccounts(){
		return accounts;
	}
	
	@GetMapping(path="/accounts/{id}")
	public Account getAccountById(@PathVariable Integer id){
		Optional<Account> optional=accounts.stream().filter(account->id==account.getId()).findFirst();
		return optional.isPresent()?optional.get(): new Account(0,"default account",0.000); 
	}
	
	@PostMapping(path="/accounts")
	public List<Account> createAcccount(@RequestBody Account account) {
		accounts.add(account);
		return accounts;
	}
	
	
	@DeleteMapping(path="/accounts/{id}")
	public List<Account> deleteAccountById(@PathVariable Integer id){
		accounts.removeIf(account-> id==account.getId());
		return accounts;
	}
	
	@PutMapping(path="/accounts")
	public List<Account> updateAccount(@RequestBody Account acc){
		accounts.removeIf(account->acc.getId()==account.getId());
		return accounts;
	}
	
}
