package co.com.bancolombia.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface MongoDBRepository extends MongoRepository<LogEntity, String> , QueryByExampleExecutor<LogEntity> {
}
