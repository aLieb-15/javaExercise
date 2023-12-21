package service.impl;

import service.Message;

/**
 * @author aLieb
 * @date 2023年12月21日 15:49
 */
public class Email implements Message {
    String email;

    public Email() {

    }

    @Override
    public String send(String name) {
        System.out.println("Email is sent!");
        return "success";
    }
}
