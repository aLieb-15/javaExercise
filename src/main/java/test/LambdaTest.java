package test;

import service.Message;
import service.impl.Email;
import service.impl.Sms;

/**
 * @author aLieb
 * @date 2023年12月21日 15:30
 */
public class LambdaTest {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        Message email = new Email();
//        Message sms = new Sms();
//        sendMessage(email);
//        sendMessage(sms);

        // 函数式接口只允许有一个抽象方法
        sendMessage((name) -> {
            System.out.println("Email is sent to " + name + "!");
            return "success";
        });

        Message lambda = (name) -> {
            System.out.println("hhh");
            return "success";
        };
        sendMessage(lambda);
    }

    public static void sendMessage(Message message) {
        message.send("aLieb");
    }
}
