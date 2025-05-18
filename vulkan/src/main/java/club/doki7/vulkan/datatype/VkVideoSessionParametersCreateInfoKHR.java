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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoSessionParametersCreateInfoKHR.html"><code>VkVideoSessionParametersCreateInfoKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkVideoSessionParametersCreateInfoKHR {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkVideoSessionParametersCreateFlagsKHR flags; // optional // @link substring="VkVideoSessionParametersCreateFlagsKHR" target="VkVideoSessionParametersCreateFlagsKHR" @link substring="flags" target="#flags"
///     VkVideoSessionParametersKHR videoSessionParametersTemplate; // optional // @link substring="VkVideoSessionParametersKHR" target="VkVideoSessionParametersKHR" @link substring="videoSessionParametersTemplate" target="#videoSessionParametersTemplate"
///     VkVideoSessionKHR videoSession; // @link substring="VkVideoSessionKHR" target="VkVideoSessionKHR" @link substring="videoSession" target="#videoSession"
/// } VkVideoSessionParametersCreateInfoKHR;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_VIDEO_SESSION_PARAMETERS_CREATE_INFO_KHR`
///
/// The {@code allocate} ({@link VkVideoSessionParametersCreateInfoKHR#allocate(Arena)}, {@link VkVideoSessionParametersCreateInfoKHR#allocate(Arena, int)})
/// functions will automatically initialize these fields. Also, you may call {@link VkVideoSessionParametersCreateInfoKHR#autoInit}
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoSessionParametersCreateInfoKHR.html"><code>VkVideoSessionParametersCreateInfoKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkVideoSessionParametersCreateInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public static VkVideoSessionParametersCreateInfoKHR allocate(Arena arena) {
        VkVideoSessionParametersCreateInfoKHR ret = new VkVideoSessionParametersCreateInfoKHR(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.VIDEO_SESSION_PARAMETERS_CREATE_INFO_KHR);
        return ret;
    }

    public static VkVideoSessionParametersCreateInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoSessionParametersCreateInfoKHR[] ret = new VkVideoSessionParametersCreateInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkVideoSessionParametersCreateInfoKHR(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.VIDEO_SESSION_PARAMETERS_CREATE_INFO_KHR);
        }
        return ret;
    }

    public static VkVideoSessionParametersCreateInfoKHR clone(Arena arena, VkVideoSessionParametersCreateInfoKHR src) {
        VkVideoSessionParametersCreateInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkVideoSessionParametersCreateInfoKHR[] clone(Arena arena, VkVideoSessionParametersCreateInfoKHR[] src) {
        VkVideoSessionParametersCreateInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.VIDEO_SESSION_PARAMETERS_CREATE_INFO_KHR);
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

    public @enumtype(VkVideoSessionParametersCreateFlagsKHR.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkVideoSessionParametersCreateFlagsKHR.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @Nullable VkVideoSessionParametersKHR videoSessionParametersTemplate() {
        MemorySegment s = segment.asSlice(OFFSET$videoSessionParametersTemplate, SIZE$videoSessionParametersTemplate);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkVideoSessionParametersKHR(s);
    }

    public void videoSessionParametersTemplate(@Nullable VkVideoSessionParametersKHR value) {
        segment.set(LAYOUT$videoSessionParametersTemplate, OFFSET$videoSessionParametersTemplate, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @Nullable VkVideoSessionKHR videoSession() {
        MemorySegment s = segment.asSlice(OFFSET$videoSession, SIZE$videoSession);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkVideoSessionKHR(s);
    }

    public void videoSession(@Nullable VkVideoSessionKHR value) {
        segment.set(LAYOUT$videoSession, OFFSET$videoSession, value != null ? value.segment() : MemorySegment.NULL);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.ADDRESS.withName("videoSessionParametersTemplate"),
        ValueLayout.ADDRESS.withName("videoSession")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$videoSessionParametersTemplate = PathElement.groupElement("PATH$videoSessionParametersTemplate");
    public static final PathElement PATH$videoSession = PathElement.groupElement("PATH$videoSession");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final AddressLayout LAYOUT$videoSessionParametersTemplate = (AddressLayout) LAYOUT.select(PATH$videoSessionParametersTemplate);
    public static final AddressLayout LAYOUT$videoSession = (AddressLayout) LAYOUT.select(PATH$videoSession);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$videoSessionParametersTemplate = LAYOUT$videoSessionParametersTemplate.byteSize();
    public static final long SIZE$videoSession = LAYOUT$videoSession.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$videoSessionParametersTemplate = LAYOUT.byteOffset(PATH$videoSessionParametersTemplate);
    public static final long OFFSET$videoSession = LAYOUT.byteOffset(PATH$videoSession);
}
