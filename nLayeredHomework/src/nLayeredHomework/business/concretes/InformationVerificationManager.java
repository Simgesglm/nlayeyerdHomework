package nLayeredHomework.business.concretes;

import nLayeredHomework.business.abstracts.EMailService;
import nLayeredHomework.business.abstracts.InformationVerificationService;
import nLayeredHomework.business.abstracts.UserService;
import nLayeredHomework.entities.concretes.User;

public class InformationVerificationManager implements InformationVerificationService{

	private EMailService eMailService;
	private UserService userService;
	
	public InformationVerificationManager(EMailService eMailService,UserService userService) {
		this.eMailService=eMailService;
		this.userService=userService;
	}
	
	@Override
	public void register(User user) {
		
		if(eMailService.isEmailValid(user.geteMail())) {
			if(user.getFirstName().length()>2) {
				if(user.getLastName().length()>2) {
					if(user.getPassword().length()>=6) {
						userService.add(user);
					}
					System.out.println("parolaniz en az 6 karakterden olusmalidir");
				}
				System.out.println("Soyadiniz en az iki karakterden olusmalidir.");
			}
			System.out.println("Adiniz en az iki karakterden olusmalidir.");
		}
		System.out.println("girdi[iniz i Mail aderesinden emin olunuz.");
		
				
	}

	@Override
	public void login(String eMail,String password ) {
		if(eMailService.isEmailValid(eMail)) {
			userService.login(eMail, password);
			return;
		}
		System.err.println("gecerli bir e posta aderesi giriniz");
			
	}

}
