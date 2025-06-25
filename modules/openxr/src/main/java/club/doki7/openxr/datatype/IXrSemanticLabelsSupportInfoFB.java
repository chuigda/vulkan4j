package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSemanticLabelsSupportInfoFB} and {@link XrSemanticLabelsSupportInfoFB.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSemanticLabelsSupportInfoFB
    extends IPointer
    permits XrSemanticLabelsSupportInfoFB, XrSemanticLabelsSupportInfoFB.Ptr
{}
