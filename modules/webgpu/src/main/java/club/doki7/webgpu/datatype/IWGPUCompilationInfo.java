package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link WGPUCompilationInfo} and {@link WGPUCompilationInfo.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IWGPUCompilationInfo
    extends IPointer
    permits WGPUCompilationInfo, WGPUCompilationInfo.Ptr
{}
