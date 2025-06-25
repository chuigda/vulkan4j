package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrShareSpacesRecipientGroupsMETA} and {@link XrShareSpacesRecipientGroupsMETA.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrShareSpacesRecipientGroupsMETA
    extends IPointer
    permits XrShareSpacesRecipientGroupsMETA, XrShareSpacesRecipientGroupsMETA.Ptr
{}
