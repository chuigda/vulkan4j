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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceAntiLagFeaturesAMD.html"><code>VkPhysicalDeviceAntiLagFeaturesAMD</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceAntiLagFeaturesAMD {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 antiLag;
/// } VkPhysicalDeviceAntiLagFeaturesAMD;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ANTI_LAG_FEATURES_AMD`
///
/// The {@link VkPhysicalDeviceAntiLagFeaturesAMD#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkPhysicalDeviceAntiLagFeaturesAMD#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceAntiLagFeaturesAMD.html"><code>VkPhysicalDeviceAntiLagFeaturesAMD</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDeviceAntiLagFeaturesAMD(@NotNull MemorySegment segment) implements IPointer {
    public static VkPhysicalDeviceAntiLagFeaturesAMD allocate(Arena arena) {
        VkPhysicalDeviceAntiLagFeaturesAMD ret = new VkPhysicalDeviceAntiLagFeaturesAMD(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PHYSICAL_DEVICE_ANTI_LAG_FEATURES_AMD);
        return ret;
    }

    public static VkPhysicalDeviceAntiLagFeaturesAMD[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceAntiLagFeaturesAMD[] ret = new VkPhysicalDeviceAntiLagFeaturesAMD[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceAntiLagFeaturesAMD(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.PHYSICAL_DEVICE_ANTI_LAG_FEATURES_AMD);
        }
        return ret;
    }

    public static VkPhysicalDeviceAntiLagFeaturesAMD clone(Arena arena, VkPhysicalDeviceAntiLagFeaturesAMD src) {
        VkPhysicalDeviceAntiLagFeaturesAMD ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceAntiLagFeaturesAMD[] clone(Arena arena, VkPhysicalDeviceAntiLagFeaturesAMD[] src) {
        VkPhysicalDeviceAntiLagFeaturesAMD[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PHYSICAL_DEVICE_ANTI_LAG_FEATURES_AMD);
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

    public @unsigned int antiLag() {
        return segment.get(LAYOUT$antiLag, OFFSET$antiLag);
    }

    public void antiLag(@unsigned int value) {
        segment.set(LAYOUT$antiLag, OFFSET$antiLag, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("antiLag")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$antiLag = PathElement.groupElement("PATH$antiLag");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$antiLag = (OfInt) LAYOUT.select(PATH$antiLag);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$antiLag = LAYOUT$antiLag.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$antiLag = LAYOUT.byteOffset(PATH$antiLag);
}
