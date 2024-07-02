package np.edu.nast.onlineparking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import np.edu.nast.onlineparking.entity.ParkingCapacity;
import np.edu.nast.onlineparking.repository.ParkingCapacityRepository;

@RestController
@RequestMapping("/rohit")
public class ParkingCapacityController {
	@Autowired
	
	private ParkingCapacityRepository parkingCapRepo;
	

	//Find ALL.
			@GetMapping("/parkingcapacity")
			public List<ParkingCapacity> listAllUsers(){
			return parkingCapRepo.findAll();
			}
			

			// create
			@PostMapping("/parkingcapacity")
			public ParkingCapacity createParkingCapacity(@RequestBody ParkingCapacity parkingCap){
				return parkingCapRepo.save(parkingCap);
	}
			//Read
			@GetMapping("/parkingcapacity/{id}")
			public ParkingCapacity readParkingCapacity(@PathVariable("id") Long id){
				return parkingCapRepo.getById(id);
			}
			
			//Update	
			@PutMapping("/parkingcapacity/{id}")
			public ParkingCapacity updateParkingCapacity(@RequestBody ParkingCapacity parkingCap, @PathVariable("id") Long id){
				
				return parkingCapRepo.save(parkingCap);

		}
			//delete
			@DeleteMapping("/parkingcapaciy/{id}")
			public void deleteParkingCapacity(@PathVariable("id") Long id){
			parkingCapRepo.deleteById(id);
				
			}
}
