package com.qianfeng.struts2hello.action;

import com.opensymphony.xwork2.ActionSupport;
import com.qianfeng.struts2hello.model.MessageStore;

public class HelloWorldAction extends ActionSupport{

    private MessageStore messageStore;

    public String execute() {
        messageStore = new MessageStore() ;

        return SUCCESS;
    }

    public MessageStore getMessageStore() {
        return messageStore;
    }
}
