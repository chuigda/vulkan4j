package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrVirtualKeyboardAnimationStateMETA} and {@link XrVirtualKeyboardAnimationStateMETA.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrVirtualKeyboardAnimationStateMETA
    extends IPointer
    permits XrVirtualKeyboardAnimationStateMETA, XrVirtualKeyboardAnimationStateMETA.Ptr
{}
