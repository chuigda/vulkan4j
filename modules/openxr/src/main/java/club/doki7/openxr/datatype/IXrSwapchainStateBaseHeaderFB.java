package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSwapchainStateBaseHeaderFB} and {@link XrSwapchainStateBaseHeaderFB.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSwapchainStateBaseHeaderFB
    extends IPointer
    permits XrSwapchainStateBaseHeaderFB, XrSwapchainStateBaseHeaderFB.Ptr
{}
