package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrKeyboardTrackingDescriptionFB} and {@link XrKeyboardTrackingDescriptionFB.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrKeyboardTrackingDescriptionFB
    extends IPointer
    permits XrKeyboardTrackingDescriptionFB, XrKeyboardTrackingDescriptionFB.Ptr
{}
