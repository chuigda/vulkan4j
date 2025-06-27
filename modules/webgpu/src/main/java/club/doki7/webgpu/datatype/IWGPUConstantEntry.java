package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link WGPUConstantEntry} and {@link WGPUConstantEntry.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IWGPUConstantEntry
    extends IPointer
    permits WGPUConstantEntry, WGPUConstantEntry.Ptr
{}
