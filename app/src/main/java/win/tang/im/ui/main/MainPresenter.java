package win.tang.im.ui.main;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by Tang on 2018/3/6
 */

public class MainPresenter implements MainContract.Presenter {
    private MainContract.View mainView;

    @Inject
    MainPresenter(){}

    @Override
    public void takeView(MainContract.View view) {
        this.mainView = view;
    }

    @Override
    public void showData() {
        Log.e("twb","this is success!!!");
    }
}
