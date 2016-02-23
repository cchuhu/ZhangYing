package huhu.com.zhangying.Concrete;
import android.widget.TextView;
import huhu.com.zhangying.Abstract.State;
import huhu.com.zhangying.Interface.StrategyInterface;

/**
 * 亮度改变的状态子类
 * Created by Huhu on 2/23/16.
 */
public class LightState extends State {
    public TextView tv_lightness;

    @Override
    public void useStrategy(StrategyInterface strategyInterface) {
        strategyInterface.strategyContent();
    }

    @Override
    public void changeView() {
        useStrategy(strategy);
        tv_lightness.setText(String.valueOf(num));
    }
}
