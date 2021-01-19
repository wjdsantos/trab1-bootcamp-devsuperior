package com.devsuperior.trab1bootcamp.resources;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.trab1bootcamp.entities.Client;

@RestController
@RequestMapping(value = "/clients")
public class ClientResources {
	
	@GetMapping
	public ResponseEntity<List<Client>> findAll() {
		List<Client> list = new ArrayList<>();
		list.add(new Client(1L, "Ana Maria", "1234567891011", 5000.00, Instant.now(), 2));
		list.add(new Client(2L, "Ana Claudia", "1234567891012", 4000.00, Instant.now(), 3));
		list.add(new Client(3L, "Maria das Dores", "1234567891013", 4500.00, Instant.now(), 2));
		list.add(new Client(4L, "Maria Joaquina", "1234567891014", 6000.00, Instant.now(), 3));
		list.add(new Client(5L, "Maria Cecilia", "1234567891015", 5000.00, Instant.now(), 1));
		list.add(new Client(6L, "Antonio Borges", "1234567891016", 5600.00, Instant.now(), 2));
		list.add(new Client(7L, "Antonio Sergio", "1234567891017", 5800.00, Instant.now(), 3));
		list.add(new Client(8L, "Carlos Alberto", "1234567891018", 4200.00, Instant.now(), 2));
		list.add(new Client(9L, "Carlos Andrade", "1234567891019", 3500.00, Instant.now(), 1));
		list.add(new Client(10L, "Antonio Carlos", "1234567891020", 6800.00, Instant.now(), 2));
		list.add(new Client(11L, "Antonio Jorge", "1234567891021", 4100.00, Instant.now(), 2));
		list.add(new Client(12L, "Daniel Correia", "1234567891022", 3200.00, Instant.now(), 1));
		list.add(new Client(13L, "Douglas Santos", "1234567891023", 6000.00, Instant.now(), 3));
		list.add(new Client(14L, "Danilo Oliveira", "1234567891024", 6200.00, Instant.now(), 2));
		list.add(new Client(15L, "Claudio Andrade", "1234567891025", 7000.00, Instant.now(), 4));
		return ResponseEntity.ok().body(list);
	}
}
