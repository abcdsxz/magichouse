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
public class MagicHouse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       System.out.println("小张和小芳来到魔法屋。");
       System.out.println("欢迎光临魔法屋！注册 VIP 会员才能享受超值服务，免费注册！即刻成为 VIP 会员！");
       System.out.println("老板：“同学，现在注册会员免费喔。。。走过路过，不要错过。。。”");
       System.out.println("小芳：这不是霸王条款吗？");
       System.out.println("小张：为了圆梦，忍忍吧！反正咱们又不花钱！");
       System.out.println("********************************************");
       XiaoZhang XiaoZhang = new XiaoZhang();
       XiaoFang XiaoFang = new XiaoFang();
       System.out.println("小张现在身高为"+XiaoZhang.height+"厘米");
       System.out.println("小芳现在身高为"+XiaoFang.height+"厘米");
       XiaoFang.getVIP();
       XiaoFang.useMagicMachine();
       XiaoZhang.getVIP();
       XiaoZhang.useMagicMachine();
       System.out.println("使用魔法机器后小张身高为"+XiaoZhang.height+"厘米");
       System.out.println("使用魔法机器后小芳身高为"+XiaoFang.height+"厘米");
    }
    
}
