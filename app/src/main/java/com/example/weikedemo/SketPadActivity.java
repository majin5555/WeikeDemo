package com.example.weikedemo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import androidx.appcompat.app.AppCompatActivity;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 * <p>
 * <p>
 * 图片和成视频
 * https://github.com/jcodec/jcodec.git
 */
public class SketPadActivity extends AppCompatActivity {

    private SketPadView sketPadView;
    public static FrameLayout mOnSave;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sket_pad);
        sketPadView = findViewById(R.id.SketPadView);
        mOnSave = findViewById(R.id.OnSave);

    }

    boolean record;

    public void getVideo(View view) {
        record = ! record;
        Button b = (Button) view;
        if (record) {
            b.setText("结束");
            sketPadView.startRecord(this, record);
        } else {
            b.setText("开始");
            sketPadView.stopRecord(this, record);
        }
    }
}
