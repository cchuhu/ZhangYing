package huhu.com.zhangying.Abstract;

import huhu.com.zhangying.Interface.StrategyInterface;

/**
 * Created by Huhu on 2/23/16.
 * seekbar的状态抽象父类，子类用于当按下不同按钮时seekbar状态改变的情况。
 */
public abstract class State {
    //策略父类接口
    public StrategyInterface strategy;
    //滑动条对应的数值
    public int num;

    /**
     * 设置该状态下的对应策略。
     *
     * @param strategy 实现策略接口的对象
     */
    public void setStrategy(StrategyInterface strategy) {
        this.strategy = strategy;
    }

    /**
     * 滑动条数值set方法
     *
     * @param num
     */
    public void setNum(int num) {
        this.num = num;
    }

    /**
     * 滑动条数值get方法
     *
     * @return num 返回当前数值
     */
    public int getNum() {
        return num;
    }


    /**
     * 策略执行
     */
    abstract public void useStrategy(StrategyInterface strategyInterface);

    /**
     * 改变外观行为(目前只有TextView)
     */
    abstract public void changeView();
}