package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link RequestAdapterWebxrOptions} and {@link RequestAdapterWebxrOptions.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IRequestAdapterWebxrOptions
    extends IPointer
    permits RequestAdapterWebxrOptions, RequestAdapterWebxrOptions.Ptr
{}
