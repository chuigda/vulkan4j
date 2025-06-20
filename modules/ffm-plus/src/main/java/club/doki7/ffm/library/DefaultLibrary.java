package club.doki7.ffm.library;

import club.doki7.ffm.Loader;

import java.lang.foreign.MemorySegment;

public final class DefaultLibrary implements ISharedLibrary {
    @Override
    public MemorySegment apply(String name) {
        return Loader.loadFunctionOrNull(name);
    }

    @Override
    public void close() {}
}
