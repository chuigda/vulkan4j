package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link CompilationInfo} and {@link CompilationInfo.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ICompilationInfo
    extends IPointer
    permits CompilationInfo, CompilationInfo.Ptr
{}
