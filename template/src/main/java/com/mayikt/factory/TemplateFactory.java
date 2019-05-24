package com.mayikt.factory;

import com.mayikt.template.AbstractPayCallbackTemplate;
import com.mayikt.utils.SpringUtils;

public class TemplateFactory {

    public static AbstractPayCallbackTemplate getPayCallbackTemplate(String templateId) {
        AbstractPayCallbackTemplate payCallbackTemplate = (AbstractPayCallbackTemplate) SpringUtils.getBean(templateId);
        return payCallbackTemplate;
    }
}
