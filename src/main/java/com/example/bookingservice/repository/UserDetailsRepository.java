package com.example.bookingservice.repository;

import com.example.bookingservice.model.UserDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDetailsRepository extends JpaRepository<UserDetail, String> {
    UserDetail findByEmail(String email);
}
