package pizzazz.repositories;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.data.repository.CrudRepository;

import com.fasterxml.jackson.annotation.JsonIgnore;

import pizzazz.models.Invitation;
import pizzazz.models.Review;


public interface InvitationRepository extends CrudRepository<Invitation, Integer>{


}
