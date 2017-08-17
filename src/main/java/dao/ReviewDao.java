package dao;


import models.Review;


import java.util.List;

public interface ReviewDao {

    //create
    void add(Review review);

    //read
    List<Review> getAllByCampsite(int campsiteId);

}