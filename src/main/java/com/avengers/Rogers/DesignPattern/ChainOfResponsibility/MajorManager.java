package com.avengers.Rogers.DesignPattern.ChainOfResponsibility;

public class MajorManager extends Manager {

    public MajorManager(String name) {
        super.name = name;
    }

    public void requestApplications(Request request) {
        if (request.getRequestType().equals("请假") && request.getNumber() <= 5) {
            System.out.println(
                    name + ": " +
                            request.getRequestType() + "  " +
                            request.getNumber() + " 被批准"
            );
        } else {
            if (superior != null) {
                superior.requestApplications(request);
            }
        }
    }

}
