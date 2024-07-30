package com.sakshiburman.Food.API.Repository;
import com.sakshiburman.Food.API.Entity.MenuItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuItemRepository extends JpaRepository<MenuItem, Long> {
}