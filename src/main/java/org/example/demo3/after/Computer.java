package org.example.demo3.after;

import org.example.demo3.before.InterCpu;
import org.example.demo3.before.KingstonMemory;
import org.example.demo3.before.XIJieHardDisk;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2023/7/27
 * @description 电脑
 */
public class Computer {
    private HardDisk hardDisk;
    private Cpu cpu;
    private Memory  Memory;

    public HardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public org.example.demo3.after.Memory getMemory() {
        return Memory;
    }

    public void setMemory(org.example.demo3.after.Memory memory) {
        Memory = memory;
    }

    public  void  run(){
        System.out.println("运行计算机");
        String data = hardDisk.get();
        System.out.println("从硬盘上获取的数据是"+data);
        cpu.run();
        Memory.save();
    }
}
