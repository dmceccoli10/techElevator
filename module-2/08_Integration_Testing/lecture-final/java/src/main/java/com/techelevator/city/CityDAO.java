package com.techelevator.city;

import java.util.List;

public interface CityDAO {

	public void create(City newCity);

	public City findCityById(long id);

	public List<City> findCityByCountryCode(String countryCode);

	public List<City> findCityByDistrict(String district);

	public City update(City city);

	public void delete(long id);
}
