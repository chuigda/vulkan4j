package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrDebugUtilsMessengerCallbackDataEXT} and {@link XrDebugUtilsMessengerCallbackDataEXT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrDebugUtilsMessengerCallbackDataEXT
    extends IPointer
    permits XrDebugUtilsMessengerCallbackDataEXT, XrDebugUtilsMessengerCallbackDataEXT.Ptr
{}
