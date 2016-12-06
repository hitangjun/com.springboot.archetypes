package ${package}.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class ScheduleTask {
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
    @Scheduled(fixedRate = 60000)
    public void reportCurrentTime() {
        System.out.println("定时任务--现在时间：" + dateFormat.format(new Date()));
    }
}
