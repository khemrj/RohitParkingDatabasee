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

}