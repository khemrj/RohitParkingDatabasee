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

import np.edu.nast.onlineparking.DTO.ParkingPriceDTO;
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
	
// to make it save multiple row of prices
	@PostMapping("parkingPricesave")
    public List<ParkingPrice> saveallPrices(@RequestBody List<ParkingPriceDTO> parkingPriceDTO) {
		System.out.println(parkingPriceDTO.toString());
		for( int i = 0; i<parkingPriceDTO.size();i++) {
			System.out.println("hello");
			System.out.println(parkingPriceDTO.get(i).getCategoryId());
			 parkingPriceRepo.saveParkingPrice(parkingPriceDTO.get(i).getCategoryId(),parkingPriceDTO.get(i).getParkingPlaceId(),parkingPriceDTO.get(i).getPricePerHrs());
			
		}
		 return parkingPriceRepo.findAll();
        
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
