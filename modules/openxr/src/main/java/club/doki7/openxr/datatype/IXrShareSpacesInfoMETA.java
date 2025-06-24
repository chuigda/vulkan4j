package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrShareSpacesInfoMETA} and {@link XrShareSpacesInfoMETA.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrShareSpacesInfoMETA
    extends IPointer
    permits XrShareSpacesInfoMETA, XrShareSpacesInfoMETA.Ptr
{}
