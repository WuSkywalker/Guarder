package com.ytf.game.guarder;

import com.badlogic.gdx.backends.iosrobovm.IOSApplication;
import com.badlogic.gdx.backends.iosrobovm.IOSApplicationConfiguration;
import org.robovm.apple.foundation.NSAutoreleasePool;
import org.robovm.apple.uikit.UIApplication;

/**
 * Package: com.ytf.game.guarder.android
 * Created with Guarder
 * User: AndyHua
 * Date: 14-12-16
 * Time: 13:41
 * Description:launcher
 */

public class IOSLauncher extends IOSApplication.Delegate {
    /**
     *
     * @return
     */
    @Override
    protected IOSApplication createApplication() {
        IOSApplicationConfiguration config = new IOSApplicationConfiguration();
        return new IOSApplication(new GuarderMain(), config);
    }

    /**
     *
     * @param argv
     */
    public static void main(String[] argv) {
        NSAutoreleasePool pool = new NSAutoreleasePool();
        UIApplication.main(argv, null, IOSLauncher.class);
        pool.close();
    }
}