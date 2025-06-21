package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link RequestAdapterOptions} and {@link RequestAdapterOptions.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IRequestAdapterOptions
    extends IPointer
    permits RequestAdapterOptions, RequestAdapterOptions.Ptr
{}
