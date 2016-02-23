package huhu.com.zhangying.Concrete;

import android.util.Log;

import huhu.com.zhangying.Interface.ColorInterface;

/**
 * Created by Huhu on 2/23/16.
 * ColorInterface接口实现类。实现一种具体颜色策略。
 */
public class ColorInterfaceImplement implements ColorInterface {
    @Override
    public void ColorChanged() {
        //do something
    }

    @Override
    public void strategyContent() {
        Log.v("ColorStrategy", "This is a concrete color strategy");
    }
}
