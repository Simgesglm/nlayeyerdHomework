package nLayeredHomework.business.concretes;

import java.util.regex.Pattern;

import nLayeredHomework.business.abstracts.EMailService;

public class EMailManager implements EMailService {

	private String eMailPattern ="^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
	
	@Override
	public boolean isEmailValid(String eMail) {
		
		Pattern pattern =Pattern.compile(eMailPattern,Pattern.CASE_INSENSITIVE);
		return pattern.matcher(eMailPattern).find();
		
		
		
	}

	
	
	

}
