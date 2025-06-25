package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrVirtualKeyboardInputInfoMETA} and {@link XrVirtualKeyboardInputInfoMETA.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrVirtualKeyboardInputInfoMETA
    extends IPointer
    permits XrVirtualKeyboardInputInfoMETA, XrVirtualKeyboardInputInfoMETA.Ptr
{}
