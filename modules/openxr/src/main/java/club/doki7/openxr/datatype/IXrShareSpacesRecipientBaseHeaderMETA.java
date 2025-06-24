package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrShareSpacesRecipientBaseHeaderMETA} and {@link XrShareSpacesRecipientBaseHeaderMETA.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrShareSpacesRecipientBaseHeaderMETA
    extends IPointer
    permits XrShareSpacesRecipientBaseHeaderMETA, XrShareSpacesRecipientBaseHeaderMETA.Ptr
{}
