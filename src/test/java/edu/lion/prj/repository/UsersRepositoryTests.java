package edu.lion.prj.repository;

import edu.lion.prj.entity.Role;
import edu.lion.prj.entity.Users;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
@Slf4j
class UsersRepositoryTests {

    @Autowired
    private UsersRepository usersRepository;

    @BeforeEach
    public void testReset(){
        usersRepository.deleteAll();;
    }



    @Test
    void testCreateUser() {
        String username = "user1";
        String password = "user1";

        Users user = Users.builder().username(username).password(password).role(Role.USER).build();

        usersRepository.save(user);

        List<Users> usersList = usersRepository.findAll();

        user = usersList.get(0);

        System.out.println(user.getPassword());


    }

}
