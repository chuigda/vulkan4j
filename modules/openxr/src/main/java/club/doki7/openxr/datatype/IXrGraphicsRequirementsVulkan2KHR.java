package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrGraphicsRequirementsVulkan2KHR} and {@link XrGraphicsRequirementsVulkan2KHR.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrGraphicsRequirementsVulkan2KHR
    extends IPointer
    permits XrGraphicsRequirementsVulkan2KHR, XrGraphicsRequirementsVulkan2KHR.Ptr
{}
