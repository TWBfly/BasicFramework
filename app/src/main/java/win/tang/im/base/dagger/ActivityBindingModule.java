package win.tang.im.base.dagger;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import win.tang.im.ui.main.MainActivity;
import win.tang.im.ui.main.MainModule;

/**
 * Created by Tang on 2018/2/9
 */
@Module
abstract class ActivityBindingModule {
    @ActivityScoped
    @ContributesAndroidInjector(modules = MainModule.class)
    abstract MainActivity mainActivity();
}
