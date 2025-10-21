package Utilities;


import io.cucumber.plugin.ConcurrentEventListener;
import io.cucumber.plugin.event.EventPublisher;
import io.cucumber.plugin.event.PickleStepTestStep;
import io.cucumber.plugin.event.TestStepFinished;
import io.cucumber.plugin.event.TestStepStarted;
import org.apache.logging.log4j.Logger;

public class CucumberLoggingListener implements ConcurrentEventListener {

    public static final Logger log = LoggerHelper.getLogger(CucumberLoggingListener.class);

    public CucumberLoggingListener() {
        log.info("CucumberLoggingListener initialized...");
    }

    @Override
    public void setEventPublisher(EventPublisher publisher) {
        publisher.registerHandlerFor(TestStepStarted.class, this::handleStepStarted);
        publisher.registerHandlerFor(TestStepFinished.class, this::handleStepFinished);
    }

    private void handleStepStarted(TestStepStarted event) {
        if (event.getTestStep() instanceof PickleStepTestStep) {
            PickleStepTestStep step = (PickleStepTestStep) event.getTestStep();
            log.info("   Step Started: {}{}", step.getStep().getKeyword(), step.getStep().getText());
        }
    }

    private void handleStepFinished(TestStepFinished event) {
        if (event.getTestStep() instanceof PickleStepTestStep) {
            PickleStepTestStep step = (PickleStepTestStep) event.getTestStep();
            log.info(" Step Finished: {}{} | Status: {}", step.getStep().getKeyword(), step.getStep().getText(), event.getResult().getStatus());
        }
    }
}
