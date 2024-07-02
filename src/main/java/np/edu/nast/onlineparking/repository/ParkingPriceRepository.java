package np.edu.nast.onlineparking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import np.edu.nast.onlineparking.entity.ParkingPrice;

@Repository
public interface ParkingPriceRepository extends JpaRepository <ParkingPrice,Long>{

}
