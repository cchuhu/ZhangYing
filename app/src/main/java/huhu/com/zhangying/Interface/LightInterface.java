package huhu.com.zhangying.Interface;

/**
 * Created by Huhu on 2/23/16.
 * 亮度策略接口
 */
public interface LightInterface extends StrategyInterface{
    //亮度改变时调用的方法
    void LightChanged();
}
