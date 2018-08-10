package pizzazz.repositories;

import org.springframework.data.repository.CrudRepository;

import pizzazz.models.Appointment;


public interface AppointmentRepository extends CrudRepository<Appointment, Integer>{

	
}
