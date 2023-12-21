package service.impl;

import service.Message;

/**
 * @author aLieb
 * @date 2023年12月21日 15:54
 */
public class Sms implements Message {
    String phoneNumber;

    public Sms() {

    }

    @Override
    public String send(String name) {
        System.out.println("SMS is sent!");
        return "success";
    }
}
