package huhu.com.zhangying.Concrete;
import android.widget.TextView;
import huhu.com.zhangying.Abstract.State;
import huhu.com.zhangying.Interface.StrategyInterface;

/**
 * Created by Huhu on 2/23/16.
 * 颜色改变的状态子类
 */
public class ColorState extends State {
    //呈现颜色数值的组件，可根据后期需要增减。
    public TextView tv_Colorstate;


    @Override
    public void useStrategy(StrategyInterface strategyInterface) {
        strategyInterface.strategyContent();

    }

    @Override
    public void changeView() {
        useStrategy(strategy);
        tv_Colorstate.setText(String.valueOf(num));
    }

}
