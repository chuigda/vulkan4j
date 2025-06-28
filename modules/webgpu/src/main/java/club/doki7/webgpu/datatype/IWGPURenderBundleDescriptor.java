package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link WGPURenderBundleDescriptor} and {@link WGPURenderBundleDescriptor.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IWGPURenderBundleDescriptor
    extends IPointer
    permits WGPURenderBundleDescriptor, WGPURenderBundleDescriptor.Ptr
{}
