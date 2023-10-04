package DesignPattern.command;

public class LoggerJob implements Job {

    private logger logger;

    public void setLogger(logger logger) {
        this.logger = logger;
    }

    @Override
    public void run() {
        if(logger != null) {
           logger.log();
        }
    }
}
