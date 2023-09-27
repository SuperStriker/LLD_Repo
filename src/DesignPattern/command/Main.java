package DesignPattern.command;

import human.Employee;

public class Main {
    

    public static void main(String[] args){



        TaskRunner worker = new TaskRunner();
        email email = new email();
        worker.executeEmail();

        



    }
}
