package elzin.template.springboot.being.api;

import elzin.template.springboot.being.model.Being;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "beings", path = "sanctuary-mongo")
public interface SanctuaryMongo extends MongoRepository<Being, String> {

    List<Being> findByName(@Param("name") String name);
}
