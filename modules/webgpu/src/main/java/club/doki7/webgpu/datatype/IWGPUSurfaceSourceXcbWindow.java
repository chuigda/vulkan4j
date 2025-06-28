package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link WGPUSurfaceSourceXcbWindow} and {@link WGPUSurfaceSourceXcbWindow.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IWGPUSurfaceSourceXcbWindow
    extends IPointer
    permits WGPUSurfaceSourceXcbWindow, WGPUSurfaceSourceXcbWindow.Ptr
{}
