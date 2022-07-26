package edu.lion.prj.repository;

import edu.lion.prj.entity.Posts;
import edu.lion.prj.entity.Role;
import edu.lion.prj.entity.Users;
import lombok.extern.slf4j.Slf4j;
import lombok.extern.slf4j.XSlf4j;
import org.assertj.core.api.AbstractBigDecimalAssert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
@SpringBootTest
public class PostsRepositoryTests {

    @Autowired
    private PostsRepository postsRepository;

    @BeforeEach
    public void reset() {
        postsRepository.deleteAll();
    }

    @AfterEach
    public void clear() {
        postsRepository.deleteAll();
    }

    @Test
    public void testPostsCreate() {
        String title = "아행행";
        String content = "하호호";

        postsRepository.save(Posts.builder().title(title).content(content).writer("coco").build());

        List<Posts> postsList = postsRepository.findAll();

        Posts posts = postsList.get(0);

        assertThat(posts.getTitle()).isEqualTo(title);
        assertThat(posts.getContent()).isEqualTo(content);

        log.info("" + posts);
    }


}