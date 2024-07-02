package np.edu.nast.onlineparking.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import np.edu.nast.onlineparking.entity.ParkingPlace;

@Repository
public interface ParkingPlaceRepository extends JpaRepository<ParkingPlace,Long>{
//	@Query(value = "SELECT place_name , address, \r\n"
//			+ "       (6371 * acos(\r\n"
//			+ "           cos(radians(?1)) * cos(radians(latitude)) * \r\n"
//			+ "           cos(radians(longitude) - radians(?2)) + \r\n"
//			+ "           sin(radians(?1)) * sin(radians(latitude))\r\n"
//			+ "       )) AS distance\r\n"
//			+ "FROM tbl_parking_place\r\n"
//			+ "HAVING distance > 3 ORDER BY \r\n"
//			+ "    distance ASC", nativeQuery = true)
	@Query(value = "SELECT *, \r\n"
			+ "       (6371 * acos(\r\n"
			+ "           cos(radians(28.729861399999997)) * cos(radians(latitude)) * \r\n"
			+ "           cos(radians(longitude) - radians(80.56762839999999)) + \r\n"
			+ "           sin(radians(28.729861399999997)) * sin(radians(latitude))\r\n"
			+ "       )) AS distance\r\n"
			+ "FROM tbl_parking_place\r\n"
			+ "HAVING distance > 3 ORDER BY \r\n"
			+ "    distance ASC",nativeQuery = true)
	public List<ParkingPlace> findNearestPlace(Double lat, Double lon);
	//hello

}
