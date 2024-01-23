package org.example.demo3.before;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2023/7/27
 * @description 电脑
 */
public class Computer {
    private  XIJieHardDisk hardDisk;
    private  InterCpu cpu;
    private  KingstonMemory kingstonMemory;

    public XIJieHardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(XIJieHardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public InterCpu getCpu() {
        return cpu;
    }

    public void setCpu(InterCpu cpu) {
        this.cpu = cpu;
    }

    public KingstonMemory getKingstonMemory() {
        return kingstonMemory;
    }

    public void setKingstonMemory(KingstonMemory kingstonMemory) {
        this.kingstonMemory = kingstonMemory;
    }
    public  void  run(){
        System.out.println("运行计算机");
        String data = hardDisk.getData();
        System.out.println("从硬盘上获取的数据是"+data);
        cpu.run();
        kingstonMemory.save();
    }
}
