package club.doki7.openxr.bitmask;

import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.datatype.*;
import club.doki7.vulkan.enumtype.*;
import club.doki7.vulkan.handle.*;

import club.doki7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrRenderModelFlagsFB.html"><code>XrRenderModelFlagsFB</code></a>
public final class XrRenderModelFlagsFB {
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_RENDER_MODEL_SUPPORTS_GLTF_2_0_SUBSET_1_BIT_FB.html"><code>XR_RENDER_MODEL_SUPPORTS_GLTF_2_0_SUBSET_1_BIT_FB</code></a>
    public static final int SUPPORTS_GLTF_2_0_SUBSET_1 = 0x0;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_RENDER_MODEL_SUPPORTS_GLTF_2_0_SUBSET_2_BIT_FB.html"><code>XR_RENDER_MODEL_SUPPORTS_GLTF_2_0_SUBSET_2_BIT_FB</code></a>
    public static final int SUPPORTS_GLTF_2_0_SUBSET_2 = 0x1;

    public static String explain(@Bitmask(XrRenderModelFlagsFB.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & SUPPORTS_GLTF_2_0_SUBSET_1) != 0) {
            detectedFlagBits.add("XR_RENDER_MODEL_SUPPORTS_GLTF_2_0_SUBSET_1_BIT_FB");
        }
        if ((flags & SUPPORTS_GLTF_2_0_SUBSET_2) != 0) {
            detectedFlagBits.add("XR_RENDER_MODEL_SUPPORTS_GLTF_2_0_SUBSET_2_BIT_FB");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE(" + Integer.toBinaryString(flags) + ")";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrRenderModelFlagsFB() {}
}
