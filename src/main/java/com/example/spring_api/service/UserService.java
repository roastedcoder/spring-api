package com.example.spring_api.service;

import com.example.spring_api.api.model.User;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private List<User> userList;

    public UserService() {
        userList = new ArrayList<>();

        User user1 = new User(1, "Bob", 12, "bob@email.com");
        User user2 = new User(2, "Alice", 11, "alice@email.com");
        User user3 = new User(3, "Alice1", 13, "alice1@email.com");
        User user4 = new User(4, "Bob1", 10, "bob1@email.com");
        User user5 = new User(5, "Alice2", 14, "alice2@email.com");

        userList.addAll(Arrays.asList(user1, user2, user3, user4, user5));
    }

    public Optional<User> getUser(Integer id) {
        Optional optional = Optional.empty();
        for(User user: userList) {
            if(id == user.getId()) {
                optional = Optional.of(user);
                return optional;
            }
        }
        return optional;
    }
}
