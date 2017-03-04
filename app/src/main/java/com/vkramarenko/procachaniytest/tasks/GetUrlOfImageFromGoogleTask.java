package com.vkramarenko.procachaniytest.tasks;

import android.os.AsyncTask;
import android.util.Log;

import com.vkramarenko.procachaniytest.activity.ResultActivity;
import com.vkramarenko.procachaniytest.models.Model;
import com.vkramarenko.procachaniytest.models.NextPage;
import com.vkramarenko.procachaniytest.providers.Provider;
import com.vkramarenko.procachaniytest.settings.Preferences;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Response;

/**
 * Created by 1 on 23.01.2017.
 * Getter for image url
 */

public class GetUrlOfImageFromGoogleTask extends AsyncTask<Void, Void, Model> {
    private static String TAG = "ImageTask";
    private Call<Model> call;

    public GetUrlOfImageFromGoogleTask(Call<Model> call) {
        this.call = call;
    }

    @Override
    protected void onPostExecute(Model model) {
        super.onPostExecute(model);

        int progress = 0;
        for (int i = 0; i < model.getItems().size(); i++) {

            for (int j = 0; j < model.getItems().get(i).getPagemap().getCseImage().size(); j++) {
                Provider.getInstance().getUrlList().add(model.getItems().get(i).getPagemap().getCseImage().get(j).getSrc());
                progress = progress + 1;
                Log.d(TAG, model.getItems().get(i).getPagemap().getCseImage().get(j).getSrc());
            }
            if (progress == model.getQueries().getNextPage().get(0).getCount()) {
                ResultActivity.adapter.notifyDataSetChanged();
            }

        }
        if (Preferences.isFirst) {

            Preferences.isFirst = false;

            NextPage nextPage = model.getQueries().getNextPage().get(0);
            for (int i = 0; i < 2; i++) {
                Provider.getInstance().getImages(nextPage.getSearchTerms(), nextPage.getStartIndex().toString());
            }

        }
    }

    @Override
    protected Model doInBackground(Void... params) {

        Response<Model> response = null;

        try {
            response = call.execute();
        } catch (IOException e) {
            e.printStackTrace();
        }

        assert response != null;
        return response.body();
    }
}

