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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkConformanceVersion.html"><code>VkConformanceVersion</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkConformanceVersion {
///     uint8_t major; // @link substring="major" target="#major"
///     uint8_t minor; // @link substring="minor" target="#minor"
///     uint8_t subminor; // @link substring="subminor" target="#subminor"
///     uint8_t patch; // @link substring="patch" target="#patch"
/// } VkConformanceVersion;
/// }
///
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkConformanceVersion.html"><code>VkConformanceVersion</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkConformanceVersion(@NotNull MemorySegment segment) implements IPointer {
    public static VkConformanceVersion allocate(Arena arena) {
        return new VkConformanceVersion(arena.allocate(LAYOUT));
    }

    public static VkConformanceVersion[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkConformanceVersion[] ret = new VkConformanceVersion[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkConformanceVersion(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static VkConformanceVersion clone(Arena arena, VkConformanceVersion src) {
        VkConformanceVersion ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkConformanceVersion[] clone(Arena arena, VkConformanceVersion[] src) {
        VkConformanceVersion[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public @unsigned byte major() {
        return segment.get(LAYOUT$major, OFFSET$major);
    }

    public void major(@unsigned byte value) {
        segment.set(LAYOUT$major, OFFSET$major, value);
    }

    public @unsigned byte minor() {
        return segment.get(LAYOUT$minor, OFFSET$minor);
    }

    public void minor(@unsigned byte value) {
        segment.set(LAYOUT$minor, OFFSET$minor, value);
    }

    public @unsigned byte subminor() {
        return segment.get(LAYOUT$subminor, OFFSET$subminor);
    }

    public void subminor(@unsigned byte value) {
        segment.set(LAYOUT$subminor, OFFSET$subminor, value);
    }

    public @unsigned byte patch() {
        return segment.get(LAYOUT$patch, OFFSET$patch);
    }

    public void patch(@unsigned byte value) {
        segment.set(LAYOUT$patch, OFFSET$patch, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_BYTE.withName("major"),
        ValueLayout.JAVA_BYTE.withName("minor"),
        ValueLayout.JAVA_BYTE.withName("subminor"),
        ValueLayout.JAVA_BYTE.withName("patch")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$major = PathElement.groupElement("PATH$major");
    public static final PathElement PATH$minor = PathElement.groupElement("PATH$minor");
    public static final PathElement PATH$subminor = PathElement.groupElement("PATH$subminor");
    public static final PathElement PATH$patch = PathElement.groupElement("PATH$patch");

    public static final OfByte LAYOUT$major = (OfByte) LAYOUT.select(PATH$major);
    public static final OfByte LAYOUT$minor = (OfByte) LAYOUT.select(PATH$minor);
    public static final OfByte LAYOUT$subminor = (OfByte) LAYOUT.select(PATH$subminor);
    public static final OfByte LAYOUT$patch = (OfByte) LAYOUT.select(PATH$patch);

    public static final long SIZE$major = LAYOUT$major.byteSize();
    public static final long SIZE$minor = LAYOUT$minor.byteSize();
    public static final long SIZE$subminor = LAYOUT$subminor.byteSize();
    public static final long SIZE$patch = LAYOUT$patch.byteSize();

    public static final long OFFSET$major = LAYOUT.byteOffset(PATH$major);
    public static final long OFFSET$minor = LAYOUT.byteOffset(PATH$minor);
    public static final long OFFSET$subminor = LAYOUT.byteOffset(PATH$subminor);
    public static final long OFFSET$patch = LAYOUT.byteOffset(PATH$patch);
}
