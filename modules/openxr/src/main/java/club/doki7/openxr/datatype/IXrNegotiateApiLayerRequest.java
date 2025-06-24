package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrNegotiateApiLayerRequest} and {@link XrNegotiateApiLayerRequest.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrNegotiateApiLayerRequest
    extends IPointer
    permits XrNegotiateApiLayerRequest, XrNegotiateApiLayerRequest.Ptr
{}
