package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrVirtualKeyboardLocationInfoMETA} and {@link XrVirtualKeyboardLocationInfoMETA.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrVirtualKeyboardLocationInfoMETA
    extends IPointer
    permits XrVirtualKeyboardLocationInfoMETA, XrVirtualKeyboardLocationInfoMETA.Ptr
{}
