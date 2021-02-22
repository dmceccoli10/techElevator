package com.techelevator.services;

import com.techelevator.models.City;
import com.techelevator.models.Hotel;
import com.techelevator.models.Review;
import org.springframework.web.client.RestTemplate;

public class HotelService {

    private final String API_BASE_URL;
    private RestTemplate restTemplate = new RestTemplate();

    //API_BASE_URL = "http://localhost:3000/"
    public HotelService(String apiURL) {
        API_BASE_URL = apiURL;
    }

    public Hotel[] listHotels() {
        // call the API to get the list of hotels, getForObject(path to resource/api call, what I expect back)
        return restTemplate.getForObject(API_BASE_URL+"hotels", Hotel[].class);
        //return restTemplate.getForObject("http://localhost:3000", Hotel[].class); --another way of writing line 20
    }

    public Review[] listReviews() {
        return restTemplate.getForObject(API_BASE_URL+"reviews", Review[].class);
    }

    public Hotel getHotelById(int id) {
        return restTemplate.getForObject(API_BASE_URL+"hotels/"+id,Hotel.class);
    }

    public Review[] getReviewsByHotelId(int hotelID) {
        //http://localhost:3000/hotels/1/reviews
        return restTemplate.getForObject(API_BASE_URL+"hotels/"+hotelID+"/reviews", Review[].class);
    }

    public Hotel[] getHotelsByStarRating(int stars) {
        //http://localhost:3000/hotels?stars=3
        return restTemplate.getForObject(API_BASE_URL+"hotels/?stars="+stars, Hotel[].class);
    }

    public City getWithCustomQuery(){
        return null;
    }

}
