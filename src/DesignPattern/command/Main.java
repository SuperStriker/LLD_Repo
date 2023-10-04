package DesignPattern.command;

import java.util.ArrayList;
import java.util.List;


public class Main {
    

    public static void main(String[] args){

        List<Job> jobList = new ArrayList<>();

        TaskRunner worker = new TaskRunner();
        Email email = new Email();

        EmailJob emailJob = new EmailJob();
        LoggerJob loggerJob = new LoggerJob();
        SMSJob smsJob = new SMSJob();
        FileIOJob fileIOJob = new FileIOJob();


        Email email1 = new Email();
        emailJob.setEmail(email1);
        jobList.add(emailJob);

        logger logger1 = new logger();
        loggerJob.setLogger(logger1);
        jobList.add(loggerJob);

        sms sms1 = new sms();
        smsJob.setSms(sms1);
        jobList.add(smsJob);

        FileIO fileIO = new FileIO();
        fileIOJob.setFileIO(fileIO);
        jobList.add(fileIOJob);
        
        for(Job job : jobList) {
            worker.execute(job);
        }

        
    }
}
