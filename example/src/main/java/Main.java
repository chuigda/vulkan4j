import tech.icey.glfwmini.LibGLFW;
import tech.icey.vk4j.Loader;
import tech.icey.vk4j.command.StaticCommands;

import javax.swing.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        if (!loadLibraries()) {
            return;
        }

        LibGLFW libGLFW = initGLFW();
        if (libGLFW == null) {
            return;
        }

        var staticCommands = new StaticCommands(Loader::loadFunctionOrNull);
        var entryCommands = new StaticCommands(Loader::loadFunctionOrNull);

        var deviceInfoDialog = new DeviceInfoDialog(List.of(
                new DeviceInfo("Device A", "南去经三国，东来过五湖"),
                new DeviceInfo("Device B", "三万里河入东海，五千仞岳上摩天")
        ));
        deviceInfoDialog.setVisible(true);

        System.err.println("设备选择完成");
        libGLFW.glfwTerminate();

        System.exit(0);
    }

    private static boolean loadLibraries() {
        try {
            if (System.getProperty("os.name").toLowerCase().contains("windows")) {
                System.loadLibrary("glfw3");
            }
            else {
                System.loadLibrary("glfw");
            }
        }
        catch (Throwable throwable) {
            showErrorMessage("加载 GLFW 库失败: " + throwable.getMessage());
            return false;
        }

        try {
            if (System.getProperty("os.name").toLowerCase().contains("windows")) {
                System.loadLibrary("vulkan-1");
            }
            else {
                System.loadLibrary("vulkan");
            }
        }
        catch (Throwable throwable) {
            showErrorMessage("加载 Vulkan 库失败: " + throwable.getMessage());
            return false;
        }

        return true;
    }

    private static LibGLFW initGLFW() {
        try {
            LibGLFW libGLFW = new LibGLFW(Loader::loadFunction);

            if (libGLFW.glfwInit() == 0) {
                showErrorMessage("初始化 GLFW 失败");
                return null;
            }

            if (libGLFW.glfwVulkanSupported() == 0) {
                showErrorMessage("当前系统上的 GLFW 安装不支持 Vulkan");
                return null;
            }

            return libGLFW;
        } catch (RuntimeException e) {
            showErrorMessage("加载 GLFW 库中的函数失败: " + e.getMessage());
            return null;
        }
    }

    private static void showErrorMessage(String errorMessage) {
        JOptionPane.showMessageDialog(
                null,
                "<html><body><p style=\"width: 300px;\">" + errorMessage + "</p></body></html>",
                "错误",
                JOptionPane.ERROR_MESSAGE
        );
    }
}
