package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrFuturePollResultProgressBD} and {@link XrFuturePollResultProgressBD.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrFuturePollResultProgressBD
    extends IPointer
    permits XrFuturePollResultProgressBD, XrFuturePollResultProgressBD.Ptr
{}
