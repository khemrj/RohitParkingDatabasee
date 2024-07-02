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

import np.edu.nast.onlineparking.entity.Role;
import np.edu.nast.onlineparking.repository.RoleRepository;

@RestController
@RequestMapping("/rohit")
public class RoleController {

	@Autowired
	private RoleRepository roleRepo;
	
//findALL
	@GetMapping("/role")
	public List<Role> listAllRoles(){
		return roleRepo.findAll();
	}

// create
	@PostMapping("/role")
	public Role createRole(@RequestBody Role role){
		return roleRepo.save(role);
	}
	
//Read
	@GetMapping("/role/{id}")
	public Role findRole(@PathVariable("id") Long id){
		return roleRepo.getById(id);
	}
	
//Update	
	@PutMapping("/role/{id}")
	public Role updateRole(@RequestBody Role role, @PathVariable("id") Long id){
		if(role!=null) {
			return roleRepo.save(role);
		}
		return null;
	}
	
//delete
	@DeleteMapping("/role/{id}")
	public void deleteRole(@PathVariable("id") Long id){
		roleRepo.deleteById(id);
		
	}
}
