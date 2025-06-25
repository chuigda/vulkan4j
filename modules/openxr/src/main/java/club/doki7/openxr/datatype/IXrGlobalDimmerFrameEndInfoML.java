package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrGlobalDimmerFrameEndInfoML} and {@link XrGlobalDimmerFrameEndInfoML.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrGlobalDimmerFrameEndInfoML
    extends IPointer
    permits XrGlobalDimmerFrameEndInfoML, XrGlobalDimmerFrameEndInfoML.Ptr
{}
