package win.tang.im.ui.main;

import android.widget.TextView;

import javax.inject.Inject;

import win.tang.im.R;
import win.tang.im.base.app.BaseActivity;

public class MainActivity extends BaseActivity implements MainContract.View {

    @Inject
    MainPresenter presenter;

    private TextView textTV;

    @Override
    protected int getContentView() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        textTV = findViewById(R.id.textTV);

        presenter.takeView(this);
        presenter.showData();
    }

    @Override
    protected void initData() {
    }
}
