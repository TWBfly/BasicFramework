package win.tang.im.ui.main;

import dagger.Binds;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import win.tang.im.base.dagger.ActivityScoped;
import win.tang.im.base.dagger.FragmentScoped;

/**
 * Created by Tang on 2018/3/5
 */
@Module
public abstract class MainModule {
    @FragmentScoped
    @ContributesAndroidInjector
    abstract MainActivity mainActivity();

    @ActivityScoped
    @Binds
    abstract MainContract.Presenter mainPresenter(MainPresenter presenter);
}
