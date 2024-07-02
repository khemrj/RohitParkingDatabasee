package np.edu.nast.onlineparking.controller;

import java.time.LocalDate;
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



import np.edu.nast.onlineparking.entity.ParkingPlace;
import np.edu.nast.onlineparking.entity.Role;
import np.edu.nast.onlineparking.repository.ParkingPlaceRepository;

@RestController
@RequestMapping("/rohit")
public class ParkingPlaceController {
	@Autowired
	
	private ParkingPlaceRepository placeRepo;
	
	//Find ALL.
			@GetMapping("/place")
			public List<ParkingPlace> listAllUsers(){
			return placeRepo.findAll();
			}
			@GetMapping("/nearestPlace/{lat}/{long}")
			public List<ParkingPlace> findNearestPlace(@PathVariable("lat") Double lat, @PathVariable("long")Double lon){
				return placeRepo.findNearestPlace(lat, lon);
			}
			// create
			@PostMapping("/place")
			public ParkingPlace createRole(@RequestBody ParkingPlace parkingPlace){
				return placeRepo.save(parkingPlace);
			}
			
			//Read
			@GetMapping("/place/{id}")
			public ParkingPlace findParkingPlace(@PathVariable("id") Long id){
				return placeRepo.getById(id);
			}
			
			//Update	
			@PutMapping("/place/{id}")
			public ParkingPlace updateParkingPlace(@RequestBody ParkingPlace parkingPlace, @PathVariable("id") Long id){
				
				return placeRepo.save(parkingPlace);	
	}
			
			//delete
			@DeleteMapping("/place/{id}")
			public void deleteParkingPlace(@PathVariable("id") Long id){
				placeRepo.deleteById(id);
				
			}
			
			
			

}
