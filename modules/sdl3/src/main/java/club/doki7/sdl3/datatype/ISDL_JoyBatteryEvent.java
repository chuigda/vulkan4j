package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_JoyBatteryEvent} and {@link SDL_JoyBatteryEvent.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_JoyBatteryEvent
    extends IPointer
    permits SDL_JoyBatteryEvent, SDL_JoyBatteryEvent.Ptr
{}
