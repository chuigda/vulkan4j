package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSpacesLocateInfo} and {@link XrSpacesLocateInfo.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSpacesLocateInfo
    extends IPointer
    permits XrSpacesLocateInfo, XrSpacesLocateInfo.Ptr
{}
