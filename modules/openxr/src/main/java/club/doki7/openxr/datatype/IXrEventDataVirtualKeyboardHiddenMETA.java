package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrEventDataVirtualKeyboardHiddenMETA} and {@link XrEventDataVirtualKeyboardHiddenMETA.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrEventDataVirtualKeyboardHiddenMETA
    extends IPointer
    permits XrEventDataVirtualKeyboardHiddenMETA, XrEventDataVirtualKeyboardHiddenMETA.Ptr
{}
