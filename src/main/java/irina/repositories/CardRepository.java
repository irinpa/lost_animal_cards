package irina.repositories;

import irina.domain.Card;
import irina.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:3000")
//@RepositoryRestResource(collectionResourceRel = "cards", path = "cards")
//public interface PersonRepository extends PagingAndSortingRepository<Person, Long> {
//    List<Person> findByLastName(@Param("name") String name);
    public interface CardRepository extends JpaRepository<Card, Long> {
}
