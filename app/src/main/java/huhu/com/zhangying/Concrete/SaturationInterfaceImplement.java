package huhu.com.zhangying.Concrete;

import android.util.Log;

import huhu.com.zhangying.Interface.SaturationInterface;

/**
 * Created by Huhu on 2/23/16.
 * 饱和度接口实现类
 */
public class SaturationInterfaceImplement implements SaturationInterface {
    @Override
    public void SaturationChanged() {
        //do something
    }

    @Override
    public void strategyContent() {
        Log.v("SaturationStrategy", "This is a concrete Saturation strategy");
    }
}
