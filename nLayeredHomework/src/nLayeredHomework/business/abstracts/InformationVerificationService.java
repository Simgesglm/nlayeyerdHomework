package nLayeredHomework.business.abstracts;

import nLayeredHomework.entities.concretes.User;

public interface InformationVerificationService {
	
	void register(User user);
	void login(String eMail,String password);

}
