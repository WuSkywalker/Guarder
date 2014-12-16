package com.ytf.game.guarder.core.screen.button;

import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

/**
 * Package: com.ytf.game.guarder.core.screen
 * Created with Guarder
 * User: AndyHua
 * Date: 14-12-16
 * Time: 22:19
 * Description:
 */
public class Fish extends Image{
    private static final String TAG = "Fish";

    private TextureRegion region[];

    public Fish (TextureRegion[] region){
        super(region[0]);
    }
}
