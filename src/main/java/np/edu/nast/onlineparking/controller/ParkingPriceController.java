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
import np.edu.nast.onlineparking.entity.ParkingPrice;
import np.edu.nast.onlineparking.repository.ParkingPriceRepository;

@RestController
@RequestMapping("/rohit")
public class ParkingPriceController {
	@Autowired
	
	private ParkingPriceRepository parkingPriceRepo;

	//Find ALL.
	@GetMapping("/parkingprice")
	public List<ParkingPrice> listAllUsers(){
	return parkingPriceRepo.findAll();
	}
	
	// create
				@PostMapping("/parkingprice")
				public ParkingPrice createParkingPrice(@RequestBody ParkingPrice parkingPrice){
					return parkingPriceRepo.save(parkingPrice);
		}
				
				//Read
				@GetMapping("/parkingprice/{id}")
				public ParkingPrice readParkingPrice(@PathVariable("id") Long id){
					return parkingPriceRepo.getById(id);
				}
				//Update	
				@PutMapping("/parkingprice/{id}")
				public ParkingPrice updateParkingPrice(@RequestBody ParkingPrice parkingPrice, @PathVariable("id") Long id){
					
					return parkingPriceRepo.save(parkingPrice);	
        }
				
				//delete
				@DeleteMapping("/parkingprice/{id}")
				public void deleteParkingPrice(@PathVariable("id") Long id){
				parkingPriceRepo.deleteById(id);
					
				}
}
