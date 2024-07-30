package com.sakshiburman.Food.API.Repository;

import com.sakshiburman.Food.API.Entity.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
}
