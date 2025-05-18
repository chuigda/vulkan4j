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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSemaphoreSciSyncCreateInfoNV.html"><code>VkSemaphoreSciSyncCreateInfoNV</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkSemaphoreSciSyncCreateInfoNV {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkSemaphoreSciSyncPoolNV semaphorePool; // @link substring="VkSemaphoreSciSyncPoolNV" target="VkSemaphoreSciSyncPoolNV" @link substring="semaphorePool" target="#semaphorePool"
///     NvSciSyncFence const* pFence; // @link substring="NvSciSyncFenceVKREF" target="NvSciSyncFenceVKREF" @link substring="pFence" target="#pFence"
/// } VkSemaphoreSciSyncCreateInfoNV;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_SEMAPHORE_SCI_SYNC_CREATE_INFO_NV`
///
/// The {@link VkSemaphoreSciSyncCreateInfoNV#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkSemaphoreSciSyncCreateInfoNV#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSemaphoreSciSyncCreateInfoNV.html"><code>VkSemaphoreSciSyncCreateInfoNV</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkSemaphoreSciSyncCreateInfoNV(@NotNull MemorySegment segment) implements IPointer {
    public static VkSemaphoreSciSyncCreateInfoNV allocate(Arena arena) {
        VkSemaphoreSciSyncCreateInfoNV ret = new VkSemaphoreSciSyncCreateInfoNV(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.SEMAPHORE_SCI_SYNC_CREATE_INFO_NV);
        return ret;
    }

    public static VkSemaphoreSciSyncCreateInfoNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkSemaphoreSciSyncCreateInfoNV[] ret = new VkSemaphoreSciSyncCreateInfoNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkSemaphoreSciSyncCreateInfoNV(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.SEMAPHORE_SCI_SYNC_CREATE_INFO_NV);
        }
        return ret;
    }

    public static VkSemaphoreSciSyncCreateInfoNV clone(Arena arena, VkSemaphoreSciSyncCreateInfoNV src) {
        VkSemaphoreSciSyncCreateInfoNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkSemaphoreSciSyncCreateInfoNV[] clone(Arena arena, VkSemaphoreSciSyncCreateInfoNV[] src) {
        VkSemaphoreSciSyncCreateInfoNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.SEMAPHORE_SCI_SYNC_CREATE_INFO_NV);
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

    public @Nullable VkSemaphoreSciSyncPoolNV semaphorePool() {
        MemorySegment s = segment.asSlice(OFFSET$semaphorePool, SIZE$semaphorePool);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkSemaphoreSciSyncPoolNV(s);
    }

    public void semaphorePool(@Nullable VkSemaphoreSciSyncPoolNV value) {
        segment.set(LAYOUT$semaphorePool, OFFSET$semaphorePool, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @Nullable NvSciSyncFenceVKREF pFence() {
        MemorySegment s = pFenceRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new NvSciSyncFenceVKREF(s);
    }

    public void pFence(@Nullable NvSciSyncFenceVKREF value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pFenceRaw(s);
    }

    @unsafe public @Nullable NvSciSyncFenceVKREF[] pFence(int assumedCount) {
        MemorySegment s = pFenceRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * NvSciSyncFenceVKREF.BYTES);
        NvSciSyncFenceVKREF[] ret = new NvSciSyncFenceVKREF[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new NvSciSyncFenceVKREF(s.asSlice(i * NvSciSyncFenceVKREF.BYTES, NvSciSyncFenceVKREF.BYTES));
        }
        return ret;
    }

    public @pointer(target=NvSciSyncFenceVKREF.class) MemorySegment pFenceRaw() {
        return segment.get(LAYOUT$pFence, OFFSET$pFence);
    }

    public void pFenceRaw(@pointer(target=NvSciSyncFenceVKREF.class) MemorySegment value) {
        segment.set(LAYOUT$pFence, OFFSET$pFence, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("semaphorePool"),
        ValueLayout.ADDRESS.withTargetLayout(NvSciSyncFenceVKREF.LAYOUT).withName("pFence")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$semaphorePool = PathElement.groupElement("PATH$semaphorePool");
    public static final PathElement PATH$pFence = PathElement.groupElement("PATH$pFence");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$semaphorePool = (AddressLayout) LAYOUT.select(PATH$semaphorePool);
    public static final AddressLayout LAYOUT$pFence = (AddressLayout) LAYOUT.select(PATH$pFence);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$semaphorePool = LAYOUT$semaphorePool.byteSize();
    public static final long SIZE$pFence = LAYOUT$pFence.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$semaphorePool = LAYOUT.byteOffset(PATH$semaphorePool);
    public static final long OFFSET$pFence = LAYOUT.byteOffset(PATH$pFence);
}
