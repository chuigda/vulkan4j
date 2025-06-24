package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrFrustumf} and {@link XrFrustumf.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrFrustumf
    extends IPointer
    permits XrFrustumf, XrFrustumf.Ptr
{}
