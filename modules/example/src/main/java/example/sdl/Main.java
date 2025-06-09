package example.sdl;

import club.doki7.ffm.Loader;
import club.doki7.sdl3.SDL3;
import club.doki7.sdl3.bitmask.SDL_InitFlags;

public final class Main {
    public static void main(String[] args) {
        System.loadLibrary("sdl3");
        SDL3 sdl3 = new SDL3(Loader::loadFunctionOrNull);

        sdl3.init(SDL_InitFlags.VIDEO | SDL_InitFlags.AUDIO);
    }
}
