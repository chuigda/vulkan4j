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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceLayeredApiPropertiesListKHR.html"><code>VkPhysicalDeviceLayeredApiPropertiesListKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceLayeredApiPropertiesListKHR {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void* pNext; // optional // @link substring="pNext" target="#pNext"
///     uint32_t layeredApiCount; // optional // @link substring="layeredApiCount" target="#layeredApiCount"
///     VkPhysicalDeviceLayeredApiPropertiesKHR* pLayeredApis; // optional // @link substring="VkPhysicalDeviceLayeredApiPropertiesKHR" target="VkPhysicalDeviceLayeredApiPropertiesKHR" @link substring="pLayeredApis" target="#pLayeredApis"
/// } VkPhysicalDeviceLayeredApiPropertiesListKHR;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LAYERED_API_PROPERTIES_LIST_KHR`
///
/// The {@link VkPhysicalDeviceLayeredApiPropertiesListKHR#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkPhysicalDeviceLayeredApiPropertiesListKHR#autoInit} to initialize these fields manually for
/// non-allocated instances.
///
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceLayeredApiPropertiesListKHR.html"><code>VkPhysicalDeviceLayeredApiPropertiesListKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDeviceLayeredApiPropertiesListKHR(@NotNull MemorySegment segment) implements IPointer {
    public static VkPhysicalDeviceLayeredApiPropertiesListKHR allocate(Arena arena) {
        VkPhysicalDeviceLayeredApiPropertiesListKHR ret = new VkPhysicalDeviceLayeredApiPropertiesListKHR(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PHYSICAL_DEVICE_LAYERED_API_PROPERTIES_LIST_KHR);
        return ret;
    }

    public static VkPhysicalDeviceLayeredApiPropertiesListKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceLayeredApiPropertiesListKHR[] ret = new VkPhysicalDeviceLayeredApiPropertiesListKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceLayeredApiPropertiesListKHR(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.PHYSICAL_DEVICE_LAYERED_API_PROPERTIES_LIST_KHR);
        }
        return ret;
    }

    public static VkPhysicalDeviceLayeredApiPropertiesListKHR clone(Arena arena, VkPhysicalDeviceLayeredApiPropertiesListKHR src) {
        VkPhysicalDeviceLayeredApiPropertiesListKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceLayeredApiPropertiesListKHR[] clone(Arena arena, VkPhysicalDeviceLayeredApiPropertiesListKHR[] src) {
        VkPhysicalDeviceLayeredApiPropertiesListKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PHYSICAL_DEVICE_LAYERED_API_PROPERTIES_LIST_KHR);
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

    public @unsigned int layeredApiCount() {
        return segment.get(LAYOUT$layeredApiCount, OFFSET$layeredApiCount);
    }

    public void layeredApiCount(@unsigned int value) {
        segment.set(LAYOUT$layeredApiCount, OFFSET$layeredApiCount, value);
    }

    public @Nullable VkPhysicalDeviceLayeredApiPropertiesKHR pLayeredApis() {
        MemorySegment s = pLayeredApisRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkPhysicalDeviceLayeredApiPropertiesKHR(s);
    }

    public void pLayeredApis(@Nullable VkPhysicalDeviceLayeredApiPropertiesKHR value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pLayeredApisRaw(s);
    }

    @unsafe public @Nullable VkPhysicalDeviceLayeredApiPropertiesKHR[] pLayeredApis(int assumedCount) {
        MemorySegment s = pLayeredApisRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkPhysicalDeviceLayeredApiPropertiesKHR.BYTES);
        VkPhysicalDeviceLayeredApiPropertiesKHR[] ret = new VkPhysicalDeviceLayeredApiPropertiesKHR[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkPhysicalDeviceLayeredApiPropertiesKHR(s.asSlice(i * VkPhysicalDeviceLayeredApiPropertiesKHR.BYTES, VkPhysicalDeviceLayeredApiPropertiesKHR.BYTES));
        }
        return ret;
    }

    public @pointer(target=VkPhysicalDeviceLayeredApiPropertiesKHR.class) MemorySegment pLayeredApisRaw() {
        return segment.get(LAYOUT$pLayeredApis, OFFSET$pLayeredApis);
    }

    public void pLayeredApisRaw(@pointer(target=VkPhysicalDeviceLayeredApiPropertiesKHR.class) MemorySegment value) {
        segment.set(LAYOUT$pLayeredApis, OFFSET$pLayeredApis, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("layeredApiCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkPhysicalDeviceLayeredApiPropertiesKHR.LAYOUT).withName("pLayeredApis")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$layeredApiCount = PathElement.groupElement("PATH$layeredApiCount");
    public static final PathElement PATH$pLayeredApis = PathElement.groupElement("PATH$pLayeredApis");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$layeredApiCount = (OfInt) LAYOUT.select(PATH$layeredApiCount);
    public static final AddressLayout LAYOUT$pLayeredApis = (AddressLayout) LAYOUT.select(PATH$pLayeredApis);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$layeredApiCount = LAYOUT$layeredApiCount.byteSize();
    public static final long SIZE$pLayeredApis = LAYOUT$pLayeredApis.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$layeredApiCount = LAYOUT.byteOffset(PATH$layeredApiCount);
    public static final long OFFSET$pLayeredApis = LAYOUT.byteOffset(PATH$pLayeredApis);
}
