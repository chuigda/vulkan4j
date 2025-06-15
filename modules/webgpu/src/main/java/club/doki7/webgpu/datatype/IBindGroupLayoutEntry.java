package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link BindGroupLayoutEntry} and {@link BindGroupLayoutEntry.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IBindGroupLayoutEntry
    extends IPointer
    permits BindGroupLayoutEntry, BindGroupLayoutEntry.Ptr
{}
