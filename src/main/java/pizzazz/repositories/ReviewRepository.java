package pizzazz.repositories;

import org.springframework.data.repository.CrudRepository;

import pizzazz.models.Review;


public interface ReviewRepository extends CrudRepository<Review, Integer>{
	

}
