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
import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.datatype.*;
import club.doki7.vulkan.enumtype.*;
import club.doki7.vulkan.handle.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrGraphicsRequirementsD3D12KHR.html"><code>XrGraphicsRequirementsD3D12KHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrGraphicsRequirementsD3D12KHR {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void* next; // @link substring="next" target="#next"
///     LUID adapterLuid; // @link substring="LUID" target="LUID" @link substring="adapterLuid" target="#adapterLuid"
///     D3D_FEATURE_LEVEL minFeatureLevel; // @link substring="minFeatureLevel" target="#minFeatureLevel"
/// } XrGraphicsRequirementsD3D12KHR;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_GRAPHICS_REQUIREMENTS_D3D12_KHR`
///
/// The {@code allocate} ({@link XrGraphicsRequirementsD3D12KHR#allocate(Arena)}, {@link XrGraphicsRequirementsD3D12KHR#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrGraphicsRequirementsD3D12KHR#autoInit}
/// to initialize these fields manually for non-allocated instances.
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrGraphicsRequirementsD3D12KHR.html"><code>XrGraphicsRequirementsD3D12KHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrGraphicsRequirementsD3D12KHR(@NotNull MemorySegment segment) implements IXrGraphicsRequirementsD3D12KHR {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrGraphicsRequirementsD3D12KHR.html"><code>XrGraphicsRequirementsD3D12KHR</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrGraphicsRequirementsD3D12KHR}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrGraphicsRequirementsD3D12KHR to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrGraphicsRequirementsD3D12KHR.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrGraphicsRequirementsD3D12KHR, Iterable<XrGraphicsRequirementsD3D12KHR> {
        public long size() {
            return segment.byteSize() / XrGraphicsRequirementsD3D12KHR.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrGraphicsRequirementsD3D12KHR at(long index) {
            return new XrGraphicsRequirementsD3D12KHR(segment.asSlice(index * XrGraphicsRequirementsD3D12KHR.BYTES, XrGraphicsRequirementsD3D12KHR.BYTES));
        }

        public void at(long index, @NotNull Consumer<@NotNull XrGraphicsRequirementsD3D12KHR> consumer) {
            consumer.accept(at(index));
        }

        public void write(long index, @NotNull XrGraphicsRequirementsD3D12KHR value) {
            MemorySegment s = segment.asSlice(index * XrGraphicsRequirementsD3D12KHR.BYTES, XrGraphicsRequirementsD3D12KHR.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrGraphicsRequirementsD3D12KHR.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrGraphicsRequirementsD3D12KHR.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrGraphicsRequirementsD3D12KHR.BYTES,
                (end - start) * XrGraphicsRequirementsD3D12KHR.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrGraphicsRequirementsD3D12KHR.BYTES));
        }

        public XrGraphicsRequirementsD3D12KHR[] toArray() {
            XrGraphicsRequirementsD3D12KHR[] ret = new XrGraphicsRequirementsD3D12KHR[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrGraphicsRequirementsD3D12KHR> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrGraphicsRequirementsD3D12KHR> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrGraphicsRequirementsD3D12KHR.BYTES;
            }

            @Override
            public XrGraphicsRequirementsD3D12KHR next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrGraphicsRequirementsD3D12KHR ret = new XrGraphicsRequirementsD3D12KHR(segment.asSlice(0, XrGraphicsRequirementsD3D12KHR.BYTES));
                segment = segment.asSlice(XrGraphicsRequirementsD3D12KHR.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrGraphicsRequirementsD3D12KHR allocate(Arena arena) {
        XrGraphicsRequirementsD3D12KHR ret = new XrGraphicsRequirementsD3D12KHR(arena.allocate(LAYOUT));
        ret.type(XrStructureType.GRAPHICS_REQUIREMENTS_D3D12_KHR);
        return ret;
    }

    public static XrGraphicsRequirementsD3D12KHR.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrGraphicsRequirementsD3D12KHR.Ptr ret = new XrGraphicsRequirementsD3D12KHR.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.GRAPHICS_REQUIREMENTS_D3D12_KHR);
        }
        return ret;
    }

    public static XrGraphicsRequirementsD3D12KHR clone(Arena arena, XrGraphicsRequirementsD3D12KHR src) {
        XrGraphicsRequirementsD3D12KHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.GRAPHICS_REQUIREMENTS_D3D12_KHR);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrGraphicsRequirementsD3D12KHR type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrGraphicsRequirementsD3D12KHR next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrGraphicsRequirementsD3D12KHR next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @NotNull LUID adapterLuid() {
        return new LUID(segment.asSlice(OFFSET$adapterLuid, LAYOUT$adapterLuid));
    }

    public XrGraphicsRequirementsD3D12KHR adapterLuid(@NotNull LUID value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$adapterLuid, SIZE$adapterLuid);
        return this;
    }

    public XrGraphicsRequirementsD3D12KHR adapterLuid(Consumer<@NotNull LUID> consumer) {
        consumer.accept(adapterLuid());
        return this;
    }

    public @NativeType("D3D_FEATURE_LEVEL") @Unsigned int minFeatureLevel() {
        return segment.get(LAYOUT$minFeatureLevel, OFFSET$minFeatureLevel);
    }

    public XrGraphicsRequirementsD3D12KHR minFeatureLevel(@NativeType("D3D_FEATURE_LEVEL") @Unsigned int value) {
        segment.set(LAYOUT$minFeatureLevel, OFFSET$minFeatureLevel, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        LUID.LAYOUT.withName("adapterLuid"),
        ValueLayout.JAVA_INT.withName("minFeatureLevel")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$adapterLuid = PathElement.groupElement("adapterLuid");
    public static final PathElement PATH$minFeatureLevel = PathElement.groupElement("minFeatureLevel");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final StructLayout LAYOUT$adapterLuid = (StructLayout) LAYOUT.select(PATH$adapterLuid);
    public static final OfInt LAYOUT$minFeatureLevel = (OfInt) LAYOUT.select(PATH$minFeatureLevel);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$adapterLuid = LAYOUT$adapterLuid.byteSize();
    public static final long SIZE$minFeatureLevel = LAYOUT$minFeatureLevel.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$adapterLuid = LAYOUT.byteOffset(PATH$adapterLuid);
    public static final long OFFSET$minFeatureLevel = LAYOUT.byteOffset(PATH$minFeatureLevel);
}
