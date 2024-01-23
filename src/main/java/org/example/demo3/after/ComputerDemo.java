package org.example.demo3.after;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2023/7/27
 * @description 请写明这个类是干嘛的
 */
public class ComputerDemo {
    public static void main(String[] args) {
        //创建计算机的组件对象
        HardDisk hardDisk=new XIJieHardDisk();
        Cpu cpu=new InterCpu();
        Memory memory=new KingstonMemory();
        //创建计算机对象
        Computer computer=new Computer();
        //组装计算机
        computer.setCpu(cpu);
        computer.setHardDisk(hardDisk);
        computer.setMemory(memory);
        computer.run();
    }
}
