package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link WGPUFutureWaitInfo} and {@link WGPUFutureWaitInfo.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IWGPUFutureWaitInfo
    extends IPointer
    permits WGPUFutureWaitInfo, WGPUFutureWaitInfo.Ptr
{}
