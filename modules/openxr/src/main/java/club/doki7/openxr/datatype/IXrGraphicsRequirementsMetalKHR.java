package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrGraphicsRequirementsMetalKHR} and {@link XrGraphicsRequirementsMetalKHR.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrGraphicsRequirementsMetalKHR
    extends IPointer
    permits XrGraphicsRequirementsMetalKHR, XrGraphicsRequirementsMetalKHR.Ptr
{}
