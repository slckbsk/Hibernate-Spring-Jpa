package com.sefihuom.hibernateAndJpa.Business;

import java.util.List;

import com.sefihuom.hibernateAndJpa.Entities.City;

public interface ICityService {

	List<City> getAll();
	void add(City city);
	void update(City city);
	void delete(City city);
	City getByİd (int id);
}
