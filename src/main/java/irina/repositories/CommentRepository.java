package irina.repositories;

import java.util.List;

import irina.domain.Comment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = "comments", path = "comments")
//public interface PersonRepository extends PagingAndSortingRepository<Person, Long> {
//    List<Person> findByLastName(@Param("name") String name);
public interface CommentRepository extends JpaRepository<Comment, Long> {
    Page<Comment> findByCardId(Long cardId, Pageable pageable);
}
