package xyz.hanks.blog.ui.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by hanks on 16/2/11.
 */
public class HalfView extends View {


    private Paint mPaint;

    public HalfView(Context context) {
        this(context,null);
    }

    public HalfView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public HalfView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public HalfView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }

    private void init() {
        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mPaint.setColor(Color.RED);
    }


    @Override protected void onDraw(Canvas canvas) {
        canvas.drawRect(0,0,getWidth(),getHeight(),mPaint);
        canvas.rotate((float) Math.atan(getHeight()*1.0f/getWidth()));
    }
}
