package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrFrustumfKHR} and {@link XrFrustumfKHR.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrFrustumfKHR
    extends IPointer
    permits XrFrustumfKHR, XrFrustumfKHR.Ptr
{}
