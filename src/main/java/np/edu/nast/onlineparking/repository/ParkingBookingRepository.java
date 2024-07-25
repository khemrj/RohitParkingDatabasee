package np.edu.nast.onlineparking.repository;



import java.sql.Time;
import java.time.LocalDate;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import jakarta.transaction.Transactional;
import np.edu.nast.onlineparking.entity.ParkingBooking;


@Repository
public interface ParkingBookingRepository extends JpaRepository <ParkingBooking,Long>  {
	@Transactional
	@Modifying
	@Query(value = "insert into tbl_parking_booking(amount, date,time_from,time_to,category_id,user_id,parking_place_id) values (?1,?2,?3,?4,?5,?6,?7)",nativeQuery = true)
	public void saveValuesIntoparkingBooking(int amount,LocalDate date,Time to, Time from,int catid, Long uid, Long parkingPlaceId);

	

	

}
