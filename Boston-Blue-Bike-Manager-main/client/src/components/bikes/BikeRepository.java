package com.example.twitterserver.tweets;

import org.springframework.data.repository.CrudRepository;

public interface BikeRepository
    extends CrudRepository<Bike, Integer> {
}
