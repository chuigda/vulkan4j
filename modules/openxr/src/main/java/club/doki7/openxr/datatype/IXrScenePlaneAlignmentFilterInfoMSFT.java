package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrScenePlaneAlignmentFilterInfoMSFT} and {@link XrScenePlaneAlignmentFilterInfoMSFT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrScenePlaneAlignmentFilterInfoMSFT
    extends IPointer
    permits XrScenePlaneAlignmentFilterInfoMSFT, XrScenePlaneAlignmentFilterInfoMSFT.Ptr
{}
