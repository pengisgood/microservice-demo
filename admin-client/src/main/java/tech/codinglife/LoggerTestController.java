package tech.codinglife;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.helpers.MessageFormatter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Author: maxpeng
 * Date: 2019/12/2
 * Time: 11:08 AM
 */
@Slf4j
@RestController
public class LoggerTestController {

    private static final String LOG_TEMPLATE = "Log level: {}";

    @GetMapping("test")
    public String test() {
        if (log.isDebugEnabled()) {
            String msg = MessageFormatter.format(LOG_TEMPLATE, "debug").getMessage();
            log.debug(msg);
            return msg;
        } else if (log.isInfoEnabled()) {
            String msg = MessageFormatter.format(LOG_TEMPLATE, "info").getMessage();
            log.info(msg);
            return msg;
        } else if (log.isWarnEnabled()) {
            String msg = MessageFormatter.format(LOG_TEMPLATE, "warn").getMessage();
            log.warn(msg);
            return msg;
        }
        return "unknown log level";
    }
}
