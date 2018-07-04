/**
 * Author:   shitian
 * Date:     2018/7/4 16:30
 * Description:
 */
package com.rocky.design.proxy.impl;

import com.rocky.design.proxy.IGamePlayer;
import com.rocky.design.proxy.IProxy;

/**
 * 〈〉
 *
 * @author shitian
 * @create 2018/7/4
 * @since 1.0.0
 */
public class GamePlayerProxy implements IGamePlayer,IProxy {
    private IGamePlayer gamePlayer = null;

    //通过入参，由代理类创建真正的委托类，实现将委托类对外屏蔽
    public GamePlayerProxy(String name){
        gamePlayer = new GamePlayer("zhangsan");
    }

    public GamePlayerProxy(IGamePlayer gamePlayer){
        this.gamePlayer = gamePlayer;
    }

    @Override
    public void login() {
        System.out.println("代练使用玩家账号登录....");
        gamePlayer.login();
    }

    @Override
    public void killBoss() {
        System.out.println("代练开始替玩家打怪....");
        gamePlayer.killBoss();
    }

    @Override
    public void upgrade() {
        System.out.println("代练替玩家升级....");
        gamePlayer.upgrade();
        count();
    }

    @Override
    public void count() {
        System.out.println("升级费用为150....");
    }
}
