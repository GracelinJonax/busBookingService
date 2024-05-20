package com.example.bookingservice.repository.service.impl;

import com.example.bookingservice.model.UserDetail;
import com.example.bookingservice.repository.UserDetailsRepository;
import com.example.bookingservice.repository.service.UserDetailsRepoService;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsRepoServiceImpl implements UserDetailsRepoService {
    private final UserDetailsRepository userDetailsRepository;

    public UserDetailsRepoServiceImpl(UserDetailsRepository userDetailsRepository) {
        this.userDetailsRepository = userDetailsRepository;
    }

    @Override
    public UserDetail findByEmail(String email) {
        return userDetailsRepository.findByEmail(email);
    }
}
