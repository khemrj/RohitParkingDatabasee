package np.edu.nast.onlineparking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import np.edu.nast.onlineparking.entity.ParkingCapacity;
@Repository
public interface ParkingCapacityRepository extends JpaRepository <ParkingCapacity,Long> {

}
