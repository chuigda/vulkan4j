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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkCudaLaunchInfoNV.html">VkCudaLaunchInfoNV</a>
@ValueBasedCandidate
public record VkCudaLaunchInfoNV(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final AddressLayout LAYOUT$function = ValueLayout.ADDRESS.withName("function");
    public static final OfInt LAYOUT$gridDimX = ValueLayout.JAVA_INT.withName("gridDimX");
    public static final OfInt LAYOUT$gridDimY = ValueLayout.JAVA_INT.withName("gridDimY");
    public static final OfInt LAYOUT$gridDimZ = ValueLayout.JAVA_INT.withName("gridDimZ");
    public static final OfInt LAYOUT$blockDimX = ValueLayout.JAVA_INT.withName("blockDimX");
    public static final OfInt LAYOUT$blockDimY = ValueLayout.JAVA_INT.withName("blockDimY");
    public static final OfInt LAYOUT$blockDimZ = ValueLayout.JAVA_INT.withName("blockDimZ");
    public static final OfInt LAYOUT$sharedMemBytes = ValueLayout.JAVA_INT.withName("sharedMemBytes");
    public static final ValueLayout LAYOUT$paramCount = NativeLayout.C_SIZE_T.withName("paramCount");
    public static final AddressLayout LAYOUT$pParams = ValueLayout.ADDRESS.withName("pParams");
    public static final ValueLayout LAYOUT$extraCount = NativeLayout.C_SIZE_T.withName("extraCount");
    public static final AddressLayout LAYOUT$pExtras = ValueLayout.ADDRESS.withName("pExtras");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$function, LAYOUT$gridDimX, LAYOUT$gridDimY, LAYOUT$gridDimZ, LAYOUT$blockDimX, LAYOUT$blockDimY, LAYOUT$blockDimZ, LAYOUT$sharedMemBytes, LAYOUT$paramCount, LAYOUT$pParams, LAYOUT$extraCount, LAYOUT$pExtras);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkCudaLaunchInfoNV allocate(Arena arena) {
        return new VkCudaLaunchInfoNV(arena.allocate(LAYOUT));
    }

    public static VkCudaLaunchInfoNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkCudaLaunchInfoNV[] ret = new VkCudaLaunchInfoNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkCudaLaunchInfoNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkCudaLaunchInfoNV clone(Arena arena, VkCudaLaunchInfoNV src) {
        VkCudaLaunchInfoNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkCudaLaunchInfoNV[] clone(Arena arena, VkCudaLaunchInfoNV[] src) {
        VkCudaLaunchInfoNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$function = PathElement.groupElement("PATH$function");
    public static final PathElement PATH$gridDimX = PathElement.groupElement("PATH$gridDimX");
    public static final PathElement PATH$gridDimY = PathElement.groupElement("PATH$gridDimY");
    public static final PathElement PATH$gridDimZ = PathElement.groupElement("PATH$gridDimZ");
    public static final PathElement PATH$blockDimX = PathElement.groupElement("PATH$blockDimX");
    public static final PathElement PATH$blockDimY = PathElement.groupElement("PATH$blockDimY");
    public static final PathElement PATH$blockDimZ = PathElement.groupElement("PATH$blockDimZ");
    public static final PathElement PATH$sharedMemBytes = PathElement.groupElement("PATH$sharedMemBytes");
    public static final PathElement PATH$paramCount = PathElement.groupElement("PATH$paramCount");
    public static final PathElement PATH$pParams = PathElement.groupElement("PATH$pParams");
    public static final PathElement PATH$extraCount = PathElement.groupElement("PATH$extraCount");
    public static final PathElement PATH$pExtras = PathElement.groupElement("PATH$pExtras");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$function = LAYOUT$function.byteSize();
    public static final long SIZE$gridDimX = LAYOUT$gridDimX.byteSize();
    public static final long SIZE$gridDimY = LAYOUT$gridDimY.byteSize();
    public static final long SIZE$gridDimZ = LAYOUT$gridDimZ.byteSize();
    public static final long SIZE$blockDimX = LAYOUT$blockDimX.byteSize();
    public static final long SIZE$blockDimY = LAYOUT$blockDimY.byteSize();
    public static final long SIZE$blockDimZ = LAYOUT$blockDimZ.byteSize();
    public static final long SIZE$sharedMemBytes = LAYOUT$sharedMemBytes.byteSize();
    public static final long SIZE$paramCount = NativeLayout.C_SIZE_T.byteSize();
    public static final long SIZE$pParams = LAYOUT$pParams.byteSize();
    public static final long SIZE$extraCount = NativeLayout.C_SIZE_T.byteSize();
    public static final long SIZE$pExtras = LAYOUT$pExtras.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$function = LAYOUT.byteOffset(PATH$function);
    public static final long OFFSET$gridDimX = LAYOUT.byteOffset(PATH$gridDimX);
    public static final long OFFSET$gridDimY = LAYOUT.byteOffset(PATH$gridDimY);
    public static final long OFFSET$gridDimZ = LAYOUT.byteOffset(PATH$gridDimZ);
    public static final long OFFSET$blockDimX = LAYOUT.byteOffset(PATH$blockDimX);
    public static final long OFFSET$blockDimY = LAYOUT.byteOffset(PATH$blockDimY);
    public static final long OFFSET$blockDimZ = LAYOUT.byteOffset(PATH$blockDimZ);
    public static final long OFFSET$sharedMemBytes = LAYOUT.byteOffset(PATH$sharedMemBytes);
    public static final long OFFSET$paramCount = LAYOUT.byteOffset(PATH$paramCount);
    public static final long OFFSET$pParams = LAYOUT.byteOffset(PATH$pParams);
    public static final long OFFSET$extraCount = LAYOUT.byteOffset(PATH$extraCount);
    public static final long OFFSET$pExtras = LAYOUT.byteOffset(PATH$pExtras);

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

    public @Nullable VkCudaFunctionNV function() {
        MemorySegment s = segment.asSlice(OFFSET$function, SIZE$function);
        if (s.address() == 0) {
            return null;
        }
        return new VkCudaFunctionNV(s);
    }

    public void function(@Nullable VkCudaFunctionNV value) {
        segment.set(LAYOUT$function, OFFSET$function, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @unsigned int gridDimX() {
        return segment.get(LAYOUT$gridDimX, OFFSET$gridDimX);
    }

    public void gridDimX(@unsigned int value) {
        segment.set(LAYOUT$gridDimX, OFFSET$gridDimX, value);
    }

    public @unsigned int gridDimY() {
        return segment.get(LAYOUT$gridDimY, OFFSET$gridDimY);
    }

    public void gridDimY(@unsigned int value) {
        segment.set(LAYOUT$gridDimY, OFFSET$gridDimY, value);
    }

    public @unsigned int gridDimZ() {
        return segment.get(LAYOUT$gridDimZ, OFFSET$gridDimZ);
    }

    public void gridDimZ(@unsigned int value) {
        segment.set(LAYOUT$gridDimZ, OFFSET$gridDimZ, value);
    }

    public @unsigned int blockDimX() {
        return segment.get(LAYOUT$blockDimX, OFFSET$blockDimX);
    }

    public void blockDimX(@unsigned int value) {
        segment.set(LAYOUT$blockDimX, OFFSET$blockDimX, value);
    }

    public @unsigned int blockDimY() {
        return segment.get(LAYOUT$blockDimY, OFFSET$blockDimY);
    }

    public void blockDimY(@unsigned int value) {
        segment.set(LAYOUT$blockDimY, OFFSET$blockDimY, value);
    }

    public @unsigned int blockDimZ() {
        return segment.get(LAYOUT$blockDimZ, OFFSET$blockDimZ);
    }

    public void blockDimZ(@unsigned int value) {
        segment.set(LAYOUT$blockDimZ, OFFSET$blockDimZ, value);
    }

    public @unsigned int sharedMemBytes() {
        return segment.get(LAYOUT$sharedMemBytes, OFFSET$sharedMemBytes);
    }

    public void sharedMemBytes(@unsigned int value) {
        segment.set(LAYOUT$sharedMemBytes, OFFSET$sharedMemBytes, value);
    }

    public @unsigned long paramCount() {
        return NativeLayout.readCSizeT(segment, OFFSET$paramCount);
    }

    public void paramCount(@unsigned long value) {
        NativeLayout.writeCSizeT(segment, OFFSET$paramCount, value);
    }

    public @pointer(comment="void*") MemorySegment pParams() {
        return segment.get(LAYOUT$pParams, OFFSET$pParams);
    }

    public void pParams(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pParams, OFFSET$pParams, value);
    }

    public void pParams(IPointer pointer) {
        pParams(pointer.segment());
    }

    public @unsigned long extraCount() {
        return NativeLayout.readCSizeT(segment, OFFSET$extraCount);
    }

    public void extraCount(@unsigned long value) {
        NativeLayout.writeCSizeT(segment, OFFSET$extraCount, value);
    }

    public @pointer(comment="void*") MemorySegment pExtras() {
        return segment.get(LAYOUT$pExtras, OFFSET$pExtras);
    }

    public void pExtras(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pExtras, OFFSET$pExtras, value);
    }

    public void pExtras(IPointer pointer) {
        pExtras(pointer.segment());
    }

}
