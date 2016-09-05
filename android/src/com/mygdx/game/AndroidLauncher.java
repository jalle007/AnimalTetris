package com.mygdx.game;

import android.os.Bundle;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;

public class AndroidLauncher extends AndroidApplication {
	@Override
	protected void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();

//		initialize(new MyGdxGame(), config); test
		initialize(new Physics2() {
			@Override
			public void resize(int width, int height) {

			}

			@Override
			public void pause() {

			}

			@Override
			public void resume() {

			}

			@Override
			public void dispose() {

			}
		}, config);
	}
}
