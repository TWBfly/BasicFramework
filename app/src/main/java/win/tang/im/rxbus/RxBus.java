package win.tang.im.rxbus;

import com.jakewharton.rxrelay2.PublishRelay;
import com.jakewharton.rxrelay2.Relay;

import io.reactivex.Observable;

/**
 * Created by Tang on 2018/3/6
 * <p>
 * 使用
 * 发送
 * RxBus.getDefault().post(bean);
 * 接受
 * RxBus.getDefault().toObservable()
 * .map(new Function<Object, ActicleBean.OthersBean>() {
 *
 * @Override public ActicleBean.OthersBean apply(@NonNull Object o) throws Exception {
 * return (ActicleBean.OthersBean) o;
 * }
 * <p>
 * })
 * .subscribe(new Consumer<ActicleBean.OthersBean>() {
 * @Override public void accept(@NonNull ActicleBean.OthersBean othersBean) throws Exception {
 * if (othersBean != null) {
 * ToastUtils.toast(ActicleListActivity.this, "othersBean" + othersBean.getDescription());
 * }
 * }
 * <p>
 * });
 * }
 */

public class RxBus {
    private static volatile RxBus instance;
    private final Relay<Object> mBus;

    public RxBus() {
        this.mBus = PublishRelay.create().toSerialized();
    }

    public static RxBus getDefault() {
        if (instance == null) {
            synchronized (RxBus.class) {
                if (instance == null) {
                    instance = Holder.BUS;
                }
            }
        }
        return instance;
    }

    public void post(Object obj) {
        mBus.accept(obj);
    }

    public <T> Observable<T> toObservable(Class<T> tClass) {
        return mBus.ofType(tClass);
    }

    public Observable<Object> toObservable() {
        return mBus;
    }

    public boolean hasObservers() {
        return mBus.hasObservers();
    }

    private static class Holder {
        private static final RxBus BUS = new RxBus();
    }
}
