
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class tService {

    @Autowired
    private Repository repository;

    public List<Domain> fetchDataFromDatabase() {
        return ehlEventRepository.();
    }
}
