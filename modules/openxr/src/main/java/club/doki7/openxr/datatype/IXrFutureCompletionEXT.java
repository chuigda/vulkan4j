package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrFutureCompletionEXT} and {@link XrFutureCompletionEXT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrFutureCompletionEXT
    extends IPointer
    permits XrFutureCompletionEXT, XrFutureCompletionEXT.Ptr
{}
