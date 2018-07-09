/**
 * Author:   shitian
 * Date:     2018/7/9 16:46
 * Description:
 */
package com.rocky.design.facade;

/**
 * 〈〉
 *
 * @author shitian
 * @create 2018/7/9
 * @since 1.0.0
 */
public class Police {

    //检查信件，检查完毕后警察在信封上盖个戳：此信无病毒
    public void checkLetter(ILetterProcess letterProcess){
        System.out.println(letterProcess+" 信件已经检查过了...");
    }


}
