package org.example.demo3.before;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2023/7/27
 * @description 请写明这个类是干嘛的
 */
public class ComputerDemo {
    public static void main(String[] args) {
        //创建组件对象
        XIJieHardDisk hardDisk=new XIJieHardDisk();
        InterCpu cpu=new InterCpu();
        KingstonMemory memory=new KingstonMemory();
        //创建计算机对象
        Computer computer=new Computer();
        //组装计算机
        computer.setCpu(cpu);
        computer.setHardDisk(hardDisk);
        computer.setKingstonMemory(memory);
        computer.run();
    }
}
