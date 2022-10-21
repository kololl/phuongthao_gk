package com.example.DinhThiPhuongThao.producer;


import com.example.DinhThiPhuongThao.entity.Subject;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.jms.Topic;

@RestController
@RequestMapping("/producer")
public class Producer {

    @Autowired
    private JmsTemplate jmsTemplate;

    @Autowired
    private Topic topic;


    @PostMapping("/message")
    public Subject sendMessage(@RequestBody Subject subject) {

        try {
            ObjectMapper mapper = new ObjectMapper();
            String subjectAsJson = mapper.writeValueAsString(subject);
            jmsTemplate.convertAndSend(topic, subjectAsJson);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return subject;
    }
}
