package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link QuerySetDescriptor} and {@link QuerySetDescriptor.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IQuerySetDescriptor
    extends IPointer
    permits QuerySetDescriptor, QuerySetDescriptor.Ptr
{}
