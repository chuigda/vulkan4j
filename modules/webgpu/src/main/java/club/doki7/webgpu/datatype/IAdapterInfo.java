package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link AdapterInfo} and {@link AdapterInfo.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IAdapterInfo
    extends IPointer
    permits AdapterInfo, AdapterInfo.Ptr
{}
