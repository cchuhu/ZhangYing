package huhu.com.zhangying.Concrete;

import android.util.Log;

import huhu.com.zhangying.Interface.LightInterface;

/**
 * Created by Huhu on 2/23/16.
 * 亮度接口实现类
 */
public class LightInterfaceImplement implements LightInterface {
    @Override
    public void LightChanged() {
        //do something
    }

    @Override
    public void strategyContent() {
        Log.v("LightStrategy", "This is a concrete Light strategy");
    }

}
