package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrFrameSynthesisInfoEXT} and {@link XrFrameSynthesisInfoEXT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrFrameSynthesisInfoEXT
    extends IPointer
    permits XrFrameSynthesisInfoEXT, XrFrameSynthesisInfoEXT.Ptr
{}
