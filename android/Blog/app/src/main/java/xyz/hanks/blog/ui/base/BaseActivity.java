package xyz.hanks.blog.ui.base;

import android.app.Activity;
import android.content.Context;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

/**
 * Activity的共同父类
 * Created by hanks on 16/2/2.
 */
public class BaseActivity extends Activity {

    @Override protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }
}
