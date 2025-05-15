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

public record VkConvertCooperativeVectorMatrixInfoNV(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final ValueLayout LAYOUT$srcSize = NativeLayout.C_SIZE_T.withName("srcSize");
    public static final StructLayout LAYOUT$srcData = VkDeviceOrHostAddressConstKHR.LAYOUT.withName("srcData");
    public static final AddressLayout LAYOUT$pDstSize = ValueLayout.ADDRESS.withTargetLayout(NativeLayout.C_SIZE_T).withName("pDstSize");
    public static final StructLayout LAYOUT$dstData = VkDeviceOrHostAddressKHR.LAYOUT.withName("dstData");
    public static final OfInt LAYOUT$srcComponentType = ValueLayout.JAVA_INT.withName("srcComponentType");
    public static final OfInt LAYOUT$dstComponentType = ValueLayout.JAVA_INT.withName("dstComponentType");
    public static final OfInt LAYOUT$numRows = ValueLayout.JAVA_INT.withName("numRows");
    public static final OfInt LAYOUT$numColumns = ValueLayout.JAVA_INT.withName("numColumns");
    public static final OfInt LAYOUT$srcLayout = ValueLayout.JAVA_INT.withName("srcLayout");
    public static final ValueLayout LAYOUT$srcStride = NativeLayout.C_SIZE_T.withName("srcStride");
    public static final OfInt LAYOUT$dstLayout = ValueLayout.JAVA_INT.withName("dstLayout");
    public static final ValueLayout LAYOUT$dstStride = NativeLayout.C_SIZE_T.withName("dstStride");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$srcSize, LAYOUT$srcData, LAYOUT$pDstSize, LAYOUT$dstData, LAYOUT$srcComponentType, LAYOUT$dstComponentType, LAYOUT$numRows, LAYOUT$numColumns, LAYOUT$srcLayout, LAYOUT$srcStride, LAYOUT$dstLayout, LAYOUT$dstStride);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkConvertCooperativeVectorMatrixInfoNV allocate(Arena arena) {
        return new VkConvertCooperativeVectorMatrixInfoNV(arena.allocate(LAYOUT));
    }

    public static VkConvertCooperativeVectorMatrixInfoNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkConvertCooperativeVectorMatrixInfoNV[] ret = new VkConvertCooperativeVectorMatrixInfoNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkConvertCooperativeVectorMatrixInfoNV(segment.asSlice(i * SIZE, SIZE));
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
        if (s.address() == 0) {
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

}
/// dummy, not implemented yet
