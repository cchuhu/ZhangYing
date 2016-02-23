package huhu.com.zhangying.Concrete;

import android.widget.TextView;

import huhu.com.zhangying.Abstract.State;
import huhu.com.zhangying.Interface.StrategyInterface;

/**
 * 饱和度改变的状态子类
 * Created by Huhu on 2/23/16.
 */
public class SaturationState extends State {

    public TextView tv_saturation;

    @Override
    public void useStrategy(StrategyInterface strategyInterface) {
        strategyInterface.strategyContent();
    }

    @Override
    public void changeView() {
        useStrategy(strategy);
        tv_saturation.setText(String.valueOf(num));
    }

}
