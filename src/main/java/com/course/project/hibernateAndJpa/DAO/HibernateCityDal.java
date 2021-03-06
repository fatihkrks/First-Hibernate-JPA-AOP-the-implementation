package com.course.project.hibernateAndJpa.DAO;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.course.project.hibernateAndJpa.Entities.City;

public class HibernateCityDal implements ICityDal {

	private EntityManager entityManager;
	@Autowired
	public HibernateCityDal(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	@Transactional //AOP PROGRAMING
	public List<City> getAll() {
		Session session=entityManager.unwrap(Session.class);
		List<City> cities=session.createQuery("from City",City.class).getResultList();
		return cities;
	}

	@Override
	public void add(City city) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(City city) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(City city) {
		// TODO Auto-generated method stub
		
	}

}
