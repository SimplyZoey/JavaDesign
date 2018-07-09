/**
 * Author:   shitian
 * Date:     2018/7/9 16:42
 * Description:
 */
package com.rocky.design.facade;

import com.rocky.design.facade.impl.LetterProcessImpl;

/**
 * 〈〉
 *
 * @author shitian
 * @create 2018/7/9
 * @since 1.0.0
 */
public class ModenPostOffice {
    private ILetterProcess letterProcess = new LetterProcessImpl();
    private Police police = new Police();


    //写信，封装，投递，一体化
    public void sendLetter(String context,String address){
        //帮你写信
        letterProcess.writeContext(context);
        //写好信封
        letterProcess.fillEnvelope(address);
        //警察检查
        police.checkLetter(letterProcess);
        //把信放到信封中
        letterProcess.letterInotoEnvelope();
        //邮递信件
        letterProcess.sendLetter();
    }
}
