package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrDebugUtilsObjectNameInfoEXT} and {@link XrDebugUtilsObjectNameInfoEXT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrDebugUtilsObjectNameInfoEXT
    extends IPointer
    permits XrDebugUtilsObjectNameInfoEXT, XrDebugUtilsObjectNameInfoEXT.Ptr
{}
