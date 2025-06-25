package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrVirtualKeyboardCreateInfoMETA} and {@link XrVirtualKeyboardCreateInfoMETA.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrVirtualKeyboardCreateInfoMETA
    extends IPointer
    permits XrVirtualKeyboardCreateInfoMETA, XrVirtualKeyboardCreateInfoMETA.Ptr
{}
