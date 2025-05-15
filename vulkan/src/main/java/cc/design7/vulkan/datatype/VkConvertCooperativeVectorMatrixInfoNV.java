package cc.design7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import cc.design7.ffm.IPointer;
import cc.design7.ffm.NativeLayout;
import cc.design7.ffm.annotation.*;
import cc.design7.ffm.ptr.*;
import cc.design7.vulkan.bitmask.*;
import cc.design7.vulkan.datatype.*;
import cc.design7.vulkan.enumtype.*;
import static cc.design7.vulkan.VkConstants.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkConvertCooperativeVectorMatrixInfoNV.html"><code>VkConvertCooperativeVectorMatrixInfoNV</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkConvertCooperativeVectorMatrixInfoNV {
///     VkStructureType sType;
///     void const* pNext; // optional
///     size_t srcSize;
///     VkDeviceOrHostAddressConstKHR srcData;
///     size_t* pDstSize;
///     VkDeviceOrHostAddressKHR dstData;
///     VkComponentTypeKHR srcComponentType;
///     VkComponentTypeKHR dstComponentType;
///     uint32_t numRows;
///     uint32_t numColumns;
///     VkCooperativeVectorMatrixLayoutNV srcLayout;
///     size_t srcStride;
///     VkCooperativeVectorMatrixLayoutNV dstLayout;
///     size_t dstStride;
/// } VkConvertCooperativeVectorMatrixInfoNV;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_CONVERT_COOPERATIVE_VECTOR_MATRIX_INFO_NV`
///
/// The {@link VkConvertCooperativeVectorMatrixInfoNV#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkConvertCooperativeVectorMatrixInfoNV#autoInit} to initialize these fields manually for
/// non-allocated instances.
///
/// ## Contracts
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkConvertCooperativeVectorMatrixInfoNV.html"><code>VkConvertCooperativeVectorMatrixInfoNV</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkConvertCooperativeVectorMatrixInfoNV(@NotNull MemorySegment segment) implements IPointer {
    public static VkConvertCooperativeVectorMatrixInfoNV allocate(Arena arena) {
        VkConvertCooperativeVectorMatrixInfoNV ret = new VkConvertCooperativeVectorMatrixInfoNV(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.CONVERT_COOPERATIVE_VECTOR_MATRIX_INFO_NV);
        return ret;
    }

    public static VkConvertCooperativeVectorMatrixInfoNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkConvertCooperativeVectorMatrixInfoNV[] ret = new VkConvertCooperativeVectorMatrixInfoNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkConvertCooperativeVectorMatrixInfoNV(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.CONVERT_COOPERATIVE_VECTOR_MATRIX_INFO_NV);
        }
        return ret;
    }

    public static VkConvertCooperativeVectorMatrixInfoNV clone(Arena arena, VkConvertCooperativeVectorMatrixInfoNV src) {
        VkConvertCooperativeVectorMatrixInfoNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkConvertCooperativeVectorMatrixInfoNV[] clone(Arena arena, VkConvertCooperativeVectorMatrixInfoNV[] src) {
        VkConvertCooperativeVectorMatrixInfoNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.CONVERT_COOPERATIVE_VECTOR_MATRIX_INFO_NV);
    }

    public @enumtype(VkStructureType.class) int sType() {
        return segment.get(LAYOUT$sType, OFFSET$sType);
    }

    public void sType(@enumtype(VkStructureType.class) int value) {
        segment.set(LAYOUT$sType, OFFSET$sType, value);
    }

    public @pointer(comment="void*") MemorySegment pNext() {
        return segment.get(LAYOUT$pNext, OFFSET$pNext);
    }

    public void pNext(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pNext, OFFSET$pNext, value);
    }

    public void pNext(IPointer pointer) {
        pNext(pointer.segment());
    }

    public @unsigned long srcSize() {
        return NativeLayout.readCSizeT(segment, OFFSET$srcSize);
    }

    public void srcSize(@unsigned long value) {
        NativeLayout.writeCSizeT(segment, OFFSET$srcSize, value);
    }

    public VkDeviceOrHostAddressConstKHR srcData() {
        return new VkDeviceOrHostAddressConstKHR(segment.asSlice(OFFSET$srcData, LAYOUT$srcData));
    }

    public void srcData(VkDeviceOrHostAddressConstKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$srcData, SIZE$srcData);
    }

    public @pointer(comment="size_t*") MemorySegment pDstSizeRaw() {
        return segment.get(LAYOUT$pDstSize, OFFSET$pDstSize);
    }

    public void pDstSizeRaw(@pointer(comment="size_t*") MemorySegment value) {
        segment.set(LAYOUT$pDstSize, OFFSET$pDstSize, value);
    }

    /// Note: the returned {@link PointerPtr} does not have correct
    /// {@link PointerPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link PointerPtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable PointerPtr pDstSize() {
        MemorySegment s = pDstSizeRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new PointerPtr(s);
    }

    public void pDstSize(@Nullable PointerPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pDstSizeRaw(s);
    }

    public VkDeviceOrHostAddressKHR dstData() {
        return new VkDeviceOrHostAddressKHR(segment.asSlice(OFFSET$dstData, LAYOUT$dstData));
    }

    public void dstData(VkDeviceOrHostAddressKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$dstData, SIZE$dstData);
    }

    public @enumtype(VkComponentTypeKHR.class) int srcComponentType() {
        return segment.get(LAYOUT$srcComponentType, OFFSET$srcComponentType);
    }

    public void srcComponentType(@enumtype(VkComponentTypeKHR.class) int value) {
        segment.set(LAYOUT$srcComponentType, OFFSET$srcComponentType, value);
    }

    public @enumtype(VkComponentTypeKHR.class) int dstComponentType() {
        return segment.get(LAYOUT$dstComponentType, OFFSET$dstComponentType);
    }

    public void dstComponentType(@enumtype(VkComponentTypeKHR.class) int value) {
        segment.set(LAYOUT$dstComponentType, OFFSET$dstComponentType, value);
    }

    public @unsigned int numRows() {
        return segment.get(LAYOUT$numRows, OFFSET$numRows);
    }

    public void numRows(@unsigned int value) {
        segment.set(LAYOUT$numRows, OFFSET$numRows, value);
    }

    public @unsigned int numColumns() {
        return segment.get(LAYOUT$numColumns, OFFSET$numColumns);
    }

    public void numColumns(@unsigned int value) {
        segment.set(LAYOUT$numColumns, OFFSET$numColumns, value);
    }

    public @enumtype(VkCooperativeVectorMatrixLayoutNV.class) int srcLayout() {
        return segment.get(LAYOUT$srcLayout, OFFSET$srcLayout);
    }

    public void srcLayout(@enumtype(VkCooperativeVectorMatrixLayoutNV.class) int value) {
        segment.set(LAYOUT$srcLayout, OFFSET$srcLayout, value);
    }

    public @unsigned long srcStride() {
        return NativeLayout.readCSizeT(segment, OFFSET$srcStride);
    }

    public void srcStride(@unsigned long value) {
        NativeLayout.writeCSizeT(segment, OFFSET$srcStride, value);
    }

    public @enumtype(VkCooperativeVectorMatrixLayoutNV.class) int dstLayout() {
        return segment.get(LAYOUT$dstLayout, OFFSET$dstLayout);
    }

    public void dstLayout(@enumtype(VkCooperativeVectorMatrixLayoutNV.class) int value) {
        segment.set(LAYOUT$dstLayout, OFFSET$dstLayout, value);
    }

    public @unsigned long dstStride() {
        return NativeLayout.readCSizeT(segment, OFFSET$dstStride);
    }

    public void dstStride(@unsigned long value) {
        NativeLayout.writeCSizeT(segment, OFFSET$dstStride, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        NativeLayout.C_SIZE_T.withName("srcSize"),
        VkDeviceOrHostAddressConstKHR.LAYOUT.withName("srcData"),
        ValueLayout.ADDRESS.withTargetLayout(NativeLayout.C_SIZE_T).withName("pDstSize"),
        VkDeviceOrHostAddressKHR.LAYOUT.withName("dstData"),
        ValueLayout.JAVA_INT.withName("srcComponentType"),
        ValueLayout.JAVA_INT.withName("dstComponentType"),
        ValueLayout.JAVA_INT.withName("numRows"),
        ValueLayout.JAVA_INT.withName("numColumns"),
        ValueLayout.JAVA_INT.withName("srcLayout"),
        NativeLayout.C_SIZE_T.withName("srcStride"),
        ValueLayout.JAVA_INT.withName("dstLayout"),
        NativeLayout.C_SIZE_T.withName("dstStride")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$srcSize = PathElement.groupElement("PATH$srcSize");
    public static final PathElement PATH$srcData = PathElement.groupElement("PATH$srcData");
    public static final PathElement PATH$pDstSize = PathElement.groupElement("PATH$pDstSize");
    public static final PathElement PATH$dstData = PathElement.groupElement("PATH$dstData");
    public static final PathElement PATH$srcComponentType = PathElement.groupElement("PATH$srcComponentType");
    public static final PathElement PATH$dstComponentType = PathElement.groupElement("PATH$dstComponentType");
    public static final PathElement PATH$numRows = PathElement.groupElement("PATH$numRows");
    public static final PathElement PATH$numColumns = PathElement.groupElement("PATH$numColumns");
    public static final PathElement PATH$srcLayout = PathElement.groupElement("PATH$srcLayout");
    public static final PathElement PATH$srcStride = PathElement.groupElement("PATH$srcStride");
    public static final PathElement PATH$dstLayout = PathElement.groupElement("PATH$dstLayout");
    public static final PathElement PATH$dstStride = PathElement.groupElement("PATH$dstStride");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final StructLayout LAYOUT$srcData = (StructLayout) LAYOUT.select(PATH$srcData);
    public static final AddressLayout LAYOUT$pDstSize = (AddressLayout) LAYOUT.select(PATH$pDstSize);
    public static final StructLayout LAYOUT$dstData = (StructLayout) LAYOUT.select(PATH$dstData);
    public static final OfInt LAYOUT$srcComponentType = (OfInt) LAYOUT.select(PATH$srcComponentType);
    public static final OfInt LAYOUT$dstComponentType = (OfInt) LAYOUT.select(PATH$dstComponentType);
    public static final OfInt LAYOUT$numRows = (OfInt) LAYOUT.select(PATH$numRows);
    public static final OfInt LAYOUT$numColumns = (OfInt) LAYOUT.select(PATH$numColumns);
    public static final OfInt LAYOUT$srcLayout = (OfInt) LAYOUT.select(PATH$srcLayout);
    public static final OfInt LAYOUT$dstLayout = (OfInt) LAYOUT.select(PATH$dstLayout);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$srcSize = NativeLayout.C_SIZE_T.byteSize();
    public static final long SIZE$srcData = LAYOUT$srcData.byteSize();
    public static final long SIZE$pDstSize = LAYOUT$pDstSize.byteSize();
    public static final long SIZE$dstData = LAYOUT$dstData.byteSize();
    public static final long SIZE$srcComponentType = LAYOUT$srcComponentType.byteSize();
    public static final long SIZE$dstComponentType = LAYOUT$dstComponentType.byteSize();
    public static final long SIZE$numRows = LAYOUT$numRows.byteSize();
    public static final long SIZE$numColumns = LAYOUT$numColumns.byteSize();
    public static final long SIZE$srcLayout = LAYOUT$srcLayout.byteSize();
    public static final long SIZE$srcStride = NativeLayout.C_SIZE_T.byteSize();
    public static final long SIZE$dstLayout = LAYOUT$dstLayout.byteSize();
    public static final long SIZE$dstStride = NativeLayout.C_SIZE_T.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$srcSize = LAYOUT.byteOffset(PATH$srcSize);
    public static final long OFFSET$srcData = LAYOUT.byteOffset(PATH$srcData);
    public static final long OFFSET$pDstSize = LAYOUT.byteOffset(PATH$pDstSize);
    public static final long OFFSET$dstData = LAYOUT.byteOffset(PATH$dstData);
    public static final long OFFSET$srcComponentType = LAYOUT.byteOffset(PATH$srcComponentType);
    public static final long OFFSET$dstComponentType = LAYOUT.byteOffset(PATH$dstComponentType);
    public static final long OFFSET$numRows = LAYOUT.byteOffset(PATH$numRows);
    public static final long OFFSET$numColumns = LAYOUT.byteOffset(PATH$numColumns);
    public static final long OFFSET$srcLayout = LAYOUT.byteOffset(PATH$srcLayout);
    public static final long OFFSET$srcStride = LAYOUT.byteOffset(PATH$srcStride);
    public static final long OFFSET$dstLayout = LAYOUT.byteOffset(PATH$dstLayout);
    public static final long OFFSET$dstStride = LAYOUT.byteOffset(PATH$dstStride);
}
