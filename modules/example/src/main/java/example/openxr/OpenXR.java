package example.openxr;

import club.doki7.ffm.annotation.NativeType;
import club.doki7.ffm.library.ISharedLibrary;
import club.doki7.ffm.ptr.BytePtr;
import club.doki7.ffm.ptr.LongPtr;
import club.doki7.ffm.ptr.PointerPtr;
import club.doki7.openxr.XRConstants;
import club.doki7.openxr.XRLoader;
import club.doki7.openxr.XRVersion;
import club.doki7.openxr.command.XR;
import club.doki7.openxr.command.XRStatic;
import club.doki7.openxr.datatype.*;
import club.doki7.openxr.enumtype.*;
import club.doki7.openxr.handle.XrDebugUtilsMessengerEXT;
import club.doki7.openxr.handle.XrInstance;
import club.doki7.openxr.handle.XrSession;
import club.doki7.vulkan.command.VulkanLoader;
import org.intellij.lang.annotations.MagicConstant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.lang.foreign.Arena;
import java.util.Objects;

public final class OpenXR implements OpenXRContext, AutoCloseable {
    private final Arena global = Arena.ofConfined();

    private final @NotNull XRStatic xrStatic;
    private @Nullable XR xr = null;
    private @Nullable XrInstance instance = null;

    private @Nullable XrDebugUtilsMessengerEXT debugUtilsMessenger;

    private @NativeType("XrSystemId") long systemId;
    private @Nullable XrSystemProperties systemProperties;
    private @Nullable GraphicsApi graphicsApi;

    private @Nullable XrSession session;
    private @NativeType("XrSessionState") int sessionState = XrSessionState.UNKNOWN;
    private boolean applicationRunning = true;
    private boolean sessionRunning = false;

    public static void OPENXR_CHECK(int code) {
        OPENXR_CHECK(code, null);
    }

    public static void OPENXR_CHECK(int code, @Nullable String errorMsg) {
        if (code != XrResult.SUCCESS) {
            throw new RuntimeException(XrResult.explain(code) + (errorMsg == null ? "" : (": " + errorMsg)));
        }
    }

    public static void main(String[] args) {
        try (ISharedLibrary libOpenXR = XRLoader.loadXRLibrary();
             var openxr = new OpenXR(libOpenXR)) {
            openxr.createInstance();
            openxr.printInstanceProperties();
            openxr.getSystemProperties();
//            openxr.createDebugMessenger();
            openxr.createSession();

            while (openxr.applicationRunning) {
                openxr.pollSystemEvents();
                openxr.pollEvents();

                if (openxr.sessionRunning) {
                    // Draw Frame
                }
            }
        }
    }

    public OpenXR(@NotNull ISharedLibrary libOpenXR) {
        xrStatic = new XRStatic(libOpenXR);
    }

    public void createInstance() {
        try (var local = Arena.ofConfined()) {
            XrInstanceCreateInfo createInfo = XrInstanceCreateInfo.allocate(local)
                    .applicationInfo(it -> it
                            .applicationName(BytePtr.allocateString(local, "OpenXR Tutorial"))
                            .applicationVersion(1)
                            .engineName(BytePtr.allocateString(local, "Soloviev D30F6"))
                            .engineVersion(1)
                            .apiVersion(XRVersion.XR_API_VERSION_1_0.encode()))
                    .enabledExtensionCount(2)
                    .enabledExtensionNames(PointerPtr.allocateStrings(local, XRConstants.EXT_DEBUG_UTILS_EXTENSION_NAME, XRConstants.KHR_VULKAN_ENABLE_EXTENSION_NAME));

            XrInstance.Ptr pInstance = XrInstance.Ptr.allocate(local);
            OPENXR_CHECK(xrStatic.createInstance(createInfo, pInstance), "Failed to create OpenXR instance");
            this.instance = Objects.requireNonNull(pInstance.read());
            this.xr = XRLoader.loadXR(instance, xrStatic);
            System.err.println("OpenXR instance created successfully: " + instance);
        }
    }

    public void destroyInstance() {
        xr().destroyInstance(instance());
        // TODO: should we unload xr?
//        this.xr = null;
    }

    public void createDebugMessenger() {
        debugUtilsMessenger = OpenXRDebugUtils.createOpenXRDebugUtilsMessenger(this, global);
    }

    public void destroyDebugMessenger() {
        if (debugUtilsMessenger != null) {
            OpenXRDebugUtils.destroyOpenXRDebugUtilsMessenger(this, debugUtilsMessenger);
        }
    }

    public void printInstanceProperties() {
        try (var local = Arena.ofConfined()) {
            var ip = XrInstanceProperties.allocate(local)
                    .type(XrStructureType.INSTANCE_PROPERTIES);

            OPENXR_CHECK(xrStatic.getInstanceProperties(instance(), ip), "Failed to get InstanceProperties.");

            var version = XRVersion.decode(ip.runtimeVersion());
            System.out.println(ip.runtimeName().readString()
                    + "-" + version.major()
                    + "." + version.minor()
                    + "." + version.patch());
        }
    }

    @Override
    public @NotNull XRStatic xrStatic() {
        return xrStatic;
    }

