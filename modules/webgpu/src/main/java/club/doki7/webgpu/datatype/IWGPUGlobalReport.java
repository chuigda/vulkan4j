package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link WGPUGlobalReport} and {@link WGPUGlobalReport.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IWGPUGlobalReport
    extends IPointer
    permits WGPUGlobalReport, WGPUGlobalReport.Ptr
{}
