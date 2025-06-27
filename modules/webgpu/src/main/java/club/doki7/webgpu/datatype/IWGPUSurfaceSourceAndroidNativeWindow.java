package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link WGPUSurfaceSourceAndroidNativeWindow} and {@link WGPUSurfaceSourceAndroidNativeWindow.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IWGPUSurfaceSourceAndroidNativeWindow
    extends IPointer
    permits WGPUSurfaceSourceAndroidNativeWindow, WGPUSurfaceSourceAndroidNativeWindow.Ptr
{}
