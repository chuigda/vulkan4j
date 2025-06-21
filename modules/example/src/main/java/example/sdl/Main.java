package example.sdl;

import club.doki7.ffm.library.ILibraryLoader;
import club.doki7.ffm.library.ISharedLibrary;
import club.doki7.ffm.ptr.BytePtr;
import club.doki7.ffm.ptr.IntPtr;
import club.doki7.ffm.ptr.PointerPtr;
import club.doki7.sdl3.SDL3;
import club.doki7.sdl3.bitmask.SDL_InitFlags;
import club.doki7.sdl3.bitmask.SDL_WindowFlags;
import club.doki7.sdl3.datatype.SDL_AudioSpec;
import club.doki7.sdl3.datatype.SDL_Event;
import club.doki7.sdl3.datatype.SDL_Vertex;
import club.doki7.sdl3.enumtype.SDL_EventType;
import club.doki7.sdl3.handle.SDL_AudioStream;
import club.doki7.sdl3.handle.SDL_Renderer;
import club.doki7.sdl3.handle.SDL_Window;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;

public final class Main {
    private static final ISharedLibrary libSDL3 = ILibraryLoader.platformLoader().loadLibrary("SDL3");

    public static void main(String[] args) {
        SDL3 sdl = new SDL3(libSDL3);

        sdl.init(SDL_InitFlags.VIDEO | SDL_InitFlags.AUDIO);

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

            SDL_AudioSpec audioSpec = SDL_AudioSpec.allocate(arena);
            PointerPtr pBuffer = PointerPtr.allocate(arena);
            IntPtr pLength = IntPtr.allocate(arena);
            sdl.loadWAV(
                    BytePtr.allocateString(arena, "example/resc/private-music.wav"),
                    audioSpec,
                    pBuffer,
                    pLength
            );

            SDL_AudioStream stream = sdl.openAudioDeviceStream(
                    SDL3.AUDIO_DEVICE_DEFAULT_PLAYBACK,
                    audioSpec,
                    MemorySegment.NULL,
                    MemorySegment.NULL
            );
            sdl.resumeAudioStreamDevice(stream);

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

                if (sdl.getAudioStreamQueued(stream) <= pLength.read()) {
                    sdl.putAudioStreamData(stream, pBuffer.read(), pLength.read());
                }
            }

            sdl.destroyRenderer(renderer);
            sdl.destroyWindow(window);
            sdl.quit();
        }
    }
}
