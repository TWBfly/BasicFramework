package win.tang.im.ui.main;

import win.tang.im.base.app.BasePresenter;
import win.tang.im.base.app.BaseView;

/**
 * Created by Tang on 2018/3/5
 */

public class MainContract {
    interface View extends BaseView<Presenter>{

    }

    interface Presenter extends BasePresenter<View>{
        void showData();
    }

}
