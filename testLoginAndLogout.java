package com.xzy.shrio;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;

public class testLoginAndLogout {
    public static void main(String[] args) {
/**
 *
 * 功能描述: 
 *
 * @param: 
 * @return: 
 * @auther: 
 * @date:  
 */
          Factory<SecurityManager> factory= new IniSecurityManagerFactory("classpath:shiro-first.ini");
          SecurityManager securityManager =factory.getInstance();
          SecurityUtils.setSecurityManager(securityManager);
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token=new UsernamePasswordToken("root","123")    ;
        System.out.println(subject.isAuthenticated());
        subject.login(token);
        System.out.println(subject.isAuthenticated());

    }

}
