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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPipelineDynamicStateCreateInfo.html"><code>VkPipelineDynamicStateCreateInfo</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPipelineDynamicStateCreateInfo {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkPipelineDynamicStateCreateFlags flags; // optional // @link substring="VkPipelineDynamicStateCreateFlags" target="VkPipelineDynamicStateCreateFlags" @link substring="flags" target="#flags"
///     uint32_t dynamicStateCount; // optional // @link substring="dynamicStateCount" target="#dynamicStateCount"
///     VkDynamicState const* pDynamicStates; // @link substring="VkDynamicState" target="VkDynamicState" @link substring="pDynamicStates" target="#pDynamicStates"
/// } VkPipelineDynamicStateCreateInfo;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PIPELINE_DYNAMIC_STATE_CREATE_INFO`
///
/// The {@code allocate} ({@link VkPipelineDynamicStateCreateInfo#allocate(Arena)}, {@link VkPipelineDynamicStateCreateInfo#allocate(Arena, int)})
/// functions will automatically initialize these fields. Also, you may call {@link VkPipelineDynamicStateCreateInfo#autoInit}
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPipelineDynamicStateCreateInfo.html"><code>VkPipelineDynamicStateCreateInfo</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPipelineDynamicStateCreateInfo(@NotNull MemorySegment segment) implements IPointer {
    public static VkPipelineDynamicStateCreateInfo allocate(Arena arena) {
        VkPipelineDynamicStateCreateInfo ret = new VkPipelineDynamicStateCreateInfo(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PIPELINE_DYNAMIC_STATE_CREATE_INFO);
        return ret;
    }

    public static VkPipelineDynamicStateCreateInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPipelineDynamicStateCreateInfo[] ret = new VkPipelineDynamicStateCreateInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPipelineDynamicStateCreateInfo(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.PIPELINE_DYNAMIC_STATE_CREATE_INFO);
        }
        return ret;
    }

    public static VkPipelineDynamicStateCreateInfo clone(Arena arena, VkPipelineDynamicStateCreateInfo src) {
        VkPipelineDynamicStateCreateInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPipelineDynamicStateCreateInfo[] clone(Arena arena, VkPipelineDynamicStateCreateInfo[] src) {
        VkPipelineDynamicStateCreateInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PIPELINE_DYNAMIC_STATE_CREATE_INFO);
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

    public @enumtype(VkPipelineDynamicStateCreateFlags.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkPipelineDynamicStateCreateFlags.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @unsigned int dynamicStateCount() {
        return segment.get(LAYOUT$dynamicStateCount, OFFSET$dynamicStateCount);
    }

    public void dynamicStateCount(@unsigned int value) {
        segment.set(LAYOUT$dynamicStateCount, OFFSET$dynamicStateCount, value);
    }


    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading fro
    /// or writing to the buffer.
    public @Nullable @enumtype(VkDynamicState.class) IntPtr pDynamicStates() {
        MemorySegment s = pDynamicStatesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new IntPtr(s);
    }

    public void pDynamicStates(@Nullable @enumtype(VkDynamicState.class) IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pDynamicStatesRaw(s);
    }

    public @pointer(target=VkDynamicState.class) MemorySegment pDynamicStatesRaw() {
        return segment.get(LAYOUT$pDynamicStates, OFFSET$pDynamicStates);
    }

    public void pDynamicStatesRaw(@pointer(target=VkDynamicState.class) MemorySegment value) {
        segment.set(LAYOUT$pDynamicStates, OFFSET$pDynamicStates, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("dynamicStateCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pDynamicStates")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$dynamicStateCount = PathElement.groupElement("dynamicStateCount");
    public static final PathElement PATH$pDynamicStates = PathElement.groupElement("pDynamicStates");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$dynamicStateCount = (OfInt) LAYOUT.select(PATH$dynamicStateCount);
    public static final AddressLayout LAYOUT$pDynamicStates = (AddressLayout) LAYOUT.select(PATH$pDynamicStates);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$dynamicStateCount = LAYOUT$dynamicStateCount.byteSize();
    public static final long SIZE$pDynamicStates = LAYOUT$pDynamicStates.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$dynamicStateCount = LAYOUT.byteOffset(PATH$dynamicStateCount);
    public static final long OFFSET$pDynamicStates = LAYOUT.byteOffset(PATH$pDynamicStates);
}
