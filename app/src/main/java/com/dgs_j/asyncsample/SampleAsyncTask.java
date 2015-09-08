package com.dgs_j.asyncsample;

import android.app.Activity;
import android.os.AsyncTask;

/**
 * Created by iwata on 2015/09/07.
 */
public class SampleAsyncTask extends AsyncTask<String, Integer, String> {
    Activity act;

    public SampleAsyncTask(Activity act) {
        this.act = act;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected void onProgressUpdate(Integer... values) {
        super.onProgressUpdate(values);
    }

    /***
     * バックグラウンド処理したいものを
     * こちらに記載する
     */
    @Override
    protected String doInBackground(String... params) {
        //通信処理や時間のかかる処理を記載する。
        return null;//この戻り値はonPostExecuteの引数で受け取ることができる
    }

    /*(非 Javadoc)
     * @see android.os.AsyncTask#onPostExecute(java.lang.Object)
     *
     * extends AsyncTask<String, Integer, Integer>などで指定した最後の型で、
     * protected Integer doInBackground(String... params) {の戻り値が発生した際に
     * このファイルは実行される。
     *
     * ※終了後に行う処理は、時間差などが起こるので、ここでまとめて行うこと。
     *
     */
    @Override
    protected void onPostExecute(String str) {
        super.onPostExecute(str);

    }

    @Override
    protected void onCancelled(String str) {
        super.onCancelled(str);
    }

    @Override
    protected void onCancelled() {
        super.onCancelled();
    }


}
