package np.edu.nast.onlineparking.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import np.edu.nast.onlineparking.DTO.ParkingPlaceDTO;
import np.edu.nast.onlineparking.entity.ParkingPlace;

@Repository
public interface ParkingPlaceRepository extends JpaRepository<ParkingPlace,Long>{
	@Query(value = "SELECT tbl_parking_place.*, \r\n"
			+ "       (6371 * acos(\r\n"
			+ "           cos(radians(?1)) * cos(radians(latitude)) *\r\n"
			+ "           cos(radians(longitude) - radians(?2)) + \r\n"
			+ "           sin(radians(?1)) * sin(radians(latitude))\r\n"
			+ "       )) AS distance,price_per_hrs\r\n"
			+ "FROM tbl_parking_place\r\n"
			+ "INNER JOIN tbl_parking_price ON tbl_parking_place.parking_place_id = tbl_parking_price.parking_place_id\r\n"
			+ "WHERE category_id = ?3\r\n"
			+ "ORDER BY distance ASC",nativeQuery = true)
	public List<Object[]> findNearestPlace(Double lat, Double lon,int catId);

}
