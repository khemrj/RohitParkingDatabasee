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

import np.edu.nast.onlineparking.entity.Category;
import np.edu.nast.onlineparking.repository.CategoryRepository;

@RestController
@RequestMapping("/rohit")

public class CategoryController {
	@Autowired
	private CategoryRepository cateRepo;
	
	//Find ALL.
	@GetMapping("/category")
	public List<Category> listAllCategories(){
	return cateRepo.findAll();
	}
	// create
		@PostMapping("/category")
		public Category createCategory(@RequestBody Category category){
			
			return cateRepo.save(category);
		}
		//Read
		@GetMapping("/category/{id}")
		public Category findCategory(@PathVariable("id") Long id){
			return cateRepo.getById(id);
		}
		
		
		//Update	
			@PutMapping("/category/{id}")
			public Category updateCategory(@RequestBody Category category, @PathVariable("id") Long id){
				
				return cateRepo.save(category);
			}
			
			//delete
			@DeleteMapping("/category/{id}")
			public void deleteCategory(@PathVariable("id") Long id){
			cateRepo.deleteById(id);
				
			}
		}
