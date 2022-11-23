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
public class XiaoMing {
    public int height=140;
    //public Height(){}
    public void eat(Bread bread)
    {
        if(bread.eaten)
            return;
        height++;
        bread.eaten=true;
        System.out.println("小明吃了一片面包，现在身高为"+height+"cm");
    }
}
