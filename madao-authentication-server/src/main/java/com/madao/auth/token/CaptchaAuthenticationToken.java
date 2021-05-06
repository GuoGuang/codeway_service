package com.madao.auth.token;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;


/**
 * 图片登录验证信息封装类
 **/
public class CaptchaAuthenticationToken extends UsernamePasswordAuthenticationToken {


    //未认证Authentication构造方法
    public CaptchaAuthenticationToken(Object principal, Object credentials) {
        super(principal, credentials);
        setAuthenticated(false);
    }

    //已认证Authentication构造方法
    public CaptchaAuthenticationToken(Object principal, Collection<? extends GrantedAuthority> authorities) {
        super(principal, "", authorities);
    }


}

