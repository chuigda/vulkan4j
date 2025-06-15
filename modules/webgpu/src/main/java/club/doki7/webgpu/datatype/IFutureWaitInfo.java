package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link FutureWaitInfo} and {@link FutureWaitInfo.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IFutureWaitInfo
    extends IPointer
    permits FutureWaitInfo, FutureWaitInfo.Ptr
{}
