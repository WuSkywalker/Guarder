package com.ytf.game.guarder.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.ytf.game.guarder.core.main.GuarderMain;

/**
 * Package: com.ytf.game.guarder.android
 * Created with Guarder
 * User: AndyHua
 * Date: 14-12-16
 * Time: 13:39
 * Description:launcher
 */

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		new LwjglApplication(new GuarderMain(), config);
	}
}
