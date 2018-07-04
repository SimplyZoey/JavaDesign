/**
 * Author:   shitian
 * Date:     2018/7/4 16:49
 * Description:
 */
package com.rocky.design.proxy.impl;

import com.rocky.design.proxy.IGamePlayer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 〈〉
 *
 * @author shitian
 * @create 2018/7/4
 * @since 1.0.0
 */
public class GamePlayerIH implements InvocationHandler {
    private IGamePlayer gamePlayer;

    public GamePlayerIH(IGamePlayer gamePlayer){
        this.gamePlayer = gamePlayer;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("使用动态代理...");
        return method.invoke(gamePlayer,args);
    }

    public IGamePlayer getProxyInstance() {
        IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(this.getClass().getClassLoader(),gamePlayer.getClass().getInterfaces(),this);
        return proxy;
    }

}
