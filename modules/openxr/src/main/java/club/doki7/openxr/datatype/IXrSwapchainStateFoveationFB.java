package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSwapchainStateFoveationFB} and {@link XrSwapchainStateFoveationFB.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSwapchainStateFoveationFB
    extends IPointer
    permits XrSwapchainStateFoveationFB, XrSwapchainStateFoveationFB.Ptr
{}
