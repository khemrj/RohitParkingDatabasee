package np.edu.nast.onlineparking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import np.edu.nast.onlineparking.entity.ParkingPrice;

@Repository
public interface ParkingPriceRepository extends JpaRepository <ParkingPrice,Long>{
	@Modifying
	@Transactional
	@Query(value = "insert into tbl_parking_price(price_per_hrs,parking_place_id,category_id) values (?3,?2,?1)", nativeQuery = true)
   void saveParkingPrice(Long catid, Long placeid, int price);

}
