package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrDebugUtilsLabelEXT} and {@link XrDebugUtilsLabelEXT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrDebugUtilsLabelEXT
    extends IPointer
    permits XrDebugUtilsLabelEXT, XrDebugUtilsLabelEXT.Ptr
{}
