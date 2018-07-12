package irina.repositories;

import java.util.List;

import irina.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(collectionResourceRel = "people", path = "people")
//public interface PersonRepository extends PagingAndSortingRepository<Person, Long> {
//    List<Person> findByLastName(@Param("name") String name);
    public interface PersonRepository extends JpaRepository<Person, Long> {
}
