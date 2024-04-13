package hiebernet_user.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import hiebernet_user.dto.User;

public class UserDao {
	public EntityManager getConnection() {
		return Persistence.createEntityManagerFactory("omkar").createEntityManager();
	}

	public Boolean resister(User user) {
		EntityManager manager=getConnection();
		EntityTransaction transaction=manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(user);
			
			transaction.commit();
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			return false;
			
			// TODO: handle exception
		}
		
	}

	public User login(String email) {
		EntityManager manager=getConnection();
		Query query=manager.createQuery("select u from User u where u.email=?1 ");
		query.setParameter(1,email);
		try {
			User user=(User) query.getSingleResult();
			return  user;
		}
		catch (Exception e) {
			return null;
			// TODO: handle exception
		}
		
		
	}

	public User updateFB(String email,String fbPassword) {
		EntityManager manager=getConnection();
		EntityTransaction transaction=manager.getTransaction();
		try {
			transaction.begin();
			User user=login(email);
			user.setFbpassword(fbPassword);
			manager.merge(user);
			transaction.commit();
			return user;
		} catch (Exception e) {
			return null;
		}
	}

	public User updateInsta(String email, String instaPassword) {
		EntityManager manager=getConnection();
		EntityTransaction transaction=manager.getTransaction();
		try {
			transaction.begin();
			User user=login(email);
			user.setInstpasswword(instaPassword);
			manager.merge(user);
			transaction.commit();
			return user;
		} catch (Exception e) {
			return null;
		}
		
	}

	public User updateSnapChat(String email, String snapChat) {
		// TODO Auto-generated method stub
		EntityManager manager=getConnection();
		EntityTransaction transaction=manager.getTransaction();
		try {
			transaction.begin();
			User user=login(email);
			user.setSnapchatpassword(snapChat);
			manager.merge(user);
			transaction.commit();
			return user;
		} catch (Exception e) {
			return null;
		}
	}

	public User updateX(String email, String xPassword) {
		// TODO Auto-generated method stub
		EntityManager manager=getConnection();
		EntityTransaction transaction=manager.getTransaction();
		try {
			transaction.begin();
			User user=login(email);
			user.setXpassword(xPassword);
			manager.merge(user);
			transaction.commit();
			return user;
		} catch (Exception e) {
			return null;
		}
	}

	
	

}
