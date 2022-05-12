package com.sefihuom.hibernateAndJpa.Business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sefihuom.hibernateAndJpa.DataAccess.ICityDal;
import com.sefihuom.hibernateAndJpa.Entities.City;

@Service
public class CityManager implements ICityService {

	private ICityDal cityDal;

	@Autowired
	public CityManager(ICityDal cityDal) {
		this.cityDal = cityDal;
	}

	@Override
	@Transactional
	public List<City> getAll() {
		return cityDal.getAll();
	}

	@Override
	@Transactional
	public void add(City city) {
		// city eklenecek AMA tekrar olmayacak gibi
		// controller yazılabilinir business codları
		this.cityDal.add(city);
	}

	@Override
	@Transactional
	public void update(City city) {
		this.cityDal.add(city);
	}

	@Override
	@Transactional
	public void delete(City city) {
		this.cityDal.delete(city);

	}

	@Override
	@Transactional
	public City getByİd(int id) {
		return this.cityDal.getById(id);
	}

}
