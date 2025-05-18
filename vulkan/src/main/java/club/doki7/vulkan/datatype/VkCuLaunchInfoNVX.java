package club.doki7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import club.doki7.ffm.IPointer;
import club.doki7.ffm.NativeLayout;
import club.doki7.ffm.annotation.*;
import club.doki7.ffm.ptr.*;
import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.handle.*;
import club.doki7.vulkan.enumtype.*;
import static club.doki7.vulkan.VkConstants.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkCuLaunchInfoNVX.html"><code>VkCuLaunchInfoNVX</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkCuLaunchInfoNVX {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkCuFunctionNVX function; // @link substring="VkCuFunctionNVX" target="VkCuFunctionNVX" @link substring="function" target="#function"
///     uint32_t gridDimX; // @link substring="gridDimX" target="#gridDimX"
///     uint32_t gridDimY; // @link substring="gridDimY" target="#gridDimY"
///     uint32_t gridDimZ; // @link substring="gridDimZ" target="#gridDimZ"
///     uint32_t blockDimX; // @link substring="blockDimX" target="#blockDimX"
///     uint32_t blockDimY; // @link substring="blockDimY" target="#blockDimY"
///     uint32_t blockDimZ; // @link substring="blockDimZ" target="#blockDimZ"
///     uint32_t sharedMemBytes; // @link substring="sharedMemBytes" target="#sharedMemBytes"
///     size_t paramCount; // optional // @link substring="paramCount" target="#paramCount"
///     void const* pParams; // @link substring="pParams" target="#pParams"
///     size_t extraCount; // optional // @link substring="extraCount" target="#extraCount"
///     void const* pExtras; // @link substring="pExtras" target="#pExtras"
/// } VkCuLaunchInfoNVX;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_CU_LAUNCH_INFO_NVX`
///
/// The {@code allocate} ({@link VkCuLaunchInfoNVX#allocate(Arena)}, {@link VkCuLaunchInfoNVX#allocate(Arena, int)})
/// functions will automatically initialize these fields. Also, you may call {@link VkCuLaunchInfoNVX#autoInit}
/// to initialize these fields manually for non-allocated instances.
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkCuLaunchInfoNVX.html"><code>VkCuLaunchInfoNVX</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkCuLaunchInfoNVX(@NotNull MemorySegment segment) implements IPointer {
    public static VkCuLaunchInfoNVX allocate(Arena arena) {
        VkCuLaunchInfoNVX ret = new VkCuLaunchInfoNVX(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.CU_LAUNCH_INFO_NVX);
        return ret;
    }

    public static VkCuLaunchInfoNVX[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkCuLaunchInfoNVX[] ret = new VkCuLaunchInfoNVX[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkCuLaunchInfoNVX(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.CU_LAUNCH_INFO_NVX);
        }
        return ret;
    }

    public static VkCuLaunchInfoNVX clone(Arena arena, VkCuLaunchInfoNVX src) {
        VkCuLaunchInfoNVX ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkCuLaunchInfoNVX[] clone(Arena arena, VkCuLaunchInfoNVX[] src) {
        VkCuLaunchInfoNVX[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.CU_LAUNCH_INFO_NVX);
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
        pNext(pointer != null ? pointer.segment() : MemorySegment.NULL);
    }

    public @Nullable VkCuFunctionNVX function() {
        MemorySegment s = segment.asSlice(OFFSET$function, SIZE$function);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkCuFunctionNVX(s);
    }

    public void function(@Nullable VkCuFunctionNVX value) {
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

    public void pParams(@Nullable IPointer pointer) {
        pParams(pointer != null ? pointer.segment() : MemorySegment.NULL);
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
        pExtras(pointer != null ? pointer.segment() : MemorySegment.NULL);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
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
    public static final long BYTES = LAYOUT.byteSize();

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
}
