package com.pixeltrice.springbootcallenabledapp;

import java.net.URI;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Call;
import com.twilio.type.PhoneNumber;

@SpringBootApplication
public class SpringBootCallEnabledAppApplication implements ApplicationRunner {

	        private final static String ACCOUNT_SID = "AC4ce08cb7d90996297c14c5125096e8c7";
			private final static String AUTH_ID = "5f40361536e4e4dd18c11c1bca2eaad2";
			private final static String FROM_NUMBER="+12028739674";
			private final static String TO_NUMBER =" +2348154006732";
	
			static {
				   Twilio.init(ACCOUNT_SID, AUTH_ID);
				}
			
	public static void main(String[] args) {
		SpringApplication.run(SpringBootCallEnabledAppApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Call.creator(new PhoneNumber(TO_NUMBER), new PhoneNumber(FROM_NUMBER),
				   new URI("http://demo.twilio.com/docs/voice.xml")).create();
		
	}

}
