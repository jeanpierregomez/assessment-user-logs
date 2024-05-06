package co.com.bancolombia.usecase.log;

import co.com.bancolombia.model.log.Log;
import co.com.bancolombia.model.log.gateways.LogRepository;
import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor
public class LogUseCase {
    private final LogRepository logRepository;

    public void saveLog(Log log) {
        logRepository.saveLog(log);
    }

}
