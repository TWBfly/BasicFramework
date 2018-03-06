package win.tang.im.rxjava;

import android.content.Context;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/**
 * Created by Tang on 2018/3/6
 */

public abstract class BaseObserver<T> implements Observer<T> {
    private Context mContext;

    public BaseObserver() {
    }

    @Override
    public void onSubscribe(Disposable d) {

    }

    @Override
    public void onNext(T t) {
        _onNext(t);
    }

    @Override
    public void onError(Throwable e) {
        _onError(e.getMessage());
    }

    @Override
    public void onComplete() {

    }

    protected abstract void _onNext(T t);

    protected abstract void _onError(String message);
}
