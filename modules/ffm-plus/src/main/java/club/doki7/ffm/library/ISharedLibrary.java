package club.doki7.ffm.library;

import club.doki7.ffm.RawFunctionLoader;

public sealed interface ISharedLibrary extends RawFunctionLoader, AutoCloseable permits
        WindowsLibrary,
        DefaultLibrary
{}
