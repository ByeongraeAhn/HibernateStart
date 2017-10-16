package client;

import javax.net.ssl.SSLSession;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Ignore;
import org.junit.Test;

import domain.Device;
import domain.User;
import util.HibernateUtil;

public class SampleLogic_Test {

	@Test
	public void testHibernate() throws Exception {
		
		User user = new User("mybatis","안병래","송파구");
		Device device = new Device(user.getUserId(),"갤럭시8", "0101");
		
		//세션
		Session session = (Session) HibernateUtil.getSessionFactory();
		//트랜잭션 시작
		Transaction tx = session.beginTransaction();
		session.save(user);
		session.save(device);
		
		tx.commit();
		session.close();
	}
	
	@Test
	public void testHibernate2() throws Exception {
		
		Session session = (Session) HibernateUtil.getSessionFactory();
		//트랜잭션 시작
		Transaction tx = session.beginTransaction();
		User user = (User) session.get(User.class, "mybatis");
		user.setName("홍길동");
		session.save(user);
		
		tx.commit();
		session.close();
	}
}
