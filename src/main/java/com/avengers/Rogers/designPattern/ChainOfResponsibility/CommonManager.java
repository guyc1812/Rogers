package com.avengers.Rogers.designPattern.ChainOfResponsibility;

public class CommonManager extends Manager {

    public CommonManager(String name) {
        super.name = name;
    }

    public void requestApplications(Request request) {
        if (request.getRequestType().equals("请假") && request.getNumber() <= 2) {
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
