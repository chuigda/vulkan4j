package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link BufferMapCallbackInfo} and {@link BufferMapCallbackInfo.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IBufferMapCallbackInfo
    extends IPointer
    permits BufferMapCallbackInfo, BufferMapCallbackInfo.Ptr
{}
