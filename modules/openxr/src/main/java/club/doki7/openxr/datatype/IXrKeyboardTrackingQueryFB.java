package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrKeyboardTrackingQueryFB} and {@link XrKeyboardTrackingQueryFB.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrKeyboardTrackingQueryFB
    extends IPointer
    permits XrKeyboardTrackingQueryFB, XrKeyboardTrackingQueryFB.Ptr
{}
