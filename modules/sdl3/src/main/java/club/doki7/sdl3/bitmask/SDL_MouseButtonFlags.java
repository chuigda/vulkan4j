package club.doki7.sdl3.bitmask;

/// A bitmask of pressed mouse buttons, as reported by SDL_GetMouseState, etc.
///
/// - Button 1: Left mouse button
/// - Button 2: Middle mouse button
/// - Button 3: Right mouse button
/// - Button 4: Side mouse button 1
/// - Button 5: Side mouse button 2
///
/// \since This datatype is available since SDL 3.2.0.
///
/// \sa SDL_GetMouseState
/// \sa SDL_GetGlobalMouseState
/// \sa SDL_GetRelativeMouseState
///
public final class SDL_MouseButtonFlags {
    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_MouseButtonFlags() {}
}
