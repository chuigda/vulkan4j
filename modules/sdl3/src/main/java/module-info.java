/// SDL3 Java Bindings implemented with Java 22 FFM (Project Panama) APIs.
///
/// Simple DirectMedia Layer is a cross-platform development library designed to provide low level
/// access to audio, keyboard, mouse, joystick, and graphics hardware via OpenGL and Direct3D.
///
/// For more information about SDL3, see [libsdl.org](https://libsdl.org/).
///
/// ## Use in Maven
///
/// ```
/// <dependency>
///     <groupId>club.doki7</groupId>
///     <artifactId>sdl3</artifactId>
///     <version>0.3.3-sdl3-alpha0</version>
///     <scope>compile</scope>
/// </dependency>
/// ```
module club.doki7.sdl3 {
    exports club.doki7.sdl3;
    exports club.doki7.sdl3.bitmask;
    exports club.doki7.sdl3.datatype;
    exports club.doki7.sdl3.enumtype;
    exports club.doki7.sdl3.handle;

    requires club.doki7.ffm;
    requires java.base;
    requires org.jetbrains.annotations;
}
