package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SurfaceSourceXlibWindow} and {@link SurfaceSourceXlibWindow.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISurfaceSourceXlibWindow
    extends IPointer
    permits SurfaceSourceXlibWindow, SurfaceSourceXlibWindow.Ptr
{}
