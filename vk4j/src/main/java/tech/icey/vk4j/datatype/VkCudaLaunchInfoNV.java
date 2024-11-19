package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.*;
import tech.icey.panama.buffer.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// {@snippet lang=c :
/// typedef struct VkCudaLaunchInfoNV {
///     VkStructureType sType;
///     const void* pNext;
///     VkCudaFunctionNV function;
///     uint32_t gridDimX;
///     uint32_t gridDimY;
///     uint32_t gridDimZ;
///     uint32_t blockDimX;
///     uint32_t blockDimY;
///     uint32_t blockDimZ;
///     uint32_t sharedMemBytes;
///     size_t paramCount;
///     const void* const * pParams;
///     size_t extraCount;
///     const void* const * pExtras;
/// } VkCudaLaunchInfoNV;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkCudaLaunchInfoNV.html">VkCudaLaunchInfoNV</a>
public record VkCudaLaunchInfoNV(MemorySegment segment) implements IPointer {
    public VkCudaLaunchInfoNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_CUDA_LAUNCH_INFO_NV);
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

    public void pNext(@Nullable IPointer pointer) {
        pNext(pointer == null ? MemorySegment.NULL : pointer.segment());
    }

    public @Nullable VkCudaFunctionNV function() {
        MemorySegment s = segment.get(LAYOUT$function, OFFSET$function);
        if (s.address() == 0) {
            return null;
        }
        return new VkCudaFunctionNV(s);
    }

    public void function(@Nullable VkCudaFunctionNV value) {
        segment.set(
            LAYOUT$function,
            OFFSET$function,
            value != null ? value.segment() : MemorySegment.NULL
        );
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

    public void pParams(@Nullable IPointer pointer) {
        pParams(pointer == null ? MemorySegment.NULL : pointer.segment());
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

    public void pExtras(@Nullable IPointer pointer) {
        pExtras(pointer == null ? MemorySegment.NULL : pointer.segment());
    }

    public static VkCudaLaunchInfoNV allocate(Arena arena) {
        return new VkCudaLaunchInfoNV(arena.allocate(LAYOUT));
    }

    public static VkCudaLaunchInfoNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkCudaLaunchInfoNV[] ret = new VkCudaLaunchInfoNV[count];
        for (int i = 0; i < count; i++) {
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
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("function"),
        ValueLayout.JAVA_INT.withName("gridDimX"),
        ValueLayout.JAVA_INT.withName("gridDimY"),
        ValueLayout.JAVA_INT.withName("gridDimZ"),
        ValueLayout.JAVA_INT.withName("blockDimX"),
        ValueLayout.JAVA_INT.withName("blockDimY"),
        ValueLayout.JAVA_INT.withName("blockDimZ"),
        ValueLayout.JAVA_INT.withName("sharedMemBytes"),
        NativeLayout.C_SIZE_T.withName("paramCount"),
        ValueLayout.ADDRESS.withName("pParams"),
        NativeLayout.C_SIZE_T.withName("extraCount"),
        ValueLayout.ADDRESS.withName("pExtras")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$function = PathElement.groupElement("function");
    public static final PathElement PATH$gridDimX = PathElement.groupElement("gridDimX");
    public static final PathElement PATH$gridDimY = PathElement.groupElement("gridDimY");
    public static final PathElement PATH$gridDimZ = PathElement.groupElement("gridDimZ");
    public static final PathElement PATH$blockDimX = PathElement.groupElement("blockDimX");
    public static final PathElement PATH$blockDimY = PathElement.groupElement("blockDimY");
    public static final PathElement PATH$blockDimZ = PathElement.groupElement("blockDimZ");
    public static final PathElement PATH$sharedMemBytes = PathElement.groupElement("sharedMemBytes");
    public static final PathElement PATH$paramCount = PathElement.groupElement("paramCount");
    public static final PathElement PATH$pParams = PathElement.groupElement("pParams");
    public static final PathElement PATH$extraCount = PathElement.groupElement("extraCount");
    public static final PathElement PATH$pExtras = PathElement.groupElement("pExtras");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$function = (AddressLayout) LAYOUT.select(PATH$function);
    public static final OfInt LAYOUT$gridDimX = (OfInt) LAYOUT.select(PATH$gridDimX);
    public static final OfInt LAYOUT$gridDimY = (OfInt) LAYOUT.select(PATH$gridDimY);
    public static final OfInt LAYOUT$gridDimZ = (OfInt) LAYOUT.select(PATH$gridDimZ);
    public static final OfInt LAYOUT$blockDimX = (OfInt) LAYOUT.select(PATH$blockDimX);
    public static final OfInt LAYOUT$blockDimY = (OfInt) LAYOUT.select(PATH$blockDimY);
    public static final OfInt LAYOUT$blockDimZ = (OfInt) LAYOUT.select(PATH$blockDimZ);
    public static final OfInt LAYOUT$sharedMemBytes = (OfInt) LAYOUT.select(PATH$sharedMemBytes);
    public static final AddressLayout LAYOUT$pParams = (AddressLayout) LAYOUT.select(PATH$pParams);
    public static final AddressLayout LAYOUT$pExtras = (AddressLayout) LAYOUT.select(PATH$pExtras);

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
    public static final long SIZE$pParams = LAYOUT$pParams.byteSize();
    public static final long SIZE$pExtras = LAYOUT$pExtras.byteSize();
}
