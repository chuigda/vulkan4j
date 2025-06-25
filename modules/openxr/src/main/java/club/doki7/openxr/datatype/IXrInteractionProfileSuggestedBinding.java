package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrInteractionProfileSuggestedBinding} and {@link XrInteractionProfileSuggestedBinding.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrInteractionProfileSuggestedBinding
    extends IPointer
    permits XrInteractionProfileSuggestedBinding, XrInteractionProfileSuggestedBinding.Ptr
{}
