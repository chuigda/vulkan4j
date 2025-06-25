package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrVirtualKeyboardModelAnimationStatesMETA} and {@link XrVirtualKeyboardModelAnimationStatesMETA.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrVirtualKeyboardModelAnimationStatesMETA
    extends IPointer
    permits XrVirtualKeyboardModelAnimationStatesMETA, XrVirtualKeyboardModelAnimationStatesMETA.Ptr
{}
