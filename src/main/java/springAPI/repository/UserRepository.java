package springAPI.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import springAPI.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
    void deleteByEmail(String email);
}
