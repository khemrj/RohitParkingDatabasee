package np.edu.nast.onlineparking.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import jakarta.transaction.Transactional;
import np.edu.nast.onlineparking.entity.User;

@Repository
public interface UserRepository extends JpaRepository <User,Long>{
	
	@Query( value = "select * from tbl_users where mobile = ?1",nativeQuery = true)
	public User findUserByPhone(Long phone);
	@Transactional
	@Modifying
	@Query(value = "update tbl_users set full_name = ?1, mobile = ?3,email= ?2   where user_id = ?4", nativeQuery = true)
	public void update(String name, String email,Long mobile,Long id);

}