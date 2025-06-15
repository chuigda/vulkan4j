package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link Origin3d} and {@link Origin3d.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IOrigin3d
    extends IPointer
    permits Origin3d, Origin3d.Ptr
{}
