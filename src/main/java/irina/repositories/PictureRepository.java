package irina.repositories;

import irina.domain.Picture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:3000")
public interface PictureRepository extends JpaRepository<Picture, Long> {
}
