

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Repository extends JpaRepository<Domain, Long> {

    @Query(value = "SELECT * FROM Table", nativeQuery = true)
    List<Domain> fetchTableInformation();

}
