package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link WGPUHubReport} and {@link WGPUHubReport.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IWGPUHubReport
    extends IPointer
    permits WGPUHubReport, WGPUHubReport.Ptr
{}
