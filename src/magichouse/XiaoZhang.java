/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magichouse;

/**
 *
 * @author 咕噜
 */
public class XiaoZhang implements MagicHouseVIP{
    public int height = 145;
    public String gender = new String("boy");
    boolean isVIP = false;
    public void getVIP(){
        isVIP = true;
    }
    public void useMagicMachine(){
        if(gender.equals("boy"))
            height = height+40;
    }
}
