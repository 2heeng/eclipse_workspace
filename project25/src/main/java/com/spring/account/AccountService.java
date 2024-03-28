package com.spring.account;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional(propagation = Propagation.REQUIRED)
public class AccountService {

	private AccountDAO accountDAO;


	public void setAccountDAO(AccountDAO accountDAO) {
		this.accountDAO = accountDAO;
	}
	
	public void sendMoney() throws Exception{
		System.out.println("여기는 서비스");
		accountDAO.updateBalance1();
		accountDAO.updateBalance2();
	}
	
}
