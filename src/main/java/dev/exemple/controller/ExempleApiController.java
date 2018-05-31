package dev.exemple.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.exemple.entite.Exemple;
import dev.exemple.repository.ExempleRepository;

@RestController
@RequestMapping("/exemples")
public class ExempleApiController {

	@Autowired
	private ExempleRepository exempleRepo;

	@GetMapping
	public List<Exemple> listerexemples() {
		Exemple exemple1 = new Exemple();
		exemple1.setChamp1("aaa");
		exemple1.setChamp2("bbb");
		Exemple exemple2 = new Exemple();
		exemple2.setChamp1("ccc");
		exemple2.setChamp2("ddd");
		this.exempleRepo.save(exemple1);
		this.exempleRepo.save(exemple2);

		return this.exempleRepo.findAll();
	}

}
