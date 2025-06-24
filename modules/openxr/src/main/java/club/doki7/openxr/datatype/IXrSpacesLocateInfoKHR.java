package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSpacesLocateInfoKHR} and {@link XrSpacesLocateInfoKHR.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSpacesLocateInfoKHR
    extends IPointer
    permits XrSpacesLocateInfoKHR, XrSpacesLocateInfoKHR.Ptr
{}
