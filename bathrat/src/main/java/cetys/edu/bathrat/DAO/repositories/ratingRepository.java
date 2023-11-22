package cetys.edu.bathrat.DAO.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ratingRepository extends JpaRepository<ratingRepository, Long> {
    
}
