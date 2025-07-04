package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link WGPUFuture} and {@link WGPUFuture.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IWGPUFuture
    extends IPointer
    permits WGPUFuture, WGPUFuture.Ptr
{}
