package huhu.com.zhangying;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import huhu.com.zhangying.Abstract.State;
import huhu.com.zhangying.Concrete.ColorInterfaceImplement;
import huhu.com.zhangying.Concrete.ColorState;
import huhu.com.zhangying.Concrete.LightInterfaceImplement;
import huhu.com.zhangying.Concrete.LightState;
import huhu.com.zhangying.Concrete.SaturationInterfaceImplement;
import huhu.com.zhangying.Concrete.SaturationState;
import huhu.com.zhangying.Interface.CameraInterface;

public class MainActivity extends Activity implements View.OnClickListener, SeekBar.OnSeekBarChangeListener, CameraInterface {
    //调节数值的TextView
    private Button btn_lightness, btn_color, btn_saturation;
    //滑动条
    private SeekBar seekbar;
    //状态对象
    private State state;
    //存放所有状态的List,方便扩展和管理
    private List<State> list_state = new ArrayList<>();
    private ColorState colorState;
    private LightState lightState;
    private SaturationState saturationState;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //初始化界面元素
        initView();
        //初始化滑动条状态组
        initConfig();
        //初始化行为策略
        setStrategy();
    }

    /**
     * 初始化界面
     */
    private void initView() {
        btn_lightness = (Button) findViewById(R.id.btn_lightness);
        btn_color = (Button) findViewById(R.id.btn_color);
        btn_saturation = (Button) findViewById(R.id.btn_saturation);
        seekbar = (SeekBar) findViewById(R.id.seekbar);
        //给button打tag，方便添加监听,要跟statelist里的顺序一致
        btn_color.setTag(0);
        btn_lightness.setTag(1);
        btn_saturation.setTag(2);


    }

    /**
     * 初始化配置，设置状态和策略。
     */
    private void initConfig() {
        //初始化颜色状态,新建状态对象，向列表中添加状态对象，初始化状态对象组件，实例化具体策略对象，设置具体策略。
        colorState = new ColorState();
        list_state.add(colorState);
        colorState.tv_Colorstate = (TextView) findViewById(R.id.tv_color);
        //初始化亮度状态
        lightState = new LightState();
        list_state.add(lightState);
        lightState.tv_lightness = (TextView) findViewById(R.id.tv_lightness);
        //初始化饱和度状态
        saturationState = new SaturationState();
        list_state.add(saturationState);
        saturationState.tv_saturation = (TextView) findViewById(R.id.tv_saturation);
        //默认设置为颜色状态
        state = list_state.get(0);
        //为按钮添加监听器
        btn_color.setOnClickListener(this);
        btn_saturation.setOnClickListener(this);
        btn_lightness.setOnClickListener(this);
        seekbar.setOnSeekBarChangeListener(this);

    }

    /**
     * 设置不同状态对应的策略。
     */
    public void setStrategy() {
        //初始化具体颜色策略
        ColorInterfaceImplement colorInterfaceImplement = new ColorInterfaceImplement();
        colorState.setStrategy(colorInterfaceImplement);
        //初始化具体亮度策略
        LightInterfaceImplement lightInterfaceImplement = new LightInterfaceImplement();
        lightState.setStrategy(lightInterfaceImplement);
        //初始化具体饱和度策略
        SaturationInterfaceImplement saturationInterfaceImplement = new SaturationInterfaceImplement();
        saturationState.setStrategy(saturationInterfaceImplement);
    }


    @Override
    public void onClick(View v) {
        //切换滑动条的状态
        state = list_state.get(Integer.parseInt(v.getTag().toString()));


    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        state.setNum(progress);
        state.changeView();
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void useCamera() {
        //do something
    }
}
