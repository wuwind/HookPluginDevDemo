package study.hank.com.plugin;

import android.content.res.AssetManager;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;

/**
 * 这里为什么会造一个BaseActivity，重写资源的获取呢？ 因为如果插件Activity在宿主内部启动，它实际上使用的是宿主内的资源
 */
public class BaseActivity extends AppCompatActivity {

    @Override
    public Resources getResources() {
        if (getApplication() != null && getApplication().getResources() != null) {
            return getApplication().getResources();
        }
        return super.getResources();
    }

    @Override
    public AssetManager getAssets() {
        if (getApplication() != null && getApplication().getAssets() != null) {
            return getApplication().getAssets();
        }
        return super.getAssets();
    }
}
