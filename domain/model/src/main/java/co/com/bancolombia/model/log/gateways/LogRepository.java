package co.com.bancolombia.model.log.gateways;

import co.com.bancolombia.model.log.Log;

public interface LogRepository {
    void saveLog(Log log);
}
