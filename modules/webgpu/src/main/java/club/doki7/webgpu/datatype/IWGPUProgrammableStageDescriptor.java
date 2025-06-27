package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link WGPUProgrammableStageDescriptor} and {@link WGPUProgrammableStageDescriptor.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IWGPUProgrammableStageDescriptor
    extends IPointer
    permits WGPUProgrammableStageDescriptor, WGPUProgrammableStageDescriptor.Ptr
{}
