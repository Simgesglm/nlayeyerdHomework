package nLayeredHomework.core.concretes;

import nLayeredHomework.core.abstracts.Logger;
import nLayeredHomework.entities.concretes.User;

public class EmailLogger implements Logger {

	@Override
	public void log(User user) {
		System.out.println("E mail gonderildi." +user.geteMail());		
	}

}
