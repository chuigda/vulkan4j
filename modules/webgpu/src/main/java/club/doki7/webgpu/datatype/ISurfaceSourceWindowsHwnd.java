package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SurfaceSourceWindowsHwnd} and {@link SurfaceSourceWindowsHwnd.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISurfaceSourceWindowsHwnd
    extends IPointer
    permits SurfaceSourceWindowsHwnd, SurfaceSourceWindowsHwnd.Ptr
{}
