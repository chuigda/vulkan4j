package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSenseDataQueryCompletionBD} and {@link XrSenseDataQueryCompletionBD.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSenseDataQueryCompletionBD
    extends IPointer
    permits XrSenseDataQueryCompletionBD, XrSenseDataQueryCompletionBD.Ptr
{}
