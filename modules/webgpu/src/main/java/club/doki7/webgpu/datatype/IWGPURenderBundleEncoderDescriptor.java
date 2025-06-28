package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link WGPURenderBundleEncoderDescriptor} and {@link WGPURenderBundleEncoderDescriptor.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IWGPURenderBundleEncoderDescriptor
    extends IPointer
    permits WGPURenderBundleEncoderDescriptor, WGPURenderBundleEncoderDescriptor.Ptr
{}
