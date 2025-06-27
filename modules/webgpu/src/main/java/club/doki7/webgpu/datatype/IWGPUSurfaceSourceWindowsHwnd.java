package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link WGPUSurfaceSourceWindowsHwnd} and {@link WGPUSurfaceSourceWindowsHwnd.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IWGPUSurfaceSourceWindowsHwnd
    extends IPointer
    permits WGPUSurfaceSourceWindowsHwnd, WGPUSurfaceSourceWindowsHwnd.Ptr
{}
