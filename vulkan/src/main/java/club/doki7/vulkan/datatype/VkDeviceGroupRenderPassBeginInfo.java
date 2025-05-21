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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDeviceGroupRenderPassBeginInfo.html"><code>VkDeviceGroupRenderPassBeginInfo</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkDeviceGroupRenderPassBeginInfo {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     uint32_t deviceMask; // @link substring="deviceMask" target="#deviceMask"
///     uint32_t deviceRenderAreaCount; // optional // @link substring="deviceRenderAreaCount" target="#deviceRenderAreaCount"
///     VkRect2D const* pDeviceRenderAreas; // @link substring="VkRect2D" target="VkRect2D" @link substring="pDeviceRenderAreas" target="#pDeviceRenderAreas"
/// } VkDeviceGroupRenderPassBeginInfo;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_DEVICE_GROUP_RENDER_PASS_BEGIN_INFO`
///
/// The {@code allocate} ({@link VkDeviceGroupRenderPassBeginInfo#allocate(Arena)}, {@link VkDeviceGroupRenderPassBeginInfo#allocate(Arena, int)})
/// functions will automatically initialize these fields. Also, you may call {@link VkDeviceGroupRenderPassBeginInfo#autoInit}
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDeviceGroupRenderPassBeginInfo.html"><code>VkDeviceGroupRenderPassBeginInfo</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkDeviceGroupRenderPassBeginInfo(@NotNull MemorySegment segment) implements IPointer {
    public static VkDeviceGroupRenderPassBeginInfo allocate(Arena arena) {
        VkDeviceGroupRenderPassBeginInfo ret = new VkDeviceGroupRenderPassBeginInfo(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.DEVICE_GROUP_RENDER_PASS_BEGIN_INFO);
        return ret;
    }

    public static VkDeviceGroupRenderPassBeginInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDeviceGroupRenderPassBeginInfo[] ret = new VkDeviceGroupRenderPassBeginInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkDeviceGroupRenderPassBeginInfo(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.DEVICE_GROUP_RENDER_PASS_BEGIN_INFO);
        }
        return ret;
    }

    public static VkDeviceGroupRenderPassBeginInfo clone(Arena arena, VkDeviceGroupRenderPassBeginInfo src) {
        VkDeviceGroupRenderPassBeginInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDeviceGroupRenderPassBeginInfo[] clone(Arena arena, VkDeviceGroupRenderPassBeginInfo[] src) {
        VkDeviceGroupRenderPassBeginInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.DEVICE_GROUP_RENDER_PASS_BEGIN_INFO);
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

    public @unsigned int deviceMask() {
        return segment.get(LAYOUT$deviceMask, OFFSET$deviceMask);
    }

    public void deviceMask(@unsigned int value) {
        segment.set(LAYOUT$deviceMask, OFFSET$deviceMask, value);
    }

    public @unsigned int deviceRenderAreaCount() {
        return segment.get(LAYOUT$deviceRenderAreaCount, OFFSET$deviceRenderAreaCount);
    }

    public void deviceRenderAreaCount(@unsigned int value) {
        segment.set(LAYOUT$deviceRenderAreaCount, OFFSET$deviceRenderAreaCount, value);
    }

    public @Nullable VkRect2D pDeviceRenderAreas() {
        MemorySegment s = pDeviceRenderAreasRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkRect2D(s);
    }

    public void pDeviceRenderAreas(@Nullable VkRect2D value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pDeviceRenderAreasRaw(s);
    }

    @unsafe public @Nullable VkRect2D[] pDeviceRenderAreas(int assumedCount) {
        MemorySegment s = pDeviceRenderAreasRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkRect2D.BYTES);
        VkRect2D[] ret = new VkRect2D[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkRect2D(s.asSlice(i * VkRect2D.BYTES, VkRect2D.BYTES));
        }
        return ret;
    }

    public @pointer(target=VkRect2D.class) MemorySegment pDeviceRenderAreasRaw() {
        return segment.get(LAYOUT$pDeviceRenderAreas, OFFSET$pDeviceRenderAreas);
    }

    public void pDeviceRenderAreasRaw(@pointer(target=VkRect2D.class) MemorySegment value) {
        segment.set(LAYOUT$pDeviceRenderAreas, OFFSET$pDeviceRenderAreas, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("deviceMask"),
        ValueLayout.JAVA_INT.withName("deviceRenderAreaCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkRect2D.LAYOUT).withName("pDeviceRenderAreas")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$deviceMask = PathElement.groupElement("deviceMask");
    public static final PathElement PATH$deviceRenderAreaCount = PathElement.groupElement("deviceRenderAreaCount");
    public static final PathElement PATH$pDeviceRenderAreas = PathElement.groupElement("pDeviceRenderAreas");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$deviceMask = (OfInt) LAYOUT.select(PATH$deviceMask);
    public static final OfInt LAYOUT$deviceRenderAreaCount = (OfInt) LAYOUT.select(PATH$deviceRenderAreaCount);
    public static final AddressLayout LAYOUT$pDeviceRenderAreas = (AddressLayout) LAYOUT.select(PATH$pDeviceRenderAreas);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$deviceMask = LAYOUT$deviceMask.byteSize();
    public static final long SIZE$deviceRenderAreaCount = LAYOUT$deviceRenderAreaCount.byteSize();
    public static final long SIZE$pDeviceRenderAreas = LAYOUT$pDeviceRenderAreas.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$deviceMask = LAYOUT.byteOffset(PATH$deviceMask);
    public static final long OFFSET$deviceRenderAreaCount = LAYOUT.byteOffset(PATH$deviceRenderAreaCount);
    public static final long OFFSET$pDeviceRenderAreas = LAYOUT.byteOffset(PATH$pDeviceRenderAreas);
}
