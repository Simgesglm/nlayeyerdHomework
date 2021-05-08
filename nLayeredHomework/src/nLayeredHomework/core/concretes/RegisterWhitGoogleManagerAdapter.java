package nLayeredHomework.core.concretes;

import nLayeredHomework.core.abstracts.RegisterWhirGoogleService;
import nLayeredHomework.google.RegisterWhitGoogleManager;

public class RegisterWhitGoogleManagerAdapter implements RegisterWhirGoogleService{

	private RegisterWhitGoogleManager manager;
	public RegisterWhitGoogleManagerAdapter(RegisterWhirGoogleService registerWhirGoogleService,
			RegisterWhitGoogleManager manager) {
		super();
		this.manager=manager;
	}

	@Override
	public void registerToSystem(String eMail, String password) {
				this.manager.register(eMail, password);
	}

	@Override
	public void loginToSystem(String eMail, String password) {
		this.manager.login(eMail, password);
		
				
	}

}
