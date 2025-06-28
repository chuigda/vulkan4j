package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link WGPUTexelCopyBufferLayout} and {@link WGPUTexelCopyBufferLayout.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IWGPUTexelCopyBufferLayout
    extends IPointer
    permits WGPUTexelCopyBufferLayout, WGPUTexelCopyBufferLayout.Ptr
{}
