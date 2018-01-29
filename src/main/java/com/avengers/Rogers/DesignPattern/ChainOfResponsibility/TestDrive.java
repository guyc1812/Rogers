package com.avengers.Rogers.DesignPattern.ChainOfResponsibility;

public class TestDrive {


    public static void main(String[] srgs) {

        GeneralManager P1 = new GeneralManager("A");
        MajorManager P2 = new MajorManager("B");
        CommonManager P3 = new CommonManager("C");

        P3.setSuperior(P2);
        P2.setSuperior(P1);

        Request request1 = new Request("请假", "小菜请假", 1);
        Request request2 = new Request("请假", "小菜请假", 4);
        Request request3 = new Request("加薪", "小菜请求加薪", 300);
        Request request4 = new Request("加薪", "小菜请求加薪", 800);

        P3.requestApplications(request1);
        P3.requestApplications(request2);
        P3.requestApplications(request3);
        P3.requestApplications(request4);

    }

}
