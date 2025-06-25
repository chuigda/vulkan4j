package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrFrameSynthesisConfigViewEXT} and {@link XrFrameSynthesisConfigViewEXT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrFrameSynthesisConfigViewEXT
    extends IPointer
    permits XrFrameSynthesisConfigViewEXT, XrFrameSynthesisConfigViewEXT.Ptr
{}
