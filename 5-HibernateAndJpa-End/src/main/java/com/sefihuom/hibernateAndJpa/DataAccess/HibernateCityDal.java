package com.sefihuom.hibernateAndJpa.DataAccess;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sefihuom.hibernateAndJpa.Entities.City;

//JPA - ORM
@Repository
public class HibernateCityDal implements ICityDal {

	private EntityManager entitymanager;

	@Autowired
	public HibernateCityDal(EntityManager entitymanager) {
		this.entitymanager = entitymanager;
	}

	@Override
	@Transactional // AOP - Aspect Oriented Programing
	public List<City> getAll() {
		Session session = entitymanager.unwrap(Session.class);
		List<City> cities = session.createQuery("from City", City.class).getResultList();
		return cities;
	}

	@Override
	public void add(City city) {
		// burda id kontrol edilebilinir tekrarı önlemek için
		Session session = entitymanager.unwrap(Session.class);
        session.saveOrUpdate(city);
	}

	@Override
	public void update(City city) {
		Session session = entitymanager.unwrap(Session.class);
        session.saveOrUpdate(city);

	}

	@Override
	public void delete(City city) {
		Session session = entitymanager.unwrap(Session.class);
		City cityToDelete = session.get(City.class, city.getId());
        session.delete(cityToDelete);
	}
	

	@Override
	public City getById(int id) {
		Session session = entitymanager.unwrap(Session.class);
		City city = session.get(City.class, id);
		return city;
	}

}
