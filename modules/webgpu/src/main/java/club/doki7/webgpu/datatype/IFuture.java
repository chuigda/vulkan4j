package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link Future} and {@link Future.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IFuture
    extends IPointer
    permits Future, Future.Ptr
{}
