package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrEventDataVirtualKeyboardEnterMETA} and {@link XrEventDataVirtualKeyboardEnterMETA.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrEventDataVirtualKeyboardEnterMETA
    extends IPointer
    permits XrEventDataVirtualKeyboardEnterMETA, XrEventDataVirtualKeyboardEnterMETA.Ptr
{}
