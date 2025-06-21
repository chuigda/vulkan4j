package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link StringView} and {@link StringView.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IStringView
    extends IPointer
    permits StringView, StringView.Ptr
{}
