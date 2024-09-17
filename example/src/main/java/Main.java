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

        LibGLFW libGLFW = loadGLFW();
        if (libGLFW == null) {
            return;
        }

        var staticCommands = new StaticCommands(Loader::loadFunctionOrNull);
        var entryCommands = new StaticCommands(Loader::loadFunctionOrNull);

        var deviceInfoDialog = new DeviceInfoDialog(List.of(
                new DeviceInfo("Device A", "南去经三国，东来过五湖"),
                new DeviceInfo("Device B", "南去经三国，东来过五湖")
        ));
        deviceInfoDialog.setVisible(true);

        System.err.println("设备选择完成");
        libGLFW.glfwTerminate();

        System.exit(0);
    }

    private static boolean loadLibraries() {
        try {
            System.loadLibrary("glfw");
        }
        catch (Throwable throwable) {
            JOptionPane.showMessageDialog(
                    null,
                    "加载 glfw 库失败:\n" + throwable.getMessage(),
                    "错误",
                    JOptionPane.ERROR_MESSAGE
            );
            return false;
        }

        try {
            if (System.getProperty("os.name").toLowerCase().contains("windows")) {
                System.loadLibrary("vulkan-1");
            } else {
                System.loadLibrary("vulkan");
            }
        }
        catch (Throwable throwable) {
            JOptionPane.showMessageDialog(
                    null,
                    "加载 vulkan 库失败:\n" + throwable.getMessage(),
                    "错误",
                    JOptionPane.ERROR_MESSAGE
            );
            return false;
        }

        return true;
    }

    private static LibGLFW loadGLFW() {
        try {
            LibGLFW libGLFW = new LibGLFW(Loader::loadFunction);

            if (libGLFW.glfwInit() == 0) {
                JOptionPane.showMessageDialog(
                        null,
                        "初始化 GLFW 失败",
                        "错误",
                        JOptionPane.ERROR_MESSAGE
                );
                return null;
            }

            if (libGLFW.glfwVulkanSupported() == 0) {
                JOptionPane.showMessageDialog(
                        null,
                        "GLFW 不支持 Vulkan",
                        "错误",
                        JOptionPane.ERROR_MESSAGE
                );
                return null;
            }

            return libGLFW;
        } catch (RuntimeException e) {
            JOptionPane.showMessageDialog(
                    null,
                    "加载 glfw 库中的函数失败:\n" + e.getMessage(),
                    "错误",
                    JOptionPane.ERROR_MESSAGE
            );
            return null;
        }
    }
}
