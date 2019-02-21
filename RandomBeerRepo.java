package com.DistilledSCH.Random_Beer_App.Service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.DistilledSCH.Random_Beer_App.Model.RandomBeer;


public interface RandomBeerRepo extends JpaRepository<RandomBeer,Integer>{
	
	@Query(value="Select id from random_beer",nativeQuery = true)
	List<Integer> findids();

}
