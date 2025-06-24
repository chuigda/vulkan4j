package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrNegotiateRuntimeRequest} and {@link XrNegotiateRuntimeRequest.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrNegotiateRuntimeRequest
    extends IPointer
    permits XrNegotiateRuntimeRequest, XrNegotiateRuntimeRequest.Ptr
{}
