package com.example.DinhThiPhuongThao.listener;

import com.example.DinhThiPhuongThao.entity.Subject;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.jms.Message;
import javax.jms.Topic;

@RestController
@RequestMapping("/consume")
public class Consume {

    @Autowired
    private JmsTemplate jmsTemplate;

    @Autowired
    private Topic topic;

    @GetMapping("/message")
    public Subject consumeMessage() {

        Subject subject = null;
        String jsonMessage = null;
        try {
            ObjectMapper mapper = new ObjectMapper();
            Message message = jmsTemplate.receive(topic);
//            jsonMessage = message.;
            subject = mapper.readValue(jsonMessage, Subject.class);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return subject;
    }
}
