package pizzazz.service;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import pizzazz.models.Customer;
import pizzazz.models.Salon;
import pizzazz.repositories.CustomerRepository;
import pizzazz.repositories.SalonRepository;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class SalonService {
	

	@Autowired
	SalonRepository repository;
	
	@DeleteMapping("/api/{salonId}/salon")
	public void deleteUser(@PathVariable("salonId") int id) {
		repository.deleteById(id);
	}

	@PostMapping("/api/salon")
	public Salon createSalon(@RequestBody Salon salon) {
		Salon salonNew = repository.save(salon);
		return salonNew;
	}


	@GetMapping("/api/{salonId}/salon")
	public Salon findSalonById(@PathVariable("salonId") int salonId) {
		Optional<Salon> data = repository.findById(salonId);
		if (data.isPresent()) {
			return data.get();
		}
		return null;
	}
	
	@GetMapping("/api/salon")
	public List<Salon> findAllSalons() {
		return (List<Salon>) repository.findAll();
	}
	
	
	@PutMapping("/api/{salonId}/salon")
	public Salon updateSalon(@PathVariable("salonId") int salonId, @RequestBody Salon newSalon) {
		Optional<Salon> data = repository.findById(salonId);
		if (data.isPresent()) {
			Salon user = data.get();
			repository.save(user);
			return user;
		}
		return null;
	}

	@GetMapping("/api/username/{userName}")
	public Iterable<Customer> findUserByUsername(@PathVariable("userName") String username) {
		return repository.findCustomerByUsername(username);
	}


	@GetMapping("/api/{keyWord}/salon")
	public Salon findSalonByKeyWord(@PathVariable ("keyWord") String salonId) {
		List<Salon> data = (List<Salon>) repository.findAll();
		List<>
		if (data.isPresent()) {
			return data.get();
		}
		return null;
	}

}
