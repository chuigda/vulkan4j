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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDevice16BitStorageFeatures.html"><code>VkPhysicalDevice16BitStorageFeatures</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPhysicalDevice16BitStorageFeatures {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkBool32 storageBuffer16BitAccess; // @link substring="storageBuffer16BitAccess" target="#storageBuffer16BitAccess"
///     VkBool32 uniformAndStorageBuffer16BitAccess; // @link substring="uniformAndStorageBuffer16BitAccess" target="#uniformAndStorageBuffer16BitAccess"
///     VkBool32 storagePushConstant16; // @link substring="storagePushConstant16" target="#storagePushConstant16"
///     VkBool32 storageInputOutput16; // @link substring="storageInputOutput16" target="#storageInputOutput16"
/// } VkPhysicalDevice16BitStorageFeatures;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_16BIT_STORAGE_FEATURES`
///
/// The {@code allocate} ({@link VkPhysicalDevice16BitStorageFeatures#allocate(Arena)}, {@link VkPhysicalDevice16BitStorageFeatures#allocate(Arena, int)})
/// functions will automatically initialize these fields. Also, you may call {@link VkPhysicalDevice16BitStorageFeatures#autoInit}
/// to initialize these fields manually for non-allocated instances.
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDevice16BitStorageFeatures.html"><code>VkPhysicalDevice16BitStorageFeatures</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDevice16BitStorageFeatures(@NotNull MemorySegment segment) implements IPointer {
    public static VkPhysicalDevice16BitStorageFeatures allocate(Arena arena) {
        VkPhysicalDevice16BitStorageFeatures ret = new VkPhysicalDevice16BitStorageFeatures(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PHYSICAL_DEVICE_16BIT_STORAGE_FEATURES);
        return ret;
    }

    public static VkPhysicalDevice16BitStorageFeatures[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDevice16BitStorageFeatures[] ret = new VkPhysicalDevice16BitStorageFeatures[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDevice16BitStorageFeatures(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.PHYSICAL_DEVICE_16BIT_STORAGE_FEATURES);
        }
        return ret;
    }

    public static VkPhysicalDevice16BitStorageFeatures clone(Arena arena, VkPhysicalDevice16BitStorageFeatures src) {
        VkPhysicalDevice16BitStorageFeatures ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDevice16BitStorageFeatures[] clone(Arena arena, VkPhysicalDevice16BitStorageFeatures[] src) {
        VkPhysicalDevice16BitStorageFeatures[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PHYSICAL_DEVICE_16BIT_STORAGE_FEATURES);
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

    public @unsigned int storageBuffer16BitAccess() {
        return segment.get(LAYOUT$storageBuffer16BitAccess, OFFSET$storageBuffer16BitAccess);
    }

    public void storageBuffer16BitAccess(@unsigned int value) {
        segment.set(LAYOUT$storageBuffer16BitAccess, OFFSET$storageBuffer16BitAccess, value);
    }

    public @unsigned int uniformAndStorageBuffer16BitAccess() {
        return segment.get(LAYOUT$uniformAndStorageBuffer16BitAccess, OFFSET$uniformAndStorageBuffer16BitAccess);
    }

    public void uniformAndStorageBuffer16BitAccess(@unsigned int value) {
        segment.set(LAYOUT$uniformAndStorageBuffer16BitAccess, OFFSET$uniformAndStorageBuffer16BitAccess, value);
    }

    public @unsigned int storagePushConstant16() {
        return segment.get(LAYOUT$storagePushConstant16, OFFSET$storagePushConstant16);
    }

    public void storagePushConstant16(@unsigned int value) {
        segment.set(LAYOUT$storagePushConstant16, OFFSET$storagePushConstant16, value);
    }

    public @unsigned int storageInputOutput16() {
        return segment.get(LAYOUT$storageInputOutput16, OFFSET$storageInputOutput16);
    }

    public void storageInputOutput16(@unsigned int value) {
        segment.set(LAYOUT$storageInputOutput16, OFFSET$storageInputOutput16, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("storageBuffer16BitAccess"),
        ValueLayout.JAVA_INT.withName("uniformAndStorageBuffer16BitAccess"),
        ValueLayout.JAVA_INT.withName("storagePushConstant16"),
        ValueLayout.JAVA_INT.withName("storageInputOutput16")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$storageBuffer16BitAccess = PathElement.groupElement("PATH$storageBuffer16BitAccess");
    public static final PathElement PATH$uniformAndStorageBuffer16BitAccess = PathElement.groupElement("PATH$uniformAndStorageBuffer16BitAccess");
    public static final PathElement PATH$storagePushConstant16 = PathElement.groupElement("PATH$storagePushConstant16");
    public static final PathElement PATH$storageInputOutput16 = PathElement.groupElement("PATH$storageInputOutput16");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$storageBuffer16BitAccess = (OfInt) LAYOUT.select(PATH$storageBuffer16BitAccess);
    public static final OfInt LAYOUT$uniformAndStorageBuffer16BitAccess = (OfInt) LAYOUT.select(PATH$uniformAndStorageBuffer16BitAccess);
    public static final OfInt LAYOUT$storagePushConstant16 = (OfInt) LAYOUT.select(PATH$storagePushConstant16);
    public static final OfInt LAYOUT$storageInputOutput16 = (OfInt) LAYOUT.select(PATH$storageInputOutput16);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$storageBuffer16BitAccess = LAYOUT$storageBuffer16BitAccess.byteSize();
    public static final long SIZE$uniformAndStorageBuffer16BitAccess = LAYOUT$uniformAndStorageBuffer16BitAccess.byteSize();
    public static final long SIZE$storagePushConstant16 = LAYOUT$storagePushConstant16.byteSize();
    public static final long SIZE$storageInputOutput16 = LAYOUT$storageInputOutput16.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$storageBuffer16BitAccess = LAYOUT.byteOffset(PATH$storageBuffer16BitAccess);
    public static final long OFFSET$uniformAndStorageBuffer16BitAccess = LAYOUT.byteOffset(PATH$uniformAndStorageBuffer16BitAccess);
    public static final long OFFSET$storagePushConstant16 = LAYOUT.byteOffset(PATH$storagePushConstant16);
    public static final long OFFSET$storageInputOutput16 = LAYOUT.byteOffset(PATH$storageInputOutput16);
}
