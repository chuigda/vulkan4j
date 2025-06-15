package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link Limits} and {@link Limits.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ILimits
    extends IPointer
    permits Limits, Limits.Ptr
{}
