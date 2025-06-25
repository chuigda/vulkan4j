package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSystemFaceTrackingProperties2FB} and {@link XrSystemFaceTrackingProperties2FB.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSystemFaceTrackingProperties2FB
    extends IPointer
    permits XrSystemFaceTrackingProperties2FB, XrSystemFaceTrackingProperties2FB.Ptr
{}
