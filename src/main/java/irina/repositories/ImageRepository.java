package irina.repositories;

import irina.domain.Picture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Picture, Long> {
}
