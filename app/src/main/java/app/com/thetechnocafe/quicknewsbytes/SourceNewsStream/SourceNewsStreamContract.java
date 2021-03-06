package app.com.thetechnocafe.quicknewsbytes.SourceNewsStream;

import android.content.Context;

import java.util.List;

import app.com.thetechnocafe.quicknewsbytes.Models.ArticleModel;

/**
 * Created by gurleensethi on 18/12/16.
 */

public class SourceNewsStreamContract {
    public interface Presenter {
        void start(boolean isInstanceCreated);

        void refreshNews(String sourceID);
    }

    public interface View {
        Context getViewContext();

        void displayNewsList(List<ArticleModel> list);

        void startRefreshing();

        void stopRefreshing();

        void showSnackbarMessage(int stringResource);
    }
}
