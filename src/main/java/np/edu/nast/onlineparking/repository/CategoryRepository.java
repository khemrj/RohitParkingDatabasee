package np.edu.nast.onlineparking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import np.edu.nast.onlineparking.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository <Category,Long> {
	@Query(value = "select category_id from tbl_categories where name = ?1", nativeQuery = true)
	public String findCatId(String name);

}
