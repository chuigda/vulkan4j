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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDisplayPlanePropertiesKHR.html"><code>VkDisplayPlanePropertiesKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkDisplayPlanePropertiesKHR {
///     VkDisplayKHR currentDisplay; // @link substring="VkDisplayKHR" target="VkDisplayKHR" @link substring="currentDisplay" target="#currentDisplay"
///     uint32_t currentStackIndex; // @link substring="currentStackIndex" target="#currentStackIndex"
/// } VkDisplayPlanePropertiesKHR;
/// }
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDisplayPlanePropertiesKHR.html"><code>VkDisplayPlanePropertiesKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkDisplayPlanePropertiesKHR(@NotNull MemorySegment segment) implements IPointer {
    public static VkDisplayPlanePropertiesKHR allocate(Arena arena) {
        VkDisplayPlanePropertiesKHR ret = new VkDisplayPlanePropertiesKHR(arena.allocate(LAYOUT));
        return ret;
    }

    public static VkDisplayPlanePropertiesKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDisplayPlanePropertiesKHR[] ret = new VkDisplayPlanePropertiesKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkDisplayPlanePropertiesKHR(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static VkDisplayPlanePropertiesKHR clone(Arena arena, VkDisplayPlanePropertiesKHR src) {
        VkDisplayPlanePropertiesKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDisplayPlanePropertiesKHR[] clone(Arena arena, VkDisplayPlanePropertiesKHR[] src) {
        VkDisplayPlanePropertiesKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public @Nullable VkDisplayKHR currentDisplay() {
        MemorySegment s = segment.asSlice(OFFSET$currentDisplay, SIZE$currentDisplay);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkDisplayKHR(s);
    }

    public void currentDisplay(@Nullable VkDisplayKHR value) {
        segment.set(LAYOUT$currentDisplay, OFFSET$currentDisplay, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @unsigned int currentStackIndex() {
        return segment.get(LAYOUT$currentStackIndex, OFFSET$currentStackIndex);
    }

    public void currentStackIndex(@unsigned int value) {
        segment.set(LAYOUT$currentStackIndex, OFFSET$currentStackIndex, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withName("currentDisplay"),
        ValueLayout.JAVA_INT.withName("currentStackIndex")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$currentDisplay = PathElement.groupElement("PATH$currentDisplay");
    public static final PathElement PATH$currentStackIndex = PathElement.groupElement("PATH$currentStackIndex");

    public static final AddressLayout LAYOUT$currentDisplay = (AddressLayout) LAYOUT.select(PATH$currentDisplay);
    public static final OfInt LAYOUT$currentStackIndex = (OfInt) LAYOUT.select(PATH$currentStackIndex);

    public static final long SIZE$currentDisplay = LAYOUT$currentDisplay.byteSize();
    public static final long SIZE$currentStackIndex = LAYOUT$currentStackIndex.byteSize();

    public static final long OFFSET$currentDisplay = LAYOUT.byteOffset(PATH$currentDisplay);
    public static final long OFFSET$currentStackIndex = LAYOUT.byteOffset(PATH$currentStackIndex);
}
