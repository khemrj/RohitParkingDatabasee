package np.edu.nast.onlineparking.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import np.edu.nast.onlineparking.entity.User;
import np.edu.nast.onlineparking.repository.UserRepository;

@RestController
@RequestMapping("/rohit")
public class UserController {
	@Autowired
	private UserRepository userRepo;
	
	//Find ALL.
		@GetMapping("/user")
		public List<User> listAllUsers(){
		return userRepo.findAll();
		}
		@GetMapping(value = "/user/k/{phone}", produces = MediaType.APPLICATION_JSON_VALUE)
		public String findUserByPhone(@PathVariable("phone") Long phone) {
		    User user = userRepo.findUserByPhone(phone);
		    if (user == null) {
		        return "null"; // Returns "null" as a JSON string
		    }
		    String output = user.getPassword() + " " + user.getUserId() + " " + user.getPassword();
		    return output;
		}
		
		// create
				@PostMapping("/user")
				public User createUser(@RequestBody User user){
					return userRepo.save(user);
		}
				
				//Read
				@GetMapping("/user/{id}")
				public Optional<User> readUser(@PathVariable("id") Long id){
					return userRepo.findById(id);
				}
				
				//Update	
				@PutMapping("/user/{id}")
				public String updateUser(@RequestBody User user, @PathVariable("id") Long id){
					
					 userRepo.update(user.getFullName(),user.getEmail(),user.getMobile(),id);
					 return "success";
					
				}
				
				//delete
				@DeleteMapping("/user/{id}")
				public void deleteUser(@PathVariable("id") Long id){
				userRepo.deleteById(id);
					
				}
		}