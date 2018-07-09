/**
 * Author:   shitian
 * Date:     2018/7/9 9:00
 * Description:
 */
package com.rocky.design.decorate;

import com.rocky.design.decorate.impl.FouthGradeSchoolReport;
import com.rocky.design.decorate.impl.HighScoreDecorator;
import com.rocky.design.decorate.impl.SortDecorator;

/**
 * 〈装饰模式〉
 * 优点：
 * 1.具体的业务类与装饰类互相独立，可以独立发展
 * 2.可以替代继承
 * 3.动态的扩展一个类的功能（特殊的代理模式）
 *
 * 缺点：
 * 1.如果装饰类很多，会导致业务很复杂，不便于发现问题
 *
 * @author shitian
 * @create 2018/7/9
 * @since 1.0.0
 */
public class Father {

    public static void main(String[] args) {
        //把成绩单拿过来
        SchoolReport sr = new FouthGradeSchoolReport();
        //先装饰上最高成绩
        sr = new HighScoreDecorator(sr);
        //再次装饰上排名
        sr = new SortDecorator(sr);

        //看成绩单
        sr.report();
        //签名？休想！
        sr.sign("老三");
    }
}
