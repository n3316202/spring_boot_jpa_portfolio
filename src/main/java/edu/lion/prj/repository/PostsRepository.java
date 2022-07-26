package edu.lion.prj.repository;
import edu.lion.prj.entity.Posts;
import edu.lion.prj.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Posts,Long>{
}
