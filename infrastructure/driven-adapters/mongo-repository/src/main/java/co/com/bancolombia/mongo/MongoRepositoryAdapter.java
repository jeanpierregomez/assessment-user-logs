package co.com.bancolombia.mongo;

import co.com.bancolombia.model.log.Log;
import co.com.bancolombia.model.log.gateways.LogRepository;
import co.com.bancolombia.mongo.helper.AdapterOperations;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Repository;

@Repository
public class MongoRepositoryAdapter extends AdapterOperations<Log, LogEntity, String, MongoDBRepository>
implements LogRepository {

    public MongoRepositoryAdapter(MongoDBRepository repository, ObjectMapper mapper) {
        /**
         *  Could be use mapper.mapBuilder if your domain model implement builder pattern
         *  super(repository, mapper, d -> mapper.mapBuilder(d,ObjectModel.ObjectModelBuilder.class).build());
         *  Or using mapper.map with the class of the object model
         */
        super(repository, mapper, d -> mapper.map(d, Log.class/* change for domain model */));
    }

    @Override
    public void saveLog(Log log) {
        this.save(log);
    }
}
