package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link WGPUSurfaceSourceXlibWindow} and {@link WGPUSurfaceSourceXlibWindow.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IWGPUSurfaceSourceXlibWindow
    extends IPointer
    permits WGPUSurfaceSourceXlibWindow, WGPUSurfaceSourceXlibWindow.Ptr
{}
