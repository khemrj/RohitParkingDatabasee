package np.edu.nast.onlineparking.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import np.edu.nast.onlineparking.entity.User;

@Repository
public interface UserRepository extends JpaRepository <User,Long>{
	
	@Query( value = "select * from tbl_users where mobile = ?1",nativeQuery = true)
	public User findUserByPhone(Long phone);
	@Query(value = "update set full_name = ?1, mobile = ?2,email= ?3  from tbl_users where user_id = ?4", nativeQuery = true)
	public void update(String name, String email,Long mobile,Long id);

}