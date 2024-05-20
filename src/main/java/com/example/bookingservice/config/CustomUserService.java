//package com.example.bookingservice.config;
//
//import com.example.bookingservice.model.UserDetail;
//import com.example.bookingservice.repository.service.UserDetailsRepoService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Service;
//
//import java.util.Collections;
//
//@Service
//public class CustomUserService implements UserDetailsService {
//    @Autowired
//    UserDetailsRepoService userDetailsRepoService;
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        UserDetail userDetail=userDetailsRepoService.findByEmail(username);
//        if(userDetail==null)
//            throw new UsernameNotFoundException("user not present");
//        return new User(userDetail.getEmail(),userDetail.getPassword(),true,true,true,true, Collections.singleton(new SimpleGrantedAuthority("user")));
//    }
//
//
//    @Bean
//    public PasswordEncoder passwordEncoder(){
//        return new BCryptPasswordEncoder(11);
//    }
//}
