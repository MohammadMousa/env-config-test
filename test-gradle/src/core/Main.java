package core;

import java.util.Date;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class Main implements ApplicationListener {

	public static void main(String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = 700;
		config.height = 250;
		config.title = "Gradle[" + new Date().toGMTString() + "]";
		new LwjglApplication(new Main(), config);
	}

	private SpriteBatch batch;
	private Texture img;

	@Override
	public void create() {
		batch = new SpriteBatch();
		img = new Texture("kartngo.png");
	}

	@Override
	public void render() {
		ScreenUtils.clear(1, 1, 1, 1);
		batch.begin();
		batch.draw(img, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		batch.end();
	}

	@Override
	public void dispose() {
		batch.dispose();
		img.dispose();
	}

	@Override
	public void pause() {
	}

	@Override
	public void resume() {
	}

	@Override
	public void resize(int width, int height) {
	}
}
