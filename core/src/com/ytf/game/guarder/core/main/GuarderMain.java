package com.ytf.game.guarder.core.main;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;
import com.ytf.game.guarder.core.screen.LoadingScreen;
import com.ytf.game.guarder.core.util.GreenLogger;
import com.ytf.game.guarder.core.util.GreenLoggerManager;

import java.util.logging.Level;

/**
 * Package: com.ytf.game.guarder.android
 * Created with Guarder
 * User: AndyHua
 * Date: 14-12-16
 * Time: 13:30
 * Description:launcher
 */

public class GuarderMain extends Game{
	/**
	 * constructor
	 */
	public GuarderMain(){
		GreenLoggerManager.filterLogByLevel(Level.OFF);
	}

	/**
	 *
	 */
	@Override
	public void create() {
		try {
			setScreen(new LoadingScreen(GuarderMain.this));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void setScreen(Screen screen) {
		super.setScreen(screen);
		GreenLogger.getInstance().log(Level.INFO, "The current screen is " + screen.toString());
	}
}
