package com.gulukal.blogonetooneapp;

import com.gulukal.blogonetooneapp.model.User;
import com.gulukal.blogonetooneapp.model.UserDetail;
import com.gulukal.blogonetooneapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BlogOneToOneAppApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(BlogOneToOneAppApplication.class, args);
    }

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        User user = User.builder().name("Gulten").lastName("Ulukal").mail("gulten@mail.com").build();

        UserDetail userDetail = UserDetail.builder().city("Istanbul").language("TR").build();

        //  associate the objects

        user.setUserDetail(userDetail);
        userRepository.save(user);

    }
}
