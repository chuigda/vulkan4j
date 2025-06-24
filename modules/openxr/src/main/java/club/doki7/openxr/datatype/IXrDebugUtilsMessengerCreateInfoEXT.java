package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrDebugUtilsMessengerCreateInfoEXT} and {@link XrDebugUtilsMessengerCreateInfoEXT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrDebugUtilsMessengerCreateInfoEXT
    extends IPointer
    permits XrDebugUtilsMessengerCreateInfoEXT, XrDebugUtilsMessengerCreateInfoEXT.Ptr
{}
