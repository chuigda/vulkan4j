package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link WGPUStencilFaceState} and {@link WGPUStencilFaceState.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IWGPUStencilFaceState
    extends IPointer
    permits WGPUStencilFaceState, WGPUStencilFaceState.Ptr
{}
