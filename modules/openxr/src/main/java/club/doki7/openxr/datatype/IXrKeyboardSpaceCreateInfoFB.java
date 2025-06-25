package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrKeyboardSpaceCreateInfoFB} and {@link XrKeyboardSpaceCreateInfoFB.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrKeyboardSpaceCreateInfoFB
    extends IPointer
    permits XrKeyboardSpaceCreateInfoFB, XrKeyboardSpaceCreateInfoFB.Ptr
{}
