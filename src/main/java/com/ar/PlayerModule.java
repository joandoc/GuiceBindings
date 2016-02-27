package com.ar;

/**
 * Created by Joan do Carmo on 09/11/15.
 */

import com.google.inject.AbstractModule;

public class PlayerModule extends AbstractModule {

    @Override
    protected void configure() {

        bind(Player.class).annotatedWith(Good.class).to(GoodPlayer.class);
        bind(Player.class).annotatedWith(Bad.class).to(BadPlayer.class);

    }

}