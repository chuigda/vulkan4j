package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link WGPUBindGroupLayoutDescriptor} and {@link WGPUBindGroupLayoutDescriptor.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IWGPUBindGroupLayoutDescriptor
    extends IPointer
    permits WGPUBindGroupLayoutDescriptor, WGPUBindGroupLayoutDescriptor.Ptr
{}
