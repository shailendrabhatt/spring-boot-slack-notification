

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class Scheduler {

    @Autowired
    private SlackClient slackClient;

    @Autowired
    private Service service;

    @Value("${slack.alert.channel}")
    private String targetSlackChannelName;

    @Value("${slack.username}")
    private String userName;

    @Scheduled(cron = "${dailyTriggerCron}")
    protected void triggerDailyEventOccuranceScheduler() {
        List<BusinessEvent> eventDetails = service.fetchDataFromDatabase();
        String message = String.format("Message to the channel"));
        slackClient.sendMessage(targetSlackChannelName, userName, message);
    }
}