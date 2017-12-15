package com.dgs_j.asyncsample;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

/**
 * AsyncTask サンプル
 * 非同期通信サンプル
 * Created by iwata on 2017/12/11.
 */
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //実行の際は毎回インスタンスの再生成が必要になる。
        SampleAsyncTask task = new SampleAsyncTask(this);
        task.execute();
        Log.d("AsyncTask","AsyncTask：開始");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
