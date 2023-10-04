package DesignPattern.command;

public class TaskRunner {
    
    public void executeEmail(Email em){
        em.sendEmail();
    }
    // public void executeSms(sms s1){
    //     s1.sendsms();
    // }
    // public void executeFileIO(FileIO fio){
    //     fio.openfile();
    // }
    // public void executeLog(){

    // }

    public void execute(Job job){
        job.run();

    }
}
