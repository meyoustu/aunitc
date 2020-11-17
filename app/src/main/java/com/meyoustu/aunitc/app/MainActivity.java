package com.meyoustu.aunitc.app;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.meyoustu.aunitc.dp;
import com.meyoustu.aunitc.px;
import com.meyoustu.aunitc.sp;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        StringBuilder stringBuilder = new StringBuilder();

        int dpToPx = dp.toPx(this, 200);
        int spToPx = sp.toPx(this, 200);

        float pxToDp = px.toDp(this, dpToPx);
        float pxToSp = px.toSp(this, spToPx);


        stringBuilder.append("dpToPx => " + dpToPx + "\n");
        stringBuilder.append("spToPx => " + spToPx + "\n");
        stringBuilder.append("pxToDp => " + pxToDp + "\n");
        stringBuilder.append("pxToSp => " + pxToSp + "\n");

        ((TextView) findViewById(R.id.tv)).setText(stringBuilder.toString());
    }
}