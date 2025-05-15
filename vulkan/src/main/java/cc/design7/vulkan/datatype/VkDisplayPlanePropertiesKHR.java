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

/// Represents a pointer to a {@code VkDisplayPlanePropertiesKHR} structure in native memory.
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDisplayPlanePropertiesKHR.html">VkDisplayPlanePropertiesKHR</a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkDisplayPlanePropertiesKHR(@NotNull MemorySegment segment) implements IPointer {
    public static VkDisplayPlanePropertiesKHR allocate(Arena arena) {
        return new VkDisplayPlanePropertiesKHR(arena.allocate(LAYOUT));
    }

    public static VkDisplayPlanePropertiesKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDisplayPlanePropertiesKHR[] ret = new VkDisplayPlanePropertiesKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkDisplayPlanePropertiesKHR(segment.asSlice(i * SIZE, SIZE));
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

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withName("currentDisplay"),
        ValueLayout.JAVA_INT.withName("currentStackIndex")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$currentDisplay = PathElement.groupElement("PATH$currentDisplay");
    public static final PathElement PATH$currentStackIndex = PathElement.groupElement("PATH$currentStackIndex");

    public static final AddressLayout LAYOUT$currentDisplay = (AddressLayout) LAYOUT.select(PATH$currentDisplay);
    public static final OfInt LAYOUT$currentStackIndex = (OfInt) LAYOUT.select(PATH$currentStackIndex);

    public static final long SIZE$currentDisplay = LAYOUT$currentDisplay.byteSize();
    public static final long SIZE$currentStackIndex = LAYOUT$currentStackIndex.byteSize();

    public static final long OFFSET$currentDisplay = LAYOUT.byteOffset(PATH$currentDisplay);
    public static final long OFFSET$currentStackIndex = LAYOUT.byteOffset(PATH$currentStackIndex);

    public @Nullable VkDisplayKHR currentDisplay() {
        MemorySegment s = segment.asSlice(OFFSET$currentDisplay, SIZE$currentDisplay);
        if (s.address() == 0) {
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

}
