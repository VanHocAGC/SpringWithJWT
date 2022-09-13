package com.carmanager.carapp;

import com.carmanager.carapp.domain.Role;
import com.carmanager.carapp.domain.User;
import com.carmanager.carapp.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;

@SpringBootApplication
public class CarAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarAppApplication.class, args);
    }

    @Bean
    PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Bean
    CommandLineRunner run(UserService userService){
        return args->{
            userService.saveRole(new Role(null,"ROLE_USER"));
            userService.saveRole(new Role(null,"ROLE_ADMIN"));
            userService.saveRole(new Role(null,"ROLE_MANAGER"));
            userService.saveRole(new Role(null,"ROLE_SUPER_ADMIN"));

            userService.saveUser(new User(null,"Van Tran","vantran12","1234", new ArrayList<>()));
            userService.saveUser(new User(null,"Quang Sang","sangthai","1234", new ArrayList<>()));
            userService.saveUser(new User(null,"Xuan Nhat","nhatban","1234", new ArrayList<>()));
            userService.saveUser(new User(null,"Thanh Nghi","heo9.5","1234", new ArrayList<>()));

            userService.addRoleToUser("vantran12","ROLE_ADMIN");
            userService.addRoleToUser("vantran12","ROLE_SUPER_ADMIN");
            userService.addRoleToUser("sangthai","ROLE_MANAGER");
            userService.addRoleToUser("sangthai","ROLE_ADMIN");
            userService.addRoleToUser("nhatban","ROLE_USER");
            userService.addRoleToUser("nhatban","ROLE_ADMIN");
            userService.addRoleToUser("heo9.5","ROLE_USER");
        };

    }

}
