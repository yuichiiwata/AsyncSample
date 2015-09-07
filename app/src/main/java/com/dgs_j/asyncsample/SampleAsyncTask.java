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

        return null;
    }
    /**
     * バックグラウンド処理が終了した後に
     * 実行したい処理をこちらに記載する。
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
