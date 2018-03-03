package com.avengers.Rogers.designPattern.ChainOfResponsibility;

public class GeneralManager extends Manager {

    public GeneralManager(String name) {
        super.name = name;
    }

    public void requestApplications(Request request) {
        if (request.getRequestType().equals("请假")) {
            System.out.println(
                    name + ": " +
                            request.getRequestType() + "  " +
                            request.getNumber() + " 被批准"
            );
        } else if (request.getRequestType().equals("加薪") && request.getNumber() <= 500) {
            System.out.println(
                    name + ": " +
                            request.getRequestType() + "  " +
                            request.getNumber() + " 被批准"
            );
        } else if (request.getRequestType().equals("加薪") && request.getNumber() > 500) {
            System.out.println(
                    name + ": " +
                            request.getRequestType() + "  " +
                            request.getNumber() + " 再说吧"
            );
        }
    }
}
