package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSystemVirtualKeyboardPropertiesMETA} and {@link XrSystemVirtualKeyboardPropertiesMETA.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSystemVirtualKeyboardPropertiesMETA
    extends IPointer
    permits XrSystemVirtualKeyboardPropertiesMETA, XrSystemVirtualKeyboardPropertiesMETA.Ptr
{}
