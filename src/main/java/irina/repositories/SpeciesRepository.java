package irina.repositories;

import irina.domain.Person;
import irina.domain.Species;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:3000")
@RepositoryRestResource(collectionResourceRel = "species", path = "species")
//public interface PersonRepository extends PagingAndSortingRepository<Person, Long> {
//    List<Person> findByLastName(@Param("name") String name);
public interface SpeciesRepository extends JpaRepository<Species, Long> {

}