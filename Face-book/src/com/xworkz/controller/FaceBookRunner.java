package com.xworkz.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.entity.FaceBookEntity;

public class FaceBookRunner {

	public static void main(String[] args) {
		
		FaceBookEntity entity=new FaceBookEntity(1,"Ganavi","N.V","nvganvi@gmail.com","349gv","Female","01-sep");
		System.out.println(entity);
		FaceBookEntity entity1=new FaceBookEntity(2,"Aishu","B.M","aishu@gmail.com","949gv","Female","05-sep");
		System.out.println(entity);
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager=factory.createEntityManager();
		
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		manager.persist(entity);
		manager.persist(entity1);
		transaction.commit();
		manager.close();
	}

}
