package com.ytf.game.guarder;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Package: com.ytf.game.guarder.android
 * Created with Guarder
 * User: AndyHua
 * Date: 14-12-16
 * Time: 13:30
 * Description:launcher
 */

public class GuarderMain extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;

	/**
	 *
	 */
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
	}

	/**
	 *
	 */
	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img, 0, 0);
		batch.end();
	}
}
