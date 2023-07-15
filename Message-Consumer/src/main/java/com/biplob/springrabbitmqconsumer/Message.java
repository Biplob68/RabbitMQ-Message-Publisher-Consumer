package com.biplob.springrabbitmqconsumer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Message {

    private String messageId;
    private String message;
    private Date dateOfMessage;

}
