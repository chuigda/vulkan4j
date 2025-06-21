package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link InstanceLimits} and {@link InstanceLimits.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IInstanceLimits
    extends IPointer
    permits InstanceLimits, InstanceLimits.Ptr
{}
