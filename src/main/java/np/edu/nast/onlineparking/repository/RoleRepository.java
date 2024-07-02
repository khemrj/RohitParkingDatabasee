package np.edu.nast.onlineparking.repository;


import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import np.edu.nast.onlineparking.entity.Role;

@Repository
public interface RoleRepository extends JpaRepository <Role,Long> {

}
