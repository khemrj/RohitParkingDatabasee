package np.edu.nast.onlineparking.controller;

import java.time.LocalDate;
import java.util.ArrayList;
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

import np.edu.nast.onlineparking.DTO.ParkingPlaceDTO;
import np.edu.nast.onlineparking.entity.ParkingPlace;
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
			@GetMapping("/nearestPlace/{lat}/{long}/{catId}")
			public List<ParkingPlaceDTO> findNearestPlace(@PathVariable("lat") Double lat, @PathVariable("long")Double lon,@PathVariable("catId") int catid){
				List<ParkingPlaceDTO> dtos = new ArrayList<>();
				List<Object[]> results =placeRepo.findNearestPlace(lat, lon,catid);
				for (Object[] result : results) {
		            ParkingPlaceDTO dto = new ParkingPlaceDTO();
		            dto.setParkingPlaceId(((Number) result[0]).longValue());
		            dto.setPlaceName((String) result[5]);
		            dto.setOwnerName((String) result[4]);
		            dto.setAddress((String) result[1]);
		            dto.setPhoneNumber(((Number) result[6]).longValue());
		            dto.setLatitude((Double) result[2]);
		            dto.setLongitude((Double) result[3]);
		            dto.setDistance((Double) result[7]);
		            dto.setPricePerHour((int) result[8]);
		            System.out.println(dto.getDistance());
		            dtos.add(dto);
		        }
				return dtos;
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
