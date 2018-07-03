/**
 * Author:   shitian
 * Date:     2018/7/3 11:50
 * Description:
 */
package com.rocky.design.single;

/**
 * 〈〉
 *
 * @author shitian
 * @create 2018/7/3
 * @since 1.0.0
 */
public enum  EnumSingleton {
    INSTANCE;

    private DBConnection connection = null;

    EnumSingleton(){
        connection = new DBConnection();
    }

    public DBConnection getConnection() {
        return connection;
    }

    public static void main(String[] args){
        DBConnection conn1 = EnumSingleton.INSTANCE.getConnection();
        DBConnection conn2 = EnumSingleton.INSTANCE.getConnection();
        System.out.println(conn1);
        System.out.println(conn2);
    }
}
