package example.openxr;

import club.doki7.ffm.RawFunctionLoader;
import club.doki7.ffm.annotation.Unsigned;
import club.doki7.ffm.ptr.BytePtr;
import club.doki7.ffm.ptr.IntPtr;
import club.doki7.ffm.ptr.LongPtr;
import club.doki7.ffm.ptr.PointerPtr;
import club.doki7.openxr.XR;
import club.doki7.openxr.XRConstants;
import club.doki7.openxr.XRVersion;
import club.doki7.openxr.datatype.*;
import club.doki7.openxr.enumtype.XrFormFactor;
import club.doki7.openxr.enumtype.XrResult;
import club.doki7.openxr.enumtype.XrStructureType;
import club.doki7.openxr.handle.XrDebugUtilsMessengerEXT;
import club.doki7.openxr.handle.XrInstance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.UnknownNullability;

import java.lang.foreign.Arena;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class OpenXRTutorial implements AutoCloseable {
    public static void OPENXR_CHECK(int code, @NotNull String errorMsg) {
        if (code != XrResult.SUCCESS) {
            throw new IllegalStateException("Error(" + code + "): " + errorMsg);
        }
    }

    private final Arena arena = Arena.ofAuto();
    private @UnknownNullability XrInstance instance;
    private final @NotNull List<String> apiLayers = new ArrayList<>();
    private final @NotNull List<String> activeApiLayers = new ArrayList<>();
    private final @NotNull List<String> instanceExtensions = new ArrayList<>();
    private final @NotNull List<String> activeInstanceExtensions = new ArrayList<>();
    private @UnknownNullability XrDebugUtilsMessengerEXT debugUtilsMessenger;
    private @Unsigned long systemId;
    private final @NotNull XrSystemProperties systemProperties;
    private final @NotNull XR xr;

    public OpenXRTutorial(RawFunctionLoader rfl) {
        xr = new XR(rfl);
        systemProperties = XrSystemProperties.allocate(arena);
    }

    private void createInstance() {
        try (var local = Arena.ofConfined()) {
            var ai = XrApplicationInfo.allocate(arena);
            ai.applicationName(BytePtr.allocateString(local, "OpenXR Tutorial"));
            ai.applicationVersion(1);
            ai.engineName(BytePtr.allocateString(local, "OpenXR Engine"));
            ai.engineVersion(1);
            ai.apiVersion(XRVersion.XR_CURRENT_API_VERSION.encode());

            var apiLayerCountRaw = IntPtr.allocate(local);
            OPENXR_CHECK(
                    xr.xrEnumerateApiLayerProperties(0, apiLayerCountRaw, null),
                    "Failed to enumerate ApiLayerProperties."
            );

            var apiLayerCount = apiLayerCountRaw.read();
            var apiLayerPropertiesRaw = XrApiLayerProperties.allocate(local, apiLayerCount);
            // I am not sure if we have to pass "apiLayerCountRaw" as we obtained already.
            OPENXR_CHECK(
                    xr.xrEnumerateApiLayerProperties(apiLayerCount, apiLayerCountRaw, apiLayerPropertiesRaw),
                    "Failed to enumerate ApiLayerProperties."
            );

            // Check the requested API layers against the ones from the OpenXR. If found add it to the Active API Layers.
            for (var layerProperty : apiLayerPropertiesRaw) {
                var layerName = layerProperty.layerName().readString();
                if (apiLayers.contains(layerName)) {
                    activeApiLayers.add(layerName);
                }
            }

            var extensionCountRaw = IntPtr.allocate(local);
            OPENXR_CHECK(
                    xr.xrEnumerateInstanceExtensionProperties(null, 0, extensionCountRaw, null),
                    "Failed to enumerate InstanceExtensionProperties."
            );

            var extensionCount = extensionCountRaw.read();
            var extensionPropertiesRaw = XrExtensionProperties.allocate(arena, extensionCount);
            OPENXR_CHECK(
                    xr.xrEnumerateInstanceExtensionProperties(null, extensionCount, extensionCountRaw, extensionPropertiesRaw),
                    "Failed to enumerate InstanceExtensionProperties."
            );

            // Check the requested Instance Extensions against the ones from the OpenXR runtime.
            // If an extension is found add it to Active Instance Extensions.
            // Log error if the Instance Extension is not found.
            for (var requestedInstanceExtension : instanceExtensions) {
                var maybeExtensionProperty = StreamSupport.stream(extensionPropertiesRaw.spliterator(), false)
                        .filter(it -> requestedInstanceExtension.equals(it.extensionName().readString()))
                        .findFirst()
                        .orElse(null);

                if (maybeExtensionProperty == null) {
                    throw new IllegalStateException("Failed to find OpenXR instance extension: " + requestedInstanceExtension);
                } else {
                    activeInstanceExtensions.add(requestedInstanceExtension);
                }
            }

            var activeApiLayersRaw = PointerPtr.allocate(local, activeApiLayers.size());
            for (int i = 0; i < activeApiLayers.size(); i++) {
                activeApiLayersRaw.write(i, BytePtr.allocateString(local, activeApiLayers.get(i)));
            }

            var activeInstanceExtensionsRaw = PointerPtr.allocate(local, activeInstanceExtensions.size());
            for (int i = 0; i < activeInstanceExtensions.size(); i++) {
                activeInstanceExtensionsRaw.write(i, BytePtr.allocateString(local, activeInstanceExtensions.get(i)));
            }

            var instanceCI = XrInstanceCreateInfo.allocate(local);
            instanceCI.type(XrStructureType.INSTANCE_CREATE_INFO);
            instanceCI.createFlags(0);
            instanceCI.applicationInfo(ai);
            instanceCI.enabledApiLayerCount(activeApiLayers.size());
            instanceCI.enabledApiLayerNames(activeApiLayersRaw);      // TODO
            instanceCI.enabledExtensionCount(activeInstanceExtensions.size());
            instanceCI.enabledExtensionNames(activeInstanceExtensionsRaw);     // TODO
            var instancePtr = XrInstance.Ptr.allocate(local);
            OPENXR_CHECK(xr.xrCreateInstance(instanceCI, instancePtr), "Failed to create Instance.");
            this.instance = instancePtr.read();
        }
    }

    public void destroyInstance() {
        OPENXR_CHECK(xr.xrDestroyInstance(instance), "Failed to destroy Instance.");
    }

    public void getInstanceProperties() {
        try (var local = Arena.ofConfined()) {
            var ip = XrInstanceProperties.allocate(local);
            ip.type(XrStructureType.INSTANCE_PROPERTIES);
            OPENXR_CHECK(xr.xrGetInstanceProperties(instance, ip), "Failed to get InstanceProperties.");

            var version = XRVersion.decode(ip.runtimeVersion());

            System.out.println("OpenXR Runtime: "
                    + ip.runtimeName().readString() + "-"
                    + version.major() + "." + version.minor() + "." + version.patch());
        }
    }

    public void createDebugMessenger() {
        if (activeInstanceExtensions.contains(XRConstants.EXT_DEBUG_UTILS_EXTENSION_NAME)) {

        }
    }

    public void destroyDebugMessenger() {

    }

    public void getSystemId() {
        try (var local = Arena.ofConfined()) {
            // Get the XrSystemId from the instance and the supplied XrFormFactor.
            var systemGI = XrSystemGetInfo.allocate(local);
            systemGI.type(XrStructureType.SYSTEM_GET_INFO);
            systemGI.formFactor(XrFormFactor.HEAD_MOUNTED_DISPLAY);
            var systemIdRaw = LongPtr.allocate(local);
            OPENXR_CHECK(xr.xrGetSystem(instance, systemGI, systemIdRaw), "Failed to get SystemID.");

            this.systemId = systemIdRaw.read();
            // Get the System's properties for some general information about the hardware and the vendor.
            OPENXR_CHECK(xr.xrGetSystemProperties(instance, systemId, systemProperties), "Failed to get SystemProperties.");
        }
    }

    @Override
    public void close() {
        arena.close();
    }
}
