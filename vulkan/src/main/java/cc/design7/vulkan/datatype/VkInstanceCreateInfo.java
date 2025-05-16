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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkInstanceCreateInfo.html"><code>VkInstanceCreateInfo</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkInstanceCreateInfo {
///     VkStructureType sType;
///     void const* pNext; // optional
///     VkInstanceCreateFlags flags; // optional
///     VkApplicationInfo const* pApplicationInfo; // optional
///     uint32_t enabledLayerCount; // optional
///     char const* const* ppEnabledLayerNames;
///     uint32_t enabledExtensionCount; // optional
///     char const* const* ppEnabledExtensionNames;
/// } VkInstanceCreateInfo;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_INSTANCE_CREATE_INFO`
///
/// The {@link VkInstanceCreateInfo#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkInstanceCreateInfo#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkInstanceCreateInfo.html"><code>VkInstanceCreateInfo</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkInstanceCreateInfo(@NotNull MemorySegment segment) implements IPointer {
    public static VkInstanceCreateInfo allocate(Arena arena) {
        VkInstanceCreateInfo ret = new VkInstanceCreateInfo(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.INSTANCE_CREATE_INFO);
        return ret;
    }

    public static VkInstanceCreateInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkInstanceCreateInfo[] ret = new VkInstanceCreateInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkInstanceCreateInfo(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.INSTANCE_CREATE_INFO);
        }
        return ret;
    }

    public static VkInstanceCreateInfo clone(Arena arena, VkInstanceCreateInfo src) {
        VkInstanceCreateInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkInstanceCreateInfo[] clone(Arena arena, VkInstanceCreateInfo[] src) {
        VkInstanceCreateInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.INSTANCE_CREATE_INFO);
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

    public @enumtype(VkInstanceCreateFlags.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkInstanceCreateFlags.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @pointer(comment="VkApplicationInfo*") MemorySegment pApplicationInfoRaw() {
        return segment.get(LAYOUT$pApplicationInfo, OFFSET$pApplicationInfo);
    }

    public void pApplicationInfoRaw(@pointer(comment="VkApplicationInfo*") MemorySegment value) {
        segment.set(LAYOUT$pApplicationInfo, OFFSET$pApplicationInfo, value);
    }

    public @Nullable VkApplicationInfo pApplicationInfo() {
        MemorySegment s = pApplicationInfoRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkApplicationInfo(s);
    }

    public void pApplicationInfo(@Nullable VkApplicationInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pApplicationInfoRaw(s);
    }

    @unsafe public @Nullable VkApplicationInfo[] pApplicationInfo(int assumedCount) {
        MemorySegment s = pApplicationInfoRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkApplicationInfo.BYTES);
        VkApplicationInfo[] ret = new VkApplicationInfo[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkApplicationInfo(s.asSlice(i * VkApplicationInfo.BYTES, VkApplicationInfo.BYTES));
        }
        return ret;
    }

    public @unsigned int enabledLayerCount() {
        return segment.get(LAYOUT$enabledLayerCount, OFFSET$enabledLayerCount);
    }

    public void enabledLayerCount(@unsigned int value) {
        segment.set(LAYOUT$enabledLayerCount, OFFSET$enabledLayerCount, value);
    }

    public @pointer(comment="void**") MemorySegment ppEnabledLayerNamesRaw() {
        return segment.get(LAYOUT$ppEnabledLayerNames, OFFSET$ppEnabledLayerNames);
    }

    public void ppEnabledLayerNamesRaw(@pointer(comment="void**") MemorySegment value) {
        segment.set(LAYOUT$ppEnabledLayerNames, OFFSET$ppEnabledLayerNames, value);
    }

    /// Note: the returned {@link PointerPtr} does not have correct {@link PointerPtr#size} property. It's up
    /// to user to track the size of the buffer, and use {@link PointerPtr#reinterpret} to set the size before
    /// actually reading from or writing to the buffer.
    public @Nullable PointerPtr ppEnabledLayerNames() {
        MemorySegment s = ppEnabledLayerNamesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new PointerPtr(s);
    }

    public void ppEnabledLayerNames(@Nullable PointerPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        ppEnabledLayerNamesRaw(s);
    }

    public @unsigned int enabledExtensionCount() {
        return segment.get(LAYOUT$enabledExtensionCount, OFFSET$enabledExtensionCount);
    }

    public void enabledExtensionCount(@unsigned int value) {
        segment.set(LAYOUT$enabledExtensionCount, OFFSET$enabledExtensionCount, value);
    }

    public @pointer(comment="void**") MemorySegment ppEnabledExtensionNamesRaw() {
        return segment.get(LAYOUT$ppEnabledExtensionNames, OFFSET$ppEnabledExtensionNames);
    }

    public void ppEnabledExtensionNamesRaw(@pointer(comment="void**") MemorySegment value) {
        segment.set(LAYOUT$ppEnabledExtensionNames, OFFSET$ppEnabledExtensionNames, value);
    }

    /// Note: the returned {@link PointerPtr} does not have correct {@link PointerPtr#size} property. It's up
    /// to user to track the size of the buffer, and use {@link PointerPtr#reinterpret} to set the size before
    /// actually reading from or writing to the buffer.
    public @Nullable PointerPtr ppEnabledExtensionNames() {
        MemorySegment s = ppEnabledExtensionNamesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new PointerPtr(s);
    }

    public void ppEnabledExtensionNames(@Nullable PointerPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        ppEnabledExtensionNamesRaw(s);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.ADDRESS.withTargetLayout(VkApplicationInfo.LAYOUT).withName("pApplicationInfo"),
        ValueLayout.JAVA_INT.withName("enabledLayerCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)).withName("ppEnabledLayerNames"),
        ValueLayout.JAVA_INT.withName("enabledExtensionCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)).withName("ppEnabledExtensionNames")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$pApplicationInfo = PathElement.groupElement("PATH$pApplicationInfo");
    public static final PathElement PATH$enabledLayerCount = PathElement.groupElement("PATH$enabledLayerCount");
    public static final PathElement PATH$ppEnabledLayerNames = PathElement.groupElement("PATH$ppEnabledLayerNames");
    public static final PathElement PATH$enabledExtensionCount = PathElement.groupElement("PATH$enabledExtensionCount");
    public static final PathElement PATH$ppEnabledExtensionNames = PathElement.groupElement("PATH$ppEnabledExtensionNames");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final AddressLayout LAYOUT$pApplicationInfo = (AddressLayout) LAYOUT.select(PATH$pApplicationInfo);
    public static final OfInt LAYOUT$enabledLayerCount = (OfInt) LAYOUT.select(PATH$enabledLayerCount);
    public static final AddressLayout LAYOUT$ppEnabledLayerNames = (AddressLayout) LAYOUT.select(PATH$ppEnabledLayerNames);
    public static final OfInt LAYOUT$enabledExtensionCount = (OfInt) LAYOUT.select(PATH$enabledExtensionCount);
    public static final AddressLayout LAYOUT$ppEnabledExtensionNames = (AddressLayout) LAYOUT.select(PATH$ppEnabledExtensionNames);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$pApplicationInfo = LAYOUT$pApplicationInfo.byteSize();
    public static final long SIZE$enabledLayerCount = LAYOUT$enabledLayerCount.byteSize();
    public static final long SIZE$ppEnabledLayerNames = LAYOUT$ppEnabledLayerNames.byteSize();
    public static final long SIZE$enabledExtensionCount = LAYOUT$enabledExtensionCount.byteSize();
    public static final long SIZE$ppEnabledExtensionNames = LAYOUT$ppEnabledExtensionNames.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$pApplicationInfo = LAYOUT.byteOffset(PATH$pApplicationInfo);
    public static final long OFFSET$enabledLayerCount = LAYOUT.byteOffset(PATH$enabledLayerCount);
    public static final long OFFSET$ppEnabledLayerNames = LAYOUT.byteOffset(PATH$ppEnabledLayerNames);
    public static final long OFFSET$enabledExtensionCount = LAYOUT.byteOffset(PATH$enabledExtensionCount);
    public static final long OFFSET$ppEnabledExtensionNames = LAYOUT.byteOffset(PATH$ppEnabledExtensionNames);
}
