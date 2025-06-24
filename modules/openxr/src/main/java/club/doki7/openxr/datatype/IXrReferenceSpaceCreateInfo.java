package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrReferenceSpaceCreateInfo} and {@link XrReferenceSpaceCreateInfo.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrReferenceSpaceCreateInfo
    extends IPointer
    permits XrReferenceSpaceCreateInfo, XrReferenceSpaceCreateInfo.Ptr
{}
