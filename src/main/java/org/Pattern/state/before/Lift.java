package org.Pattern.state.before;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2024/1/25
 * @description 电梯类（ILift的子实现类）
 */
public class Lift implements ILift{

    //声明一个记录当前电梯的装填
    private int state;

    @Override
    public void setState(int state) {
        this.state=state;
    }

    @Override
    public void open() {
            switch (this.state){//当前电梯状态
                case OPENING_STATE:
                    //什么事情都不做
                    break;
                case CLOSING_STATE:
                    System.out.println("电梯打开了");
                    //设置当前电梯状态为开启状态
                    setState(OPENING_STATE);
                    break;
                case RUNNING_STATE:
                    //什么都不做
                    break;
                case STOPPING_STATE:
                    //什么都不做
                    break;
            }
    }

    @Override
    public void close() {
        switch (this.state){//当前电梯状态
            case OPENING_STATE:
                System.out.println("电梯关门了....");//只有开门状态才考研关闭电梯
                this.setState(CLOSING_STATE);
                break;
            case CLOSING_STATE:
                //什么事情都不做
                break;
            case RUNNING_STATE:
                //什么都不做
                break;
            case STOPPING_STATE:
                //什么都不做
                break;
        }
    }

    @Override
    public void running() {
        switch (this.state){//当前电梯状态
            case OPENING_STATE:
                //什么事情都不做
                break;
            case CLOSING_STATE:
                System.out.println("电梯开始运行了.....");
                this.setState(RUNNING_STATE);
                break;
            case RUNNING_STATE:
                //什么都不做
                break;
            case STOPPING_STATE:
                System.out.println("电梯开始运行了.....");
                this.setState(RUNNING_STATE);
                break;
        }
    }

    @Override
    public void stop() {
        switch (this.state){//当前电梯状态
            case OPENING_STATE:
                //什么事情都不做
                break;
            case CLOSING_STATE:
                System.out.println("电梯停止了.....");
                this.setState(this.state);
                break;
            case RUNNING_STATE:
                System.out.println("电梯停止了.....");
                this.setState(this.state);
                break;
            case STOPPING_STATE:
                //什么事情都不做
                break;
        }
    }
}
