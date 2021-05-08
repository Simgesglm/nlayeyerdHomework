package nLayeredHomework;

import nLayeredHomework.business.concretes.UserManager;
import nLayeredHomework.core.concretes.EmailLogger;
import nLayeredHomework.dataAccess.concretes.HibernateUserDao;
import nLayeredHomework.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		UserManager userManager=new UserManager(new HibernateUserDao(),new EmailLogger() );
		User user=new User(1, "simge", "saglam", "simge123@icloud.com", "123456");
		userManager.add(user);
		
		
	
		
		
		
		
		
		
		

		

	}

}
