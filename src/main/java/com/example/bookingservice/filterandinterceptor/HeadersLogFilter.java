//package com.example.bookingservice.filterandinterceptor;
//
//import jakarta.servlet.*;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import org.springframework.core.annotation.Order;
//import org.springframework.stereotype.Component;
//import org.springframework.web.filter.OncePerRequestFilter;
//
//import java.io.IOException;
//import java.util.Collections;
//
//@Component
////public class HeadersLogFilter implements Filter {
//@Order(0)
//public class HeadersLogFilter extends OncePerRequestFilter {
////    @Override
////    public void init(FilterConfig filterConfig) throws ServletException {
////        Filter.super.init(filterConfig);
////    }
////    @Override
////    public void destroy() {
////        Filter.super.destroy();
////    }
//    @Override
////    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//    public void doFilterInternal(HttpServletRequest servletRequest, HttpServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//       System.out.println("hello");
////        HttpServletRequest h=(HttpServletRequest)servletRequest;
//        Collections.list(servletRequest.getHeaderNames()).forEach(he->System.out.println(he+"  "+servletRequest.getHeader(he)));
//        filterChain.doFilter(servletRequest,servletResponse);
//    }
//}
