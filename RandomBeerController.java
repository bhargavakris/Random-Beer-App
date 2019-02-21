package com.DistilledSCH.Random_Beer_App.Controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DistilledSCH.Random_Beer_App.Model.RandomBeer;
import com.DistilledSCH.Random_Beer_App.Service.RandomBeerRepo;

@RestController
@RequestMapping(value="/RandomBeer")
public class RandomBeerController {
	
	@Autowired
	RandomBeerRepo repo;
	
	@PostMapping("/beer")
	public void createBeer(@Valid @RequestBody RandomBeer beer) {
		repo.save(beer);
	}
	
	@GetMapping("/beers")
	public  List<RandomBeer> ShowBeers() {
		return repo.findAll();
	}
	
	@GetMapping("/beer/{id}")
	public  Optional<RandomBeer> ShowBeersById(@PathVariable int id ) {
		return repo.findById(id);
	}
	/*@PutMapping("/beer/{id}")
	public void updateBeer(@PathVariable int id,@Valid @RequestBody RandomBeer beer) {
		Optional<RandomBeer> beer_details=repo.findById(id);
		repo.save(beer);
		
	}*/
	@DeleteMapping("/beer/{id}")
	public void deleteUsre(@PathVariable int id) {
		  repo.deleteById(id);
	}
	
}
