package example.sdl;

import club.doki7.ffm.Loader;
import club.doki7.ffm.ptr.BytePtr;
import club.doki7.sdl3.SDL3;
import club.doki7.sdl3.bitmask.SDL_InitFlags;
import club.doki7.sdl3.bitmask.SDL_WindowFlags;
import club.doki7.sdl3.datatype.SDL_Event;
import club.doki7.sdl3.datatype.SDL_Vertex;
import club.doki7.sdl3.enumtype.SDL_EventType;
import club.doki7.sdl3.handle.SDL_Renderer;
import club.doki7.sdl3.handle.SDL_Window;

import java.lang.foreign.Arena;

public final class Main {
    public static void main(String[] args) {
        System.loadLibrary("sdl3");
        SDL3 sdl = new SDL3(Loader::loadFunctionOrNull);

        sdl.init(SDL_InitFlags.VIDEO);

        try (Arena arena = Arena.ofConfined()) {
            SDL_Window window = sdl.createWindow(
                    BytePtr.allocateString(arena, "Simple SDL window"),
                    800,
                    600,
                    SDL_WindowFlags.RESIZABLE
            );
            SDL_Renderer renderer = sdl.createRenderer(window, null);
            SDL_Vertex.Ptr vertices = SDL_Vertex.allocate(arena, 3);
            vertices.at(0).color().r(1.0f).g(0).b(0).a(1.0f);
            vertices.at(0).position().x(0).y(600);
            vertices.at(1).color().r(0).g(1.0f).b(0).a(1.0f);
            vertices.at(1).position().x(800).y(600);
            vertices.at(2).color().r(0).g(0).b(1.0f).a(1.0f);
            vertices.at(2).position().x(400).y(0);

            boolean quit = false;
            SDL_Event event = SDL_Event.allocate(arena);
            while (!quit) {
                while (sdl.pollEvent(event)) {
                    if (event.type() == SDL_EventType.QUIT) {
                        quit = true;
                    }
                }

                sdl.setRenderDrawColor(
                        renderer,
                        (byte) 0,
                        (byte) 0,
                        (byte) 0,
                        (byte) SDL3.ALPHA_OPAQUE
                );
                sdl.renderClear(renderer);
                sdl.renderGeometry(renderer, null, vertices, (int) vertices.size(), null, 0);
                sdl.renderPresent(renderer);
            }

            sdl.destroyRenderer(renderer);
            sdl.destroyWindow(window);
            sdl.quit();
        }
    }
}
