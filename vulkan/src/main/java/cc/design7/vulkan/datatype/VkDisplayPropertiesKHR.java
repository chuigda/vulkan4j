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
import cc.design7.vulkan.handle.*;
import cc.design7.vulkan.enumtype.*;
import static cc.design7.vulkan.VkConstants.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDisplayPropertiesKHR.html"><code>VkDisplayPropertiesKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkDisplayPropertiesKHR {
///     VkDisplayKHR display;
///     char const* displayName;
///     VkExtent2D physicalDimensions;
///     VkExtent2D physicalResolution;
///     VkSurfaceTransformFlagsKHR supportedTransforms; // optional
///     VkBool32 planeReorderPossible;
///     VkBool32 persistentContent;
/// } VkDisplayPropertiesKHR;
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDisplayPropertiesKHR.html"><code>VkDisplayPropertiesKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkDisplayPropertiesKHR(@NotNull MemorySegment segment) implements IPointer {
    public static VkDisplayPropertiesKHR allocate(Arena arena) {
        VkDisplayPropertiesKHR ret = new VkDisplayPropertiesKHR(arena.allocate(LAYOUT));
        return ret;
    }

    public static VkDisplayPropertiesKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDisplayPropertiesKHR[] ret = new VkDisplayPropertiesKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkDisplayPropertiesKHR(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static VkDisplayPropertiesKHR clone(Arena arena, VkDisplayPropertiesKHR src) {
        VkDisplayPropertiesKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDisplayPropertiesKHR[] clone(Arena arena, VkDisplayPropertiesKHR[] src) {
        VkDisplayPropertiesKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public @Nullable VkDisplayKHR display() {
        MemorySegment s = segment.asSlice(OFFSET$display, SIZE$display);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkDisplayKHR(s);
    }

    public void display(@Nullable VkDisplayKHR value) {
        segment.set(LAYOUT$display, OFFSET$display, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @pointer(comment="byte*") MemorySegment displayNameRaw() {
        return segment.get(LAYOUT$displayName, OFFSET$displayName);
    }

    public void displayNameRaw(@pointer(comment="byte*") MemorySegment value) {
        segment.set(LAYOUT$displayName, OFFSET$displayName, value);
    }

    /// Note: the returned {@link BytePtr} does not have correct
    /// {@link BytePtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link BytePtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable BytePtr displayName() {
        MemorySegment s = displayNameRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new BytePtr(s);
    }

    public void displayName(@Nullable BytePtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        displayNameRaw(s);
    }

    public VkExtent2D physicalDimensions() {
        return new VkExtent2D(segment.asSlice(OFFSET$physicalDimensions, LAYOUT$physicalDimensions));
    }

    public void physicalDimensions(VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$physicalDimensions, SIZE$physicalDimensions);
    }

    public VkExtent2D physicalResolution() {
        return new VkExtent2D(segment.asSlice(OFFSET$physicalResolution, LAYOUT$physicalResolution));
    }

    public void physicalResolution(VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$physicalResolution, SIZE$physicalResolution);
    }

    public @enumtype(VkSurfaceTransformFlagsKHR.class) int supportedTransforms() {
        return segment.get(LAYOUT$supportedTransforms, OFFSET$supportedTransforms);
    }

    public void supportedTransforms(@enumtype(VkSurfaceTransformFlagsKHR.class) int value) {
        segment.set(LAYOUT$supportedTransforms, OFFSET$supportedTransforms, value);
    }

    public @unsigned int planeReorderPossible() {
        return segment.get(LAYOUT$planeReorderPossible, OFFSET$planeReorderPossible);
    }

    public void planeReorderPossible(@unsigned int value) {
        segment.set(LAYOUT$planeReorderPossible, OFFSET$planeReorderPossible, value);
    }

    public @unsigned int persistentContent() {
        return segment.get(LAYOUT$persistentContent, OFFSET$persistentContent);
    }

    public void persistentContent(@unsigned int value) {
        segment.set(LAYOUT$persistentContent, OFFSET$persistentContent, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withName("display"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE).withName("displayName"),
        VkExtent2D.LAYOUT.withName("physicalDimensions"),
        VkExtent2D.LAYOUT.withName("physicalResolution"),
        ValueLayout.JAVA_INT.withName("supportedTransforms"),
        ValueLayout.JAVA_INT.withName("planeReorderPossible"),
        ValueLayout.JAVA_INT.withName("persistentContent")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$display = PathElement.groupElement("PATH$display");
    public static final PathElement PATH$displayName = PathElement.groupElement("PATH$displayName");
    public static final PathElement PATH$physicalDimensions = PathElement.groupElement("PATH$physicalDimensions");
    public static final PathElement PATH$physicalResolution = PathElement.groupElement("PATH$physicalResolution");
    public static final PathElement PATH$supportedTransforms = PathElement.groupElement("PATH$supportedTransforms");
    public static final PathElement PATH$planeReorderPossible = PathElement.groupElement("PATH$planeReorderPossible");
    public static final PathElement PATH$persistentContent = PathElement.groupElement("PATH$persistentContent");

    public static final AddressLayout LAYOUT$display = (AddressLayout) LAYOUT.select(PATH$display);
    public static final AddressLayout LAYOUT$displayName = (AddressLayout) LAYOUT.select(PATH$displayName);
    public static final StructLayout LAYOUT$physicalDimensions = (StructLayout) LAYOUT.select(PATH$physicalDimensions);
    public static final StructLayout LAYOUT$physicalResolution = (StructLayout) LAYOUT.select(PATH$physicalResolution);
    public static final OfInt LAYOUT$supportedTransforms = (OfInt) LAYOUT.select(PATH$supportedTransforms);
    public static final OfInt LAYOUT$planeReorderPossible = (OfInt) LAYOUT.select(PATH$planeReorderPossible);
    public static final OfInt LAYOUT$persistentContent = (OfInt) LAYOUT.select(PATH$persistentContent);

    public static final long SIZE$display = LAYOUT$display.byteSize();
    public static final long SIZE$displayName = LAYOUT$displayName.byteSize();
    public static final long SIZE$physicalDimensions = LAYOUT$physicalDimensions.byteSize();
    public static final long SIZE$physicalResolution = LAYOUT$physicalResolution.byteSize();
    public static final long SIZE$supportedTransforms = LAYOUT$supportedTransforms.byteSize();
    public static final long SIZE$planeReorderPossible = LAYOUT$planeReorderPossible.byteSize();
    public static final long SIZE$persistentContent = LAYOUT$persistentContent.byteSize();

    public static final long OFFSET$display = LAYOUT.byteOffset(PATH$display);
    public static final long OFFSET$displayName = LAYOUT.byteOffset(PATH$displayName);
    public static final long OFFSET$physicalDimensions = LAYOUT.byteOffset(PATH$physicalDimensions);
    public static final long OFFSET$physicalResolution = LAYOUT.byteOffset(PATH$physicalResolution);
    public static final long OFFSET$supportedTransforms = LAYOUT.byteOffset(PATH$supportedTransforms);
    public static final long OFFSET$planeReorderPossible = LAYOUT.byteOffset(PATH$planeReorderPossible);
    public static final long OFFSET$persistentContent = LAYOUT.byteOffset(PATH$persistentContent);
}