    @Override
    public @NotNull XR xr() {
        return Objects.requireNonNull(xr);
    }

    @Override
    public @NotNull XrInstance instance() {
        return Objects.requireNonNull(instance);

    }

    /// Requires: [#createInstance()]
    public void getSystemProperties() {
        try (var local = Arena.ofConfined()) {
            XrSystemGetInfo systemGI = XrSystemGetInfo.allocate(local)
                    .type(XrStructureType.SYSTEM_GET_INFO)
                    .formFactor(XrFormFactor.HEAD_MOUNTED_DISPLAY);

            var instance = instance();
            var pSystemId = LongPtr.allocate(local);
            OPENXR_CHECK(xrStatic.getSystem(instance, systemGI, pSystemId), "Failed to get SystemId");
            this.systemId = pSystemId.read();
            this.systemProperties = XrSystemProperties.allocate(global);
            OPENXR_CHECK(xrStatic.getSystemProperties(instance, systemId, systemProperties));

            System.out.println("System ID: " + systemId);
            System.out.println("Vendor ID: " + systemProperties.vendorId());
            System.out.println("System Name: " + systemProperties.systemName().readString());
        }
    }

    /// Requires: [#createInstance()], [#getSystemProperties()]
    public void createSession() {
        try (var local = Arena.ofConfined()) {
            this.graphicsApi = new GraphicsApi(VulkanLoader.loadVulkanLibrary(), this, systemId);

            XrSessionCreateInfo sessionCI = XrSessionCreateInfo.allocate(local)
                    .type(XrStructureType.SESSION_CREATE_INFO)
                    .createFlags(0)
                    .systemId(systemId)
                    .next(graphicsApi.getGraphicsBinding());

            var pSession = XrSession.Ptr.allocate(local);
            OPENXR_CHECK(xr().createSession(instance(), sessionCI, pSession), "Failed to create Session.");
            this.session = Objects.requireNonNull(pSession.read());
        }
    }

    public void destroySession() {
        if (session != null) {
            xr().destroySession(this.session);
        }
    }

    public void pollEvents() {
        try (var local = Arena.ofConfined()) {
            var eventData = XrEventDataBuffer.allocate(local);

            while (xr().pollEvent(instance(), eventData) == XrResult.SUCCESS) {
                switch (eventData.type()) {
                    case XrStructureType.EVENT_DATA_EVENTS_LOST -> {
                        var el = new XrEventDataEventsLost(eventData.segment());
                        System.out.println("OPENXR: Events Lost: " + el.lostEventCount());
                    }
                    case XrStructureType.EVENT_DATA_INSTANCE_LOSS_PENDING -> {
                        var ilp = new XrEventDataInstanceLossPending(eventData.segment());
                        System.out.println("OPENXR: Instance Loss Pending: " + ilp.lossTime());
                        sessionRunning = applicationRunning = false;
                    }
                    case XrStructureType.EVENT_DATA_INTERACTION_PROFILE_CHANGED -> {
                        var ipc = new XrEventDataInteractionProfileChanged(eventData.segment());
                        System.out.println("OPENXR: Interaction Profile changed for session: " + Objects.requireNonNull(ipc.session()).segment());        // how to toString
                    }
                    case XrStructureType.EVENT_DATA_REFERENCE_SPACE_CHANGE_PENDING -> {
                        var rscp = new XrEventDataReferenceSpaceChangePending(eventData.segment());
                        System.out.println("OPENXR: Reference Space Change pending for session: " + Objects.requireNonNull(rscp.session()).segment());
                    }
                    case XrStructureType.EVENT_DATA_SESSION_STATE_CHANGED -> {
                        XrEventDataSessionStateChanged ssc = new XrEventDataSessionStateChanged(eventData.segment());
                        var state = ssc.state();

                        // TODO: check if [ssc.session] equals to our [session]
                        switch (state) {
                            case XrSessionState.READY -> {
                                var sessionBI = XrSessionBeginInfo.allocate(local)
                                        .type(XrStructureType.SESSION_BEGIN_INFO)
                                        .primaryViewConfigurationType(XrViewConfigurationType.PRIMARY_STEREO        // this is related with XrFormFactor.HEAD_MOUNTED_DISPLAY
                                        );

                                OPENXR_CHECK(xr().beginSession(Objects.requireNonNull(session), sessionBI), "Failed to begin Session.");
                                sessionRunning = true;
                            }
                            case XrSessionState.STOPPING -> {
                                OPENXR_CHECK(xr().endSession(Objects.requireNonNull(session)), "Failed to end Session.");
                                sessionRunning = false;
                            }
                            case XrSessionState.EXITING -> sessionRunning = applicationRunning = false;
                            // It's possible to try a reestablish an XrInstance and XrSession, but we will simply exit here.
                            case XrSessionState.LOSS_PENDING -> sessionRunning = applicationRunning = false;
                        }

                        this.sessionState = state;
                    }
                }

                eventData = XrEventDataBuffer.allocate(local);      // TODO: we have to "drop" the previous data
            }
        }
    }

    public void pollSystemEvents() {

    }

    @Override
    public void close() {
        destroySession();       // destroy before instance
        destroyDebugMessenger();
        destroyInstance();
    }
}
