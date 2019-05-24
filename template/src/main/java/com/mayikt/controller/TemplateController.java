package com.mayikt.controller;

import com.mayikt.factory.TemplateFactory;
import com.mayikt.template.AbstractPayCallbackTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TemplateController {

    @RequestMapping("/asyncCallBack")
    public String asyncCallBack(String templateId) {
        AbstractPayCallbackTemplate payCallbackTemplate = TemplateFactory.getPayCallbackTemplate(templateId);
        return payCallbackTemplate.asyncCallBack();
    }
}
