package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrVirtualKeyboardTextureDataMETA} and {@link XrVirtualKeyboardTextureDataMETA.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrVirtualKeyboardTextureDataMETA
    extends IPointer
    permits XrVirtualKeyboardTextureDataMETA, XrVirtualKeyboardTextureDataMETA.Ptr
{}
