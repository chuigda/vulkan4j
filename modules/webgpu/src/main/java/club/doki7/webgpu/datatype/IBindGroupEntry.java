package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link BindGroupEntry} and {@link BindGroupEntry.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IBindGroupEntry
    extends IPointer
    permits BindGroupEntry, BindGroupEntry.Ptr
{}
