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

/// Represents a pointer to a {@code VkVideoProfileListInfoKHR} structure in native memory.
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoProfileListInfoKHR.html">VkVideoProfileListInfoKHR</a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkVideoProfileListInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public VkVideoProfileListInfoKHR {
        sType(VkStructureType.VIDEO_PROFILE_LIST_INFO_KHR);
    }

    public static VkVideoProfileListInfoKHR allocate(Arena arena) {
        return new VkVideoProfileListInfoKHR(arena.allocate(LAYOUT));
    }

    public static VkVideoProfileListInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoProfileListInfoKHR[] ret = new VkVideoProfileListInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkVideoProfileListInfoKHR(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static VkVideoProfileListInfoKHR clone(Arena arena, VkVideoProfileListInfoKHR src) {
        VkVideoProfileListInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkVideoProfileListInfoKHR[] clone(Arena arena, VkVideoProfileListInfoKHR[] src) {
        VkVideoProfileListInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("profileCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkVideoProfileInfoKHR.LAYOUT).withName("pProfiles")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$profileCount = PathElement.groupElement("PATH$profileCount");
    public static final PathElement PATH$pProfiles = PathElement.groupElement("PATH$pProfiles");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$profileCount = (OfInt) LAYOUT.select(PATH$profileCount);
    public static final AddressLayout LAYOUT$pProfiles = (AddressLayout) LAYOUT.select(PATH$pProfiles);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$profileCount = LAYOUT$profileCount.byteSize();
    public static final long SIZE$pProfiles = LAYOUT$pProfiles.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$profileCount = LAYOUT.byteOffset(PATH$profileCount);
    public static final long OFFSET$pProfiles = LAYOUT.byteOffset(PATH$pProfiles);

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

    public @unsigned int profileCount() {
        return segment.get(LAYOUT$profileCount, OFFSET$profileCount);
    }

    public void profileCount(@unsigned int value) {
        segment.set(LAYOUT$profileCount, OFFSET$profileCount, value);
    }

    public @pointer(comment="VkVideoProfileInfoKHR*") MemorySegment pProfilesRaw() {
        return segment.get(LAYOUT$pProfiles, OFFSET$pProfiles);
    }

    public void pProfilesRaw(@pointer(comment="VkVideoProfileInfoKHR*") MemorySegment value) {
        segment.set(LAYOUT$pProfiles, OFFSET$pProfiles, value);
    }

    public @Nullable VkVideoProfileInfoKHR pProfiles() {
        MemorySegment s = pProfilesRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkVideoProfileInfoKHR(s);
    }

    public void pProfiles(@Nullable VkVideoProfileInfoKHR value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pProfilesRaw(s);
    }

    @unsafe public @Nullable VkVideoProfileInfoKHR[] pProfiles(int assumedCount) {
        MemorySegment s = pProfilesRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkVideoProfileInfoKHR.SIZE);
        VkVideoProfileInfoKHR[] ret = new VkVideoProfileInfoKHR[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkVideoProfileInfoKHR(s.asSlice(i * VkVideoProfileInfoKHR.SIZE, VkVideoProfileInfoKHR.SIZE));
        }
        return ret;
    }

}
