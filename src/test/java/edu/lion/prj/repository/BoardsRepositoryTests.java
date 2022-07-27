package edu.lion.prj.repository;

import edu.lion.prj.entity.Boards;
import edu.lion.prj.entity.Posts;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
@SpringBootTest
public class BoardsRepositoryTests {

    @Autowired
    private BoardsRepository boardsRepository;

    @Test
    public void testBoardsCreate() {

        Boards board = Boards.builder()
                        .content("아행해")
                        .title("아행해")
                        .build();

        boardsRepository.save(board);

        List<Boards> boards = boardsRepository.findAll();

        for(Boards vo : boards){
            log.info("====================" + vo.getContent());
        }

        board = boards.get(0);

        log.info("" + board);
    }


}