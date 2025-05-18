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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkBindMemoryStatus.html"><code>VkBindMemoryStatus</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkBindMemoryStatus {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkResult* pResult; // @link substring="VkResult" target="VkResult" @link substring="pResult" target="#pResult"
/// } VkBindMemoryStatus;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_BIND_MEMORY_STATUS`
///
/// The {@code allocate} ({@link VkBindMemoryStatus#allocate(Arena)}, {@link VkBindMemoryStatus#allocate(Arena, int)})
/// functions will automatically initialize these fields. Also, you may call {@link VkBindMemoryStatus#autoInit}
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkBindMemoryStatus.html"><code>VkBindMemoryStatus</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkBindMemoryStatus(@NotNull MemorySegment segment) implements IPointer {
    public static VkBindMemoryStatus allocate(Arena arena) {
        VkBindMemoryStatus ret = new VkBindMemoryStatus(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.BIND_MEMORY_STATUS);
        return ret;
    }

    public static VkBindMemoryStatus[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkBindMemoryStatus[] ret = new VkBindMemoryStatus[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkBindMemoryStatus(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.BIND_MEMORY_STATUS);
        }
        return ret;
    }

    public static VkBindMemoryStatus clone(Arena arena, VkBindMemoryStatus src) {
        VkBindMemoryStatus ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkBindMemoryStatus[] clone(Arena arena, VkBindMemoryStatus[] src) {
        VkBindMemoryStatus[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.BIND_MEMORY_STATUS);
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


    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading fro
    /// or writing to the buffer.
    public @Nullable @enumtype(VkResult.class) IntPtr pResult() {
        MemorySegment s = pResultRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new IntPtr(s);
    }

    public void pResult(@Nullable @enumtype(VkResult.class) IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pResultRaw(s);
    }

    public @pointer(target=VkResult.class) MemorySegment pResultRaw() {
        return segment.get(LAYOUT$pResult, OFFSET$pResult);
    }

    public void pResultRaw(@pointer(target=VkResult.class) MemorySegment value) {
        segment.set(LAYOUT$pResult, OFFSET$pResult, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pResult")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$pResult = PathElement.groupElement("PATH$pResult");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$pResult = (AddressLayout) LAYOUT.select(PATH$pResult);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$pResult = LAYOUT$pResult.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$pResult = LAYOUT.byteOffset(PATH$pResult);
}
