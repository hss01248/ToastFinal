package com.hss01248.toastfinaldemo;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.hss01248.toast.ToastFinal;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.button)
    Button button;
    @Bind(R.id.button2)
    Button button2;
    @Bind(R.id.button3)
    Button button3;
    @Bind(R.id.button4)
    Button button4;
    @Bind(R.id.button5)
    Button button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        ToastFinal.init(getApplication(),new Handler(),true,true);
    }

    String text = "金鳞岂是池中物,一遇风云便化龙";

    @OnClick({R.id.button, R.id.button2, R.id.button3, R.id.button4, R.id.button5})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button:
                ToastFinal.show("short");
                break;
            case R.id.button2:
                ToastFinal.showLong(text+"long");
                break;
            case R.id.button3:
                ToastFinal.showDebug(text);
                break;
            case R.id.button4:
                ToastFinal.showSuccess("fdkshfdshfkdshfjsdhkfsdhjfhdskfhdfdgfdgfdgfdgdrdskhfkds");
                break;
            case R.id.button5:
                ToastFinal.showFail("56");
                break;
        }
    }
}
