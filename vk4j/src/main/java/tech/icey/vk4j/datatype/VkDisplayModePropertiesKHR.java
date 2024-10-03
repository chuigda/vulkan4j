package tech.icey.vk4j.datatype;

import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.nullable;
import tech.icey.vk4j.handle.VkDisplayModeKHR;

import java.lang.foreign.*;

import static java.lang.foreign.ValueLayout.PathElement;

/// {@snippet lang=c :
/// typedef struct VkDisplayModePropertiesKHR {
///     VkDisplayModeKHR displayMode;
///     VkDisplayModeParametersKHR parameters;
/// } VkDisplayModePropertiesKHR;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkDisplayModePropertiesKHR.html">VkDisplayModePropertiesKHR</a>
public record VkDisplayModePropertiesKHR(MemorySegment segment) implements IPointer {
    public VkDisplayModePropertiesKHR(MemorySegment segment) {
        this.segment = segment;
    }

    public @nullable VkDisplayModeKHR displayMode() {
        MemorySegment s = segment.get(LAYOUT$displayMode, OFFSET$displayMode);
        if (s.address() == 0) {
            return null;
        }
        return new VkDisplayModeKHR(s);
    }

    public void displayMode(@nullable VkDisplayModeKHR value) {
        segment.set(
            LAYOUT$displayMode,
            OFFSET$displayMode,
            value != null ? value.segment() : MemorySegment.NULL
        );
    }

    public VkDisplayModeParametersKHR parameters() {
        return new VkDisplayModeParametersKHR(segment.asSlice(OFFSET$parameters, LAYOUT$parameters));
    }

    public void parameters(VkDisplayModeParametersKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$parameters, SIZE$parameters);
    }

    public static VkDisplayModePropertiesKHR allocate(Arena arena) {
        return new VkDisplayModePropertiesKHR(arena.allocate(LAYOUT));
    }

    public static VkDisplayModePropertiesKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDisplayModePropertiesKHR[] ret = new VkDisplayModePropertiesKHR[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkDisplayModePropertiesKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkDisplayModePropertiesKHR clone(Arena arena, VkDisplayModePropertiesKHR src) {
        VkDisplayModePropertiesKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDisplayModePropertiesKHR[] clone(Arena arena, VkDisplayModePropertiesKHR[] src) {
        VkDisplayModePropertiesKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withName("displayMode"),
        VkDisplayModeParametersKHR.LAYOUT.withName("parameters")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$displayMode = PathElement.groupElement("displayMode");
    public static final PathElement PATH$parameters = PathElement.groupElement("parameters");

    public static final AddressLayout LAYOUT$displayMode = (AddressLayout) LAYOUT.select(PATH$displayMode);
    public static final StructLayout LAYOUT$parameters = (StructLayout) LAYOUT.select(PATH$parameters);

    public static final long OFFSET$displayMode = LAYOUT.byteOffset(PATH$displayMode);
    public static final long OFFSET$parameters = LAYOUT.byteOffset(PATH$parameters);

    public static final long SIZE$displayMode = LAYOUT$displayMode.byteSize();
    public static final long SIZE$parameters = LAYOUT$parameters.byteSize();
}
