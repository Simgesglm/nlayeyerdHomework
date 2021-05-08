package nLayeredHomework.business.concretes;

import java.util.List;


import nLayeredHomework.business.abstracts.UserService;
import nLayeredHomework.dataAccess.abstracts.UserDao;
import nLayeredHomework.entities.concretes.User;
import nLayeredHomework.core.abstracts.Logger;



public class UserManager implements UserService{
	
	private UserDao userDao;
	private Logger logger;

		public UserManager(UserDao userDao,Logger logger ) {
			this.userDao=userDao;
			this.logger=logger;
	
		}
	
	

	@Override
	public void add(User user) {
		for(User users:userDao.gettAll()) {
			if(user.geteMail()==users.geteMail()) {
				System.out.println("Girdiginiz email baskasi tarafindan alinmis. Baska bir eMail adresi giriniz . ");
				
			}
			
			System.out.println("Kaydiniz alinmistir. Uyeliginizi tamamlamak icin "+user.geteMail()+
					" hesabiniza email gonderildi.Linke tiklayarak kaydinizi tamamlayabilirsiniz.");
			
			this.logger.log(user);
			this.userDao.add(user);
			
			
			
		}
	
		
		
		
		
		
	}
	 @Override
	public void login(String eMail, String password) {
		for(User users:userDao.gettAll()) {
			if(users.geteMail().equals(eMail)&&users.getPassword().equals(password)) {
				System.out.println("Sisteme giris tamamlandi");
			}
			System.out.println("Epostanizi ve parolanizi kontrol ediniz.");
		}
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> gettAll() {
	
		return null;
		
	}
	

}
