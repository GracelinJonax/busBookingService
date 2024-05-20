package com.example.bookingservice.repository;

import com.example.bookingservice.model.Reward;
import com.example.bookingservice.model.UserDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RewardRepository extends JpaRepository<Reward, Long> {
    List<Reward> findByUserDetails(UserDetail user);

    List<Reward> findByStatusIsNot(String status);
}
