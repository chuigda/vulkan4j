package club.doki7.openxr.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
import java.util.List;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import club.doki7.ffm.IPointer;
import club.doki7.ffm.NativeLayout;
import club.doki7.ffm.annotation.*;
import club.doki7.ffm.ptr.*;
import club.doki7.openxr.bitmask.*;
import club.doki7.openxr.handle.*;
import club.doki7.openxr.enumtype.*;
import static club.doki7.openxr.XRConstants.*;
import club.doki7.openxr.XRFunctionTypes.*;
import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.datatype.*;
import club.doki7.vulkan.enumtype.*;
import club.doki7.vulkan.handle.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrApiLayerNextInfo.html"><code>XrApiLayerNextInfo</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrApiLayerNextInfo {
///     XrLoaderInterfaceStructs structType; // @link substring="XrLoaderInterfaceStructs" target="XrLoaderInterfaceStructs" @link substring="structType" target="#structType"
///     uint32_t structVersion; // @link substring="structVersion" target="#structVersion"
///     size_t structSize; // @link substring="structSize" target="#structSize"
///     char[XR_MAX_API_LAYER_NAME_SIZE] layerName; // @link substring="layerName" target="#layerName"
///     PFN_xrGetInstanceProcAddr nextGetInstanceProcAddr; // @link substring="PFN_xrGetInstanceProcAddr" target="PFN_xrGetInstanceProcAddr" @link substring="nextGetInstanceProcAddr" target="#nextGetInstanceProcAddr"
///     PFN_xrCreateApiLayerInstance nextCreateApiLayerInstance; // @link substring="PFN_xrCreateApiLayerInstance" target="PFN_xrCreateApiLayerInstance" @link substring="nextCreateApiLayerInstance" target="#nextCreateApiLayerInstance"
///     XrApiLayerNextInfo* next; // @link substring="XrApiLayerNextInfo" target="XrApiLayerNextInfo" @link substring="next" target="#next"
/// } XrApiLayerNextInfo;
/// }
///
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrApiLayerNextInfo.html"><code>XrApiLayerNextInfo</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrApiLayerNextInfo(@NotNull MemorySegment segment) implements IXrApiLayerNextInfo {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrApiLayerNextInfo.html"><code>XrApiLayerNextInfo</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrApiLayerNextInfo}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrApiLayerNextInfo to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrApiLayerNextInfo.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrApiLayerNextInfo, Iterable<XrApiLayerNextInfo> {
        public long size() {
            return segment.byteSize() / XrApiLayerNextInfo.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrApiLayerNextInfo at(long index) {
            return new XrApiLayerNextInfo(segment.asSlice(index * XrApiLayerNextInfo.BYTES, XrApiLayerNextInfo.BYTES));
        }

        public XrApiLayerNextInfo.Ptr at(long index, @NotNull Consumer<@NotNull XrApiLayerNextInfo> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull XrApiLayerNextInfo value) {
            MemorySegment s = segment.asSlice(index * XrApiLayerNextInfo.BYTES, XrApiLayerNextInfo.BYTES);
            s.copyFrom(value.segment);
        }

        /// Assume the {@link Ptr} is capable of holding at least {@code newSize} structures,
        /// create a new view {@link Ptr} that uses the same backing storage as this
        /// {@link Ptr}, but with the new size. Since there is actually no way to really check
        /// whether the new size is valid, while buffer overflow is undefined behavior, this method is
        /// marked as {@link Unsafe}.
        ///
        /// This method could be useful when handling data returned from some C API, where the size of
        /// the data is not known in advance.
        ///
        /// If the size of the underlying segment is actually known in advance and correctly set, and
        /// you want to create a shrunk view, you may use {@link #slice(long)} (with validation)
        /// instead.
        @Unsafe
        public @NotNull Ptr reinterpret(long newSize) {
            return new Ptr(segment.reinterpret(newSize * XrApiLayerNextInfo.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrApiLayerNextInfo.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrApiLayerNextInfo.BYTES,
                (end - start) * XrApiLayerNextInfo.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrApiLayerNextInfo.BYTES));
        }

        public XrApiLayerNextInfo[] toArray() {
            XrApiLayerNextInfo[] ret = new XrApiLayerNextInfo[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrApiLayerNextInfo> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrApiLayerNextInfo> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrApiLayerNextInfo.BYTES;
            }

            @Override
            public XrApiLayerNextInfo next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrApiLayerNextInfo ret = new XrApiLayerNextInfo(segment.asSlice(0, XrApiLayerNextInfo.BYTES));
                segment = segment.asSlice(XrApiLayerNextInfo.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrApiLayerNextInfo allocate(Arena arena) {
        return new XrApiLayerNextInfo(arena.allocate(LAYOUT));
    }

    public static XrApiLayerNextInfo.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new XrApiLayerNextInfo.Ptr(segment);
    }

    public static XrApiLayerNextInfo clone(Arena arena, XrApiLayerNextInfo src) {
        XrApiLayerNextInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @EnumType(XrLoaderInterfaceStructs.class) int structType() {
        return segment.get(LAYOUT$structType, OFFSET$structType);
    }

    public XrApiLayerNextInfo structType(@EnumType(XrLoaderInterfaceStructs.class) int value) {
        segment.set(LAYOUT$structType, OFFSET$structType, value);
        return this;
    }

    public @Unsigned int structVersion() {
        return segment.get(LAYOUT$structVersion, OFFSET$structVersion);
    }

    public XrApiLayerNextInfo structVersion(@Unsigned int value) {
        segment.set(LAYOUT$structVersion, OFFSET$structVersion, value);
        return this;
    }

    public @Unsigned long structSize() {
        return NativeLayout.readCSizeT(segment, OFFSET$structSize);
    }

    public XrApiLayerNextInfo structSize(@Unsigned long value) {
        NativeLayout.writeCSizeT(segment, OFFSET$structSize, value);
        return this;
    }

    public BytePtr layerName() {
        return new BytePtr(layerNameRaw());
    }

    public XrApiLayerNextInfo layerName(@NotNull Consumer<BytePtr> consumer) {
        BytePtr ptr = layerName();
        consumer.accept(ptr);
        return this;
    }

    public XrApiLayerNextInfo layerName(BytePtr value) {
        MemorySegment s = layerNameRaw();
        s.copyFrom(value.segment());
        return this;
    }

    public @NotNull MemorySegment layerNameRaw() {
        return segment.asSlice(OFFSET$layerName, SIZE$layerName);
    }

    public @Pointer(comment="PFN_xrGetInstanceProcAddr") @NotNull MemorySegment nextGetInstanceProcAddr() {
        return segment.get(LAYOUT$nextGetInstanceProcAddr, OFFSET$nextGetInstanceProcAddr);
    }

    public XrApiLayerNextInfo nextGetInstanceProcAddr(@Pointer(comment="PFN_xrGetInstanceProcAddr") @NotNull MemorySegment value) {
        segment.set(LAYOUT$nextGetInstanceProcAddr, OFFSET$nextGetInstanceProcAddr, value);
        return this;
    }

    public XrApiLayerNextInfo nextGetInstanceProcAddr(@NotNull PFN_xrGetInstanceProcAddr value) {
        return nextGetInstanceProcAddr(PFN_xrGetInstanceProcAddr.ofNative(value));
    }

    public XrApiLayerNextInfo nextGetInstanceProcAddr(@NotNull Arena arena, @NotNull PFN_xrGetInstanceProcAddr value) {
        return nextGetInstanceProcAddr(PFN_xrGetInstanceProcAddr.ofNative(arena, value));
    }

    public XrApiLayerNextInfo nextGetInstanceProcAddr(@Nullable IPointer pointer) {
        nextGetInstanceProcAddr(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Pointer(comment="PFN_xrCreateApiLayerInstance") @NotNull MemorySegment nextCreateApiLayerInstance() {
        return segment.get(LAYOUT$nextCreateApiLayerInstance, OFFSET$nextCreateApiLayerInstance);
    }

    public XrApiLayerNextInfo nextCreateApiLayerInstance(@Pointer(comment="PFN_xrCreateApiLayerInstance") @NotNull MemorySegment value) {
        segment.set(LAYOUT$nextCreateApiLayerInstance, OFFSET$nextCreateApiLayerInstance, value);
        return this;
    }

    public XrApiLayerNextInfo nextCreateApiLayerInstance(@NotNull PFN_xrCreateApiLayerInstance value) {
        return nextCreateApiLayerInstance(PFN_xrCreateApiLayerInstance.ofNative(value));
    }

    public XrApiLayerNextInfo nextCreateApiLayerInstance(@NotNull Arena arena, @NotNull PFN_xrCreateApiLayerInstance value) {
        return nextCreateApiLayerInstance(PFN_xrCreateApiLayerInstance.ofNative(arena, value));
    }

    public XrApiLayerNextInfo nextCreateApiLayerInstance(@Nullable IPointer pointer) {
        nextCreateApiLayerInstance(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public XrApiLayerNextInfo next(@Nullable IXrApiLayerNextInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        nextRaw(s);
        return this;
    }

    @Unsafe public @Nullable XrApiLayerNextInfo.Ptr next(int assumedCount) {
        MemorySegment s = nextRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * XrApiLayerNextInfo.BYTES);
        return new XrApiLayerNextInfo.Ptr(s);
    }

    public @Nullable XrApiLayerNextInfo next() {
        MemorySegment s = nextRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new XrApiLayerNextInfo(s);
    }

    public @Pointer(target=XrApiLayerNextInfo.class) @NotNull MemorySegment nextRaw() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public void nextRaw(@Pointer(target=XrApiLayerNextInfo.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("structType"),
        ValueLayout.JAVA_INT.withName("structVersion"),
        NativeLayout.C_SIZE_T.withName("structSize"),
        MemoryLayout.sequenceLayout(MAX_API_LAYER_NAME_SIZE, ValueLayout.JAVA_BYTE).withName("layerName"),
        ValueLayout.ADDRESS.withName("nextGetInstanceProcAddr"),
        ValueLayout.ADDRESS.withName("nextCreateApiLayerInstance"),
        ValueLayout.ADDRESS.withName("next")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$structType = PathElement.groupElement("structType");
    public static final PathElement PATH$structVersion = PathElement.groupElement("structVersion");
    public static final PathElement PATH$structSize = PathElement.groupElement("structSize");
    public static final PathElement PATH$layerName = PathElement.groupElement("layerName");
    public static final PathElement PATH$nextGetInstanceProcAddr = PathElement.groupElement("nextGetInstanceProcAddr");
    public static final PathElement PATH$nextCreateApiLayerInstance = PathElement.groupElement("nextCreateApiLayerInstance");
    public static final PathElement PATH$next = PathElement.groupElement("next");

    public static final OfInt LAYOUT$structType = (OfInt) LAYOUT.select(PATH$structType);
    public static final OfInt LAYOUT$structVersion = (OfInt) LAYOUT.select(PATH$structVersion);
    public static final SequenceLayout LAYOUT$layerName = (SequenceLayout) LAYOUT.select(PATH$layerName);
    public static final AddressLayout LAYOUT$nextGetInstanceProcAddr = (AddressLayout) LAYOUT.select(PATH$nextGetInstanceProcAddr);
    public static final AddressLayout LAYOUT$nextCreateApiLayerInstance = (AddressLayout) LAYOUT.select(PATH$nextCreateApiLayerInstance);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);

    public static final long SIZE$structType = LAYOUT$structType.byteSize();
    public static final long SIZE$structVersion = LAYOUT$structVersion.byteSize();
    public static final long SIZE$structSize = NativeLayout.C_SIZE_T.byteSize();
    public static final long SIZE$layerName = LAYOUT$layerName.byteSize();
    public static final long SIZE$nextGetInstanceProcAddr = LAYOUT$nextGetInstanceProcAddr.byteSize();
    public static final long SIZE$nextCreateApiLayerInstance = LAYOUT$nextCreateApiLayerInstance.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();

    public static final long OFFSET$structType = LAYOUT.byteOffset(PATH$structType);
    public static final long OFFSET$structVersion = LAYOUT.byteOffset(PATH$structVersion);
    public static final long OFFSET$structSize = LAYOUT.byteOffset(PATH$structSize);
    public static final long OFFSET$layerName = LAYOUT.byteOffset(PATH$layerName);
    public static final long OFFSET$nextGetInstanceProcAddr = LAYOUT.byteOffset(PATH$nextGetInstanceProcAddr);
    public static final long OFFSET$nextCreateApiLayerInstance = LAYOUT.byteOffset(PATH$nextCreateApiLayerInstance);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
}
