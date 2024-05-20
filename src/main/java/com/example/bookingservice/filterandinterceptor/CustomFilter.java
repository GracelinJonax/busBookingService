//package com.example.bookingservice.filterandinterceptor;
//
//import jakarta.servlet.FilterChain;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import org.springframework.stereotype.Component;
//import org.springframework.web.filter.OncePerRequestFilter;
//
//import java.io.IOException;
//import java.util.Collections;
//
//@Component
//public class CustomFilter extends OncePerRequestFilter  {
////    implements Ordered
//    @Override
//    public void doFilterInternal(HttpServletRequest servletRequest, HttpServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//        System.out.println("hai");
//        Collections.list(servletRequest.getHeaderNames()).forEach(he->System.out.println(he+"  "+servletRequest.getHeader(he)));
//        filterChain.doFilter(servletRequest,servletResponse);
//    }
//
////    @Override
////    public int getOrder() {
////        return -1;
////    }
//}