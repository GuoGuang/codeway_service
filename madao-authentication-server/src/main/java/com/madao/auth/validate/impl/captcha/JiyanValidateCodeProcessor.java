package com.madao.auth.validate.impl.captcha;

import com.madao.auth.validate.AbstractValidateCodeProcessor;
import com.madao.utils.LogBack;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.ServletWebRequest;

/**
 * 极验验证码
 */
@Component
public class JiyanValidateCodeProcessor extends AbstractValidateCodeProcessor<Captcha> {

    @Override
    protected void send(ServletWebRequest request, Captcha validateCode) {
        // non send
    }

    @Override
    public void validate(ServletWebRequest request, String bodyString) {
        LogBack.info("极验验证");
    }
}
