/**
 * Author:   shitian
 * Date:     2018/7/4 16:10
 * Description:
 */
package com.rocky.design.proxy;

import com.rocky.design.proxy.impl.GamePlayer;
import com.rocky.design.proxy.impl.GamePlayerIH;
import com.rocky.design.proxy.impl.GamePlayerProxy;

/**
 * 〈〉
 *
 * @author shitian
 * @create 2018/7/4
 * @since 1.0.0
 */
public class GameClient {

    public static void main(String[] args){
        DynamicProxy();
    }

    private static void normalProxy(){
        //通过入参，由代理类创建真正的委托类，实现将委托类对外屏蔽
        IGamePlayer playerProxy = new GamePlayerProxy("zhangsan");
        playerProxy.login();
        playerProxy.killBoss();
        playerProxy.upgrade();
    }

    private static void DynamicProxy(){
        IGamePlayer gamePlayer = new GamePlayer("shitian");
        GamePlayerIH handle = new GamePlayerIH(gamePlayer);
        IGamePlayer proxy = handle.getProxyInstance();
        proxy.login();
        proxy.killBoss();
        proxy.upgrade();
    }
}
