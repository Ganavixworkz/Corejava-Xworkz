package com.xworkz.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.entity.FaceBookEntity;

public class FaceBookSearch {

	public static void main(String[] args) {
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager=factory.createEntityManager();
		
		FaceBookEntity entity=manager.find(FaceBookEntity.class, 1);
		System.out.println(entity);
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		entity.setPassword("ganu");
        manager.merge(entity);
		transaction.commit();
		manager.close();
		}

}
