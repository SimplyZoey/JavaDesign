/**
 * Author:   shitian
 * Date:     2018/7/4 15:54
 * Description:
 */
package com.rocky.design.proxy.impl;

import com.rocky.design.proxy.IGamePlayer;

/**
 * 〈〉
 *
 * @author shitian
 * @create 2018/7/4
 * @since 1.0.0
 */
public class GamePlayer implements IGamePlayer {
    private String name;

    public GamePlayer(String name){
        this.name = name;
    }

    @Override
    public void login() {
        System.out.println(this.name + "登录成功!!!!!!");
    }

    @Override
    public void killBoss() {
        System.out.println(this.name + "正在打怪!!!!!!");
    }

    @Override
    public void upgrade() {
        System.out.println(this.name + "又升级了!!!!!!");
    }
}
