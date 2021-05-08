package nLayeredHomework.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import nLayeredHomework.dataAccess.abstracts.UserDao;
import nLayeredHomework.entities.concretes.User;

public class HibernateUserDao implements UserDao{
	private List<User> users=new ArrayList<User>();
	
	
	@Override
	public void add(User user) {
		users.add(user);
		System.out.println("Dogrulama tamamlandi");
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Hibernate ile silindi "+user.getFirstName()+" "+user.getLastName());
		
	}

	@Override
	public void update(User user) {
		System.out.println("Hibernate ile guncellendi "+user.getFirstName()+" "+user.getLastName());
		
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

	@Override
	public void login(User user) {
		
		
	}

}
