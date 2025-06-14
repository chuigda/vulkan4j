package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SurfaceTexture} and {@link SurfaceTexture.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISurfaceTexture
    extends IPointer
    permits SurfaceTexture, SurfaceTexture.Ptr
{}
