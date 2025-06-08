package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_hid_device_info} and {@link SDL_hid_device_info.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_hid_device_info
    extends IPointer
    permits SDL_hid_device_info, SDL_hid_device_info.Ptr
{}
