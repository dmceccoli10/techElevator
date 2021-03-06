package com.techelevator;

import org.apache.commons.dbcp2.BasicDataSource;

import com.techelevator.city.City;
import com.techelevator.city.CityDAO;
import com.techelevator.city.JDBCCityDAO;

import java.util.List;

public class DAOExample {

	public static void main(String[] args) {

		BasicDataSource worldDataSource = new BasicDataSource();
		worldDataSource.setUrl("jdbc:postgresql://localhost:5432/world");
		worldDataSource.setUsername("postgres");
		worldDataSource.setPassword("postgres1");

		CityDAO dao = new JDBCCityDAO(worldDataSource);

		City smallville = new City();
		smallville.setCountryCode("USA");
		smallville.setDistrict("KS");
		smallville.setName("Smallville");
		smallville.setPopulation(42080);

		dao.save(smallville);

		City theCity = dao.findCityById(smallville.getId());
		System.out.println("Smallville id is "+theCity.getId());
		List<City> allCities = dao.findCityByCountryCode("USA");
		for (City c : allCities) {
			System.out.println(c.getName() + " " + c.getPopulation());
		}

		List<City> allTheCitiesInOhio = dao.findCityByDistrict("Ohio");

		for (City c : allTheCitiesInOhio) {
			System.out.println(c.getName() + " " + c.getPopulation());
		}

		//Change all of the cities in ohio to be in oz
		for (City c : allCities) {
			c.setDistrict("Oz"); //this modifies memory
			dao.update(c); //this saves the change to the database
		}

		//delete smallville aka theCity
		dao.delete(theCity.getId());
	}
}
