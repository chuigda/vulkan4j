package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SurfaceCapabilities} and {@link SurfaceCapabilities.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISurfaceCapabilities
    extends IPointer
    permits SurfaceCapabilities, SurfaceCapabilities.Ptr
{}
