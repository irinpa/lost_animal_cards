package irina.repositories;

import irina.domain.Breed;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "breeds", path = "breeds")
//public interface PersonRepository extends PagingAndSortingRepository<Person, Long> {
//    List<Person> findByLastName(@Param("name") String name);
public interface BreedRepository extends JpaRepository<Breed, Long> {
}
