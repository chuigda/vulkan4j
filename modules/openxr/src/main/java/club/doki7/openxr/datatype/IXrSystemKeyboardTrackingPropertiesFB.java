package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSystemKeyboardTrackingPropertiesFB} and {@link XrSystemKeyboardTrackingPropertiesFB.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSystemKeyboardTrackingPropertiesFB
    extends IPointer
    permits XrSystemKeyboardTrackingPropertiesFB, XrSystemKeyboardTrackingPropertiesFB.Ptr
{}
