package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SurfaceConfiguration} and {@link SurfaceConfiguration.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISurfaceConfiguration
    extends IPointer
    permits SurfaceConfiguration, SurfaceConfiguration.Ptr
{}
