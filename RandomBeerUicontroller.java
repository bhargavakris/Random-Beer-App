package com.DistilledSCH.Random_Beer_App.Controller;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import com.DistilledSCH.Random_Beer_App.Service.RandomBeerRepo;

@Controller
public class RandomBeerUicontroller {
	@Autowired
	RandomBeerRepo repo;
	
	@GetMapping("/")
	public  String showBeer(ModelMap model) {
		List<Integer> ids=repo.findids();
		Random rnum= new Random();
		int index=rnum.nextInt(ids.size());
		int id=ids.get(index);
		model.put("beer_by_id",repo.findById(id).get() );
		return "Beer";
	}
	
}