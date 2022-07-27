package edu.lion.prj.repository;
import edu.lion.prj.entity.Boards;
import edu.lion.prj.entity.Posts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardsRepository extends JpaRepository<Boards,Long>{
}
