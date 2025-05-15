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

public record VkCooperativeVectorPropertiesNV(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$inputType = ValueLayout.JAVA_INT.withName("inputType");
    public static final OfInt LAYOUT$inputInterpretation = ValueLayout.JAVA_INT.withName("inputInterpretation");
    public static final OfInt LAYOUT$matrixInterpretation = ValueLayout.JAVA_INT.withName("matrixInterpretation");
    public static final OfInt LAYOUT$biasInterpretation = ValueLayout.JAVA_INT.withName("biasInterpretation");
    public static final OfInt LAYOUT$resultType = ValueLayout.JAVA_INT.withName("resultType");
    public static final OfInt LAYOUT$transpose = ValueLayout.JAVA_INT.withName("transpose");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$inputType, LAYOUT$inputInterpretation, LAYOUT$matrixInterpretation, LAYOUT$biasInterpretation, LAYOUT$resultType, LAYOUT$transpose);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkCooperativeVectorPropertiesNV allocate(Arena arena) {
        return new VkCooperativeVectorPropertiesNV(arena.allocate(LAYOUT));
    }

    public static VkCooperativeVectorPropertiesNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkCooperativeVectorPropertiesNV[] ret = new VkCooperativeVectorPropertiesNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkCooperativeVectorPropertiesNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkCooperativeVectorPropertiesNV clone(Arena arena, VkCooperativeVectorPropertiesNV src) {
        VkCooperativeVectorPropertiesNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkCooperativeVectorPropertiesNV[] clone(Arena arena, VkCooperativeVectorPropertiesNV[] src) {
        VkCooperativeVectorPropertiesNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$inputType = PathElement.groupElement("PATH$inputType");
    public static final PathElement PATH$inputInterpretation = PathElement.groupElement("PATH$inputInterpretation");
    public static final PathElement PATH$matrixInterpretation = PathElement.groupElement("PATH$matrixInterpretation");
    public static final PathElement PATH$biasInterpretation = PathElement.groupElement("PATH$biasInterpretation");
    public static final PathElement PATH$resultType = PathElement.groupElement("PATH$resultType");
    public static final PathElement PATH$transpose = PathElement.groupElement("PATH$transpose");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$inputType = LAYOUT$inputType.byteSize();
    public static final long SIZE$inputInterpretation = LAYOUT$inputInterpretation.byteSize();
    public static final long SIZE$matrixInterpretation = LAYOUT$matrixInterpretation.byteSize();
    public static final long SIZE$biasInterpretation = LAYOUT$biasInterpretation.byteSize();
    public static final long SIZE$resultType = LAYOUT$resultType.byteSize();
    public static final long SIZE$transpose = LAYOUT$transpose.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$inputType = LAYOUT.byteOffset(PATH$inputType);
    public static final long OFFSET$inputInterpretation = LAYOUT.byteOffset(PATH$inputInterpretation);
    public static final long OFFSET$matrixInterpretation = LAYOUT.byteOffset(PATH$matrixInterpretation);
    public static final long OFFSET$biasInterpretation = LAYOUT.byteOffset(PATH$biasInterpretation);
    public static final long OFFSET$resultType = LAYOUT.byteOffset(PATH$resultType);
    public static final long OFFSET$transpose = LAYOUT.byteOffset(PATH$transpose);

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

    public @enumtype(VkComponentTypeKHR.class) int inputType() {
        return segment.get(LAYOUT$inputType, OFFSET$inputType);
    }

    public void inputType(@enumtype(VkComponentTypeKHR.class) int value) {
        segment.set(LAYOUT$inputType, OFFSET$inputType, value);
    }

    public @enumtype(VkComponentTypeKHR.class) int inputInterpretation() {
        return segment.get(LAYOUT$inputInterpretation, OFFSET$inputInterpretation);
    }

    public void inputInterpretation(@enumtype(VkComponentTypeKHR.class) int value) {
        segment.set(LAYOUT$inputInterpretation, OFFSET$inputInterpretation, value);
    }

    public @enumtype(VkComponentTypeKHR.class) int matrixInterpretation() {
        return segment.get(LAYOUT$matrixInterpretation, OFFSET$matrixInterpretation);
    }

    public void matrixInterpretation(@enumtype(VkComponentTypeKHR.class) int value) {
        segment.set(LAYOUT$matrixInterpretation, OFFSET$matrixInterpretation, value);
    }

    public @enumtype(VkComponentTypeKHR.class) int biasInterpretation() {
        return segment.get(LAYOUT$biasInterpretation, OFFSET$biasInterpretation);
    }

    public void biasInterpretation(@enumtype(VkComponentTypeKHR.class) int value) {
        segment.set(LAYOUT$biasInterpretation, OFFSET$biasInterpretation, value);
    }

    public @enumtype(VkComponentTypeKHR.class) int resultType() {
        return segment.get(LAYOUT$resultType, OFFSET$resultType);
    }

    public void resultType(@enumtype(VkComponentTypeKHR.class) int value) {
        segment.set(LAYOUT$resultType, OFFSET$resultType, value);
    }

    public @unsigned int transpose() {
        return segment.get(LAYOUT$transpose, OFFSET$transpose);
    }

    public void transpose(@unsigned int value) {
        segment.set(LAYOUT$transpose, OFFSET$transpose, value);
    }

}
/// dummy, not implemented yet
