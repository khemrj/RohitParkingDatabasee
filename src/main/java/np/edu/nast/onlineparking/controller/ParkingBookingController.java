package np.edu.nast.onlineparking.controller;



import java.sql.Time;
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

import np.edu.nast.onlineparking.DTO.ParkingBookingDTO;
import np.edu.nast.onlineparking.entity.ParkingBooking;
import np.edu.nast.onlineparking.entity.User;
import np.edu.nast.onlineparking.repository.ParkingBookingRepository;



@RestController
@RequestMapping("/rohit")
public class ParkingBookingController {
	@Autowired
	private ParkingBookingRepository parkingBookingRepo;
	
	//Find ALL.
		@GetMapping("/booking")
		public List<ParkingBooking> listAllUsers(){
		return parkingBookingRepo.findAll();
		}
		
		// create
		@PostMapping("/bookPlace")
		public String  createParking(@RequestBody ParkingBookingDTO p){
			Time to ;
			Time from;
			to = Time.valueOf(p.getTo());
			from = Time.valueOf(p.getFrom());
			
			parkingBookingRepo.saveValuesIntoparkingBooking(p.getAmount(),p.getDate(), from ,to, p.getCategory_id(),p.getUser_id(), p.getParkingPlaceId());
			return "successfylly savedj";
		}

		//Read
		@GetMapping("/booking/{id}")
		public ParkingBooking readParkingBooking(@PathVariable("id") Long id){
			return parkingBookingRepo.getById(id);
		}
		//Update	
		@PutMapping("/booking/{id}")
		public ParkingBooking updateParkingBooking(@RequestBody ParkingBooking parkingBooking, @PathVariable("id") Long id){
			
			return parkingBookingRepo.save(parkingBooking);	
}
		

		//delete
		@DeleteMapping("/booking/{id}")
		public void deleteParkingBooking(@PathVariable("id") Long id){
			parkingBookingRepo.deleteById(id);
			
		}
}
