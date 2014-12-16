package com.ytf.game.guarder.android;

import android.os.Bundle;
import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import com.ytf.game.guarder.core.main.GuarderMain;

/**
 * Package: com.ytf.game.guarder.android
 * Created with Guarder
 * User: AndyHua
 * Date: 14-12-16
 * Time: 13:38
 * Description:launcher
 */
public class AndroidLauncher extends AndroidApplication{
    private static final String TAG = "AndroidLauncher1";

    /**
     *
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();
        initialize(new GuarderMain(), config);
    }
}
