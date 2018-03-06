package com.kata;

import static com.kata.formatters.DateFormatter.*;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.kata.models.Account;
import com.kata.services.OperationService;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;


@SpringBootApplication
public class KataApplication implements CommandLineRunner {
	
	
	@Autowired
    private OperationService operationService;
	

	public OperationService getOperationService() {
		return operationService;
	}

	public void setOperationService(OperationService operationService) {
		this.operationService = operationService;
	}

	public static void main(String[] args) {
		
		
		 SpringApplication app = new SpringApplication(KataApplication.class);
	        app.setBannerMode(Banner.Mode.OFF);
	        app.run(args);
		
	}
	
	 @Override
	    public void run(String... args) throws Exception {

		 Account account = new Account();
			getOperationService().doDeposit(account,100.5, date("10-01-2018"));
			getOperationService().doDeposit(account,205, date("13-01-2018"));
			getOperationService().doWithdrawal(account,500, date("15-01-2018"));
			
			account.printHistory();
	    }

}
