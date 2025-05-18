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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM.html"><code>VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void* pNext; // optional // @link substring="pNext" target="#pNext"
///     uint64_t shaderCoreMask; // @link substring="shaderCoreMask" target="#shaderCoreMask"
///     uint32_t shaderCoreCount; // @link substring="shaderCoreCount" target="#shaderCoreCount"
///     uint32_t shaderWarpsPerCore; // @link substring="shaderWarpsPerCore" target="#shaderWarpsPerCore"
/// } VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CORE_BUILTINS_PROPERTIES_ARM`
///
/// The {@code allocate} ({@link VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM#allocate(Arena)}, {@link VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM#allocate(Arena, int)})
/// functions will automatically initialize these fields. Also, you may call {@link VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM#autoInit}
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM.html"><code>VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM(@NotNull MemorySegment segment) implements IPointer {
    public static VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM allocate(Arena arena) {
        VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM ret = new VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PHYSICAL_DEVICE_SHADER_CORE_BUILTINS_PROPERTIES_ARM);
        return ret;
    }

    public static VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM[] ret = new VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.PHYSICAL_DEVICE_SHADER_CORE_BUILTINS_PROPERTIES_ARM);
        }
        return ret;
    }

    public static VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM clone(Arena arena, VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM src) {
        VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM[] clone(Arena arena, VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM[] src) {
        VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PHYSICAL_DEVICE_SHADER_CORE_BUILTINS_PROPERTIES_ARM);
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

    public @unsigned long shaderCoreMask() {
        return segment.get(LAYOUT$shaderCoreMask, OFFSET$shaderCoreMask);
    }

    public void shaderCoreMask(@unsigned long value) {
        segment.set(LAYOUT$shaderCoreMask, OFFSET$shaderCoreMask, value);
    }

    public @unsigned int shaderCoreCount() {
        return segment.get(LAYOUT$shaderCoreCount, OFFSET$shaderCoreCount);
    }

    public void shaderCoreCount(@unsigned int value) {
        segment.set(LAYOUT$shaderCoreCount, OFFSET$shaderCoreCount, value);
    }

    public @unsigned int shaderWarpsPerCore() {
        return segment.get(LAYOUT$shaderWarpsPerCore, OFFSET$shaderWarpsPerCore);
    }

    public void shaderWarpsPerCore(@unsigned int value) {
        segment.set(LAYOUT$shaderWarpsPerCore, OFFSET$shaderWarpsPerCore, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("shaderCoreMask"),
        ValueLayout.JAVA_INT.withName("shaderCoreCount"),
        ValueLayout.JAVA_INT.withName("shaderWarpsPerCore")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$shaderCoreMask = PathElement.groupElement("PATH$shaderCoreMask");
    public static final PathElement PATH$shaderCoreCount = PathElement.groupElement("PATH$shaderCoreCount");
    public static final PathElement PATH$shaderWarpsPerCore = PathElement.groupElement("PATH$shaderWarpsPerCore");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfLong LAYOUT$shaderCoreMask = (OfLong) LAYOUT.select(PATH$shaderCoreMask);
    public static final OfInt LAYOUT$shaderCoreCount = (OfInt) LAYOUT.select(PATH$shaderCoreCount);
    public static final OfInt LAYOUT$shaderWarpsPerCore = (OfInt) LAYOUT.select(PATH$shaderWarpsPerCore);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$shaderCoreMask = LAYOUT$shaderCoreMask.byteSize();
    public static final long SIZE$shaderCoreCount = LAYOUT$shaderCoreCount.byteSize();
    public static final long SIZE$shaderWarpsPerCore = LAYOUT$shaderWarpsPerCore.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$shaderCoreMask = LAYOUT.byteOffset(PATH$shaderCoreMask);
    public static final long OFFSET$shaderCoreCount = LAYOUT.byteOffset(PATH$shaderCoreCount);
    public static final long OFFSET$shaderWarpsPerCore = LAYOUT.byteOffset(PATH$shaderWarpsPerCore);
}
