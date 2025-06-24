package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrViewLocateInfo} and {@link XrViewLocateInfo.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrViewLocateInfo
    extends IPointer
    permits XrViewLocateInfo, XrViewLocateInfo.Ptr
{}
