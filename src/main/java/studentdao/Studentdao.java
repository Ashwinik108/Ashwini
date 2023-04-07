package studentdao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Component;



import studentdto.Studentdto;


//@Component
public class Studentdao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public void insert(Studentdto hello) {
		entityTransaction.begin();
		entityManager.persist(hello);
		entityTransaction.commit();
	}
	public Studentdto findbyId(String email) {
		Studentdto dto = entityManager.find(Studentdto.class, email);
		return dto;
}
	
}
