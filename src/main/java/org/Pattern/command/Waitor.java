package org.Pattern.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2024/1/19
 * @description 服务员类（请求者角色）
 */
public class Waitor {
    //持有多个命令对象
    private List<Command> commands=new ArrayList<>();

    public void setCommand(Command cmd) {
        //将cmd对象存储到list集合中
        commands.add(cmd);
    }
    //发起命令功能 喊订单来了。
    public void Orderup(){
        System.out.println("美女服务员:订单来了");
        for (Command command:commands){
            if (command!=null){
                command.execute();
            }
        }
    }
}
