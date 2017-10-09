package pl.nightlife.persistence.repository;

import org.springframework.data.repository.CrudRepository;
import pl.nightlife.persistence.entity.impl.Place;

public interface PlaceRepository extends CrudRepository<Place, Long>
{
    Place readByEmail(String email);
}
