package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SurfaceColorManagement} and {@link SurfaceColorManagement.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISurfaceColorManagement
    extends IPointer
    permits SurfaceColorManagement, SurfaceColorManagement.Ptr
{}
