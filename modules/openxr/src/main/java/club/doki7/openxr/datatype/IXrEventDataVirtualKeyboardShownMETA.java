package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrEventDataVirtualKeyboardShownMETA} and {@link XrEventDataVirtualKeyboardShownMETA.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrEventDataVirtualKeyboardShownMETA
    extends IPointer
    permits XrEventDataVirtualKeyboardShownMETA, XrEventDataVirtualKeyboardShownMETA.Ptr
{}
