package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSemanticLabelsFB} and {@link XrSemanticLabelsFB.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSemanticLabelsFB
    extends IPointer
    permits XrSemanticLabelsFB, XrSemanticLabelsFB.Ptr
{}
