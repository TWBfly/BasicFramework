package win.tang.im.base.dagger;

import android.app.Application;
import android.content.Context;

import dagger.Binds;
import dagger.Module;

/**
 * Created by Tang on 2018/2/9
 */

@Module
abstract class ApplicationModule {
    @Binds
    abstract Context bindContext(Application application);
}
