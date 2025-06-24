package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrVirtualKeyboardSpaceCreateInfoMETA} and {@link XrVirtualKeyboardSpaceCreateInfoMETA.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrVirtualKeyboardSpaceCreateInfoMETA
    extends IPointer
    permits XrVirtualKeyboardSpaceCreateInfoMETA, XrVirtualKeyboardSpaceCreateInfoMETA.Ptr
{}
