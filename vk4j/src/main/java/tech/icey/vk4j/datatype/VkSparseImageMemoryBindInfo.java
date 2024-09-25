package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkSparseImageMemoryBindInfo(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withName("image"),
        ValueLayout.JAVA_INT.withName("bindCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkSparseImageMemoryBind.LAYOUT).withName("pBinds")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$image = PathElement.groupElement("image");
    public static final PathElement PATH$bindCount = PathElement.groupElement("bindCount");
    public static final PathElement PATH$pBinds = PathElement.groupElement("pBinds");

    public static final AddressLayout LAYOUT$image = (AddressLayout) LAYOUT.select(PATH$image);
    public static final OfInt LAYOUT$bindCount = (OfInt) LAYOUT.select(PATH$bindCount);
    public static final AddressLayout LAYOUT$pBinds = (AddressLayout) LAYOUT.select(PATH$pBinds);

    public static final long OFFSET$image = LAYOUT.byteOffset(PATH$image);
    public static final long OFFSET$bindCount = LAYOUT.byteOffset(PATH$bindCount);
    public static final long OFFSET$pBinds = LAYOUT.byteOffset(PATH$pBinds);

    public static final long SIZE$image = LAYOUT$image.byteSize();
    public static final long SIZE$bindCount = LAYOUT$bindCount.byteSize();
    public static final long SIZE$pBinds = LAYOUT$pBinds.byteSize();

    public VkSparseImageMemoryBindInfo(MemorySegment segment) {
        this.segment = segment;
    }

    public VkImage image() {
        return new VkImage(segment.get(LAYOUT$image, OFFSET$image));
    }

    public void image(VkImage value) {
        segment.set(LAYOUT$image, OFFSET$image, value.segment());
    }

    public @unsigned int bindCount() {
        return segment.get(LAYOUT$bindCount, OFFSET$bindCount);
    }

    public void bindCount(@unsigned int value) {
        segment.set(LAYOUT$bindCount, OFFSET$bindCount, value);
    }

    public @pointer(comment="VkSparseImageMemoryBind*") MemorySegment pBindsRaw() {
        return segment.get(LAYOUT$pBinds, OFFSET$pBinds);
    }

    public void pBindsRaw(@pointer(comment="VkSparseImageMemoryBind*") MemorySegment value) {
        segment.set(LAYOUT$pBinds, OFFSET$pBinds, value);
    }
    
    public @nullable VkSparseImageMemoryBind pBinds() {
        MemorySegment s = pBindsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkSparseImageMemoryBind(s);
    }

    public void pBinds(@nullable VkSparseImageMemoryBind value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pBindsRaw(s);
    }

    public static VkSparseImageMemoryBindInfo allocate(Arena arena) {
        return new VkSparseImageMemoryBindInfo(arena.allocate(LAYOUT));
    }
    
    public static VkSparseImageMemoryBindInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkSparseImageMemoryBindInfo[] ret = new VkSparseImageMemoryBindInfo[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkSparseImageMemoryBindInfo(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
