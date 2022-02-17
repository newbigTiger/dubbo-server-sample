package com.gupaoedu.dubbo.server;

/**
 * @author 胖虎
 * @date 2022/2/4 下午 1:52
 */
public class LoginServiceImpl implements ILoginService {
    @Override
    public String login(String name, String password) {
        //写业务逻辑
        if(name.equals("admin")&&password.equals("admin")){
            return "SUCCESS";
        }
        return "ERROR";
    }
}
