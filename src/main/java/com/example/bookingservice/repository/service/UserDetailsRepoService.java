package com.example.bookingservice.repository.service;

import com.example.bookingservice.model.UserDetail;
import org.springframework.stereotype.Service;

@Service
public interface UserDetailsRepoService {
    UserDetail findByEmail(String email);
}
