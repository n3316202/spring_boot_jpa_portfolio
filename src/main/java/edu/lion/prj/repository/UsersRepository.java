package edu.lion.prj.repository;
import edu.lion.prj.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users,Long>{
    boolean existsByUsername(String username);
}
