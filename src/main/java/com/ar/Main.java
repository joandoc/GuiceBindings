package com.ar;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Created by Joan do Carmo on 09/11/15.
 */
public class Main {

    //Occasionally you'll want multiple bindings for a same type.
    /**
     * @param args
     */
    public static void main(String[] args) {

        PlayerModule module = new PlayerModule();
        Injector injector = Guice.createInjector(new PlayerModule());

        @Good Player player = (Player)injector.getInstance(Player.class);
        player.bat();
        player.bowl();
    }

}
