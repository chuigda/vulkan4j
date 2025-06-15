package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link ConstantEntry} and {@link ConstantEntry.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IConstantEntry
    extends IPointer
    permits ConstantEntry, ConstantEntry.Ptr
{}
