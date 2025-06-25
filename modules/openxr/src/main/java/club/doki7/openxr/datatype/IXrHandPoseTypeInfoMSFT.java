package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrHandPoseTypeInfoMSFT} and {@link XrHandPoseTypeInfoMSFT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrHandPoseTypeInfoMSFT
    extends IPointer
    permits XrHandPoseTypeInfoMSFT, XrHandPoseTypeInfoMSFT.Ptr
{}
