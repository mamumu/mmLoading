package com.mumu.mmloading;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

import com.mumu.mmloading.base.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends BaseActivity {

    @BindView(R.id.button1)
    Button button1;
    @BindView(R.id.button2)
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initView();
    }

    private void initView() {
    }


    @OnClick({R.id.button1, R.id.button2})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.button1:
                showLoading();
                //延迟3秒关闭
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        hideLoading();
                    }
                },3000);
                break;
            case R.id.button2:
                showLoading("正在校验信息");
                //延迟3秒关闭
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        hideLoading();
                    }
                },5000);
                break;
        }
    }
}
