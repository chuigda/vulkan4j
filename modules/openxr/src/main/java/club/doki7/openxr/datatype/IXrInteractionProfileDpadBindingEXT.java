package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrInteractionProfileDpadBindingEXT} and {@link XrInteractionProfileDpadBindingEXT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrInteractionProfileDpadBindingEXT
    extends IPointer
    permits XrInteractionProfileDpadBindingEXT, XrInteractionProfileDpadBindingEXT.Ptr
{}
